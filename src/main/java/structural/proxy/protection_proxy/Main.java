package structural.proxy.protection_proxy;

public class Main {
    public static void main(String[] args) {
        // Create a proxy for a bank account with ADMIN access
        BankAccount adminAccount = new ProxyBankAccount(1000, "ADMIN");

        // Perform operations as ADMIN
        System.out.println("Admin operations:");
        adminAccount.deposit(500);
        adminAccount.withdraw(200);
        System.out.println("Admin balance: $" + adminAccount.getBalance());

        // Create a proxy for a bank account with USER access
        BankAccount userAccount = new ProxyBankAccount(1000, "USER");

        // Perform operations as USER (access will be denied)
        System.out.println("\nUser operations:");
        try {
            userAccount.deposit(300);
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
        try {
            userAccount.withdraw(100);
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("User balance: $" + userAccount.getBalance());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}
