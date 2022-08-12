package school.mjc.stage0.loops.task3;

/**
 * Write a program that will display the first n terms of Fibonacci series, each on new line:
 */

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prev = 0;
        int current = 1;
        System.out.println(prev);
        System.out.println(current);
        for (int i = 2; i < lastFibonacci; i++) {
            current += prev;
            prev = current - prev;
            System.out.println(current);
        }
    }
}
