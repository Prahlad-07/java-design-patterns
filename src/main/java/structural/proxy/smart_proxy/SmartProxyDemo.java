package structural.proxy.smart_proxy;

public class SmartProxyDemo {
    public static void main(String[] args) {
        // Create the smart proxy
        MathService mathService = new SmartMathServiceProxy();

        // First call (computes and caches the result)
        System.out.println("First call:");
        long result1 = mathService.computeFactorial(5); // Computes and caches
        System.out.println("Result: " + result1);

        // Second call (returns cached result)
        System.out.println("\nSecond call:");
        long result2 = mathService.computeFactorial(5); // Returns cached result
        System.out.println("Result: " + result2);

        // Third call (computes and caches a new result)
        System.out.println("\nThird call:");
        long result3 = mathService.computeFactorial(10); // Computes and caches
        System.out.println("Result: " + result3);
    }
}