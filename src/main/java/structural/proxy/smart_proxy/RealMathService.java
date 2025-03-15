package structural.proxy.smart_proxy;

class RealMathService implements MathService {
    @Override
    public long computeFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.println("Computed factorial of " + number + ": " + result);
        return result;
    }
}
