package structural.proxy.protection_proxy;

class ProxyBankAccount implements BankAccount {
    private RealBankAccount realBankAccount;
    private String userRole;
    private double initialBalance;

    public ProxyBankAccount(double initialBalance, String userRole) {
        this.initialBalance = initialBalance;
        this.userRole = userRole;
    }

    private void checkAccess() {
        if (!userRole.equals("ADMIN")) {
            throw new SecurityException("Access denied! You do not have permission to perform this operation.");
        }
    }

    private void logOperation(String operation, double amount) {
        System.out.println("Log: User with role '" + userRole + "' performed '" + operation + "' of $" + amount);
    }

    @Override
    public void deposit(double amount) {
        checkAccess(); // Check if the user has permission
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(initialBalance); // Lazy initialization
        }
        realBankAccount.deposit(amount);
        logOperation("deposit", amount); // Log the operation
    }

    @Override
    public void withdraw(double amount) {
        checkAccess(); // Check if the user has permission
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(initialBalance); // Lazy initialization
        }
        realBankAccount.withdraw(amount);
        logOperation("withdraw", amount); // Log the operation
    }

    @Override
    public double getBalance() {
        checkAccess(); // Check if the user has permission
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(initialBalance); // Lazy initialization
        }
        double balance = realBankAccount.getBalance();
        logOperation("getBalance", balance); // Log the operation
        return balance;
    }
}

