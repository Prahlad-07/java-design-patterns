package structural.proxy.smart_proxy;

import java.util.HashMap;
import java.util.Map;

class SmartMathServiceProxy implements MathService {
    private final RealMathService realMathService;
    private final Map<Integer, Long> cache; // Cache to store computed factorials

    public SmartMathServiceProxy() {
        this.realMathService = new RealMathService();
        this.cache = new HashMap<>();
    }

    @Override
    public long computeFactorial(int number) {
        // Check if the result is already in the cache
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result for " + number + ": " + cache.get(number));
            return cache.get(number);
        }

        // Compute the factorial using the real object
        long result = realMathService.computeFactorial(number);

        // Cache the result for future use
        cache.put(number, result);
        return result;
    }
}