package school.mjc.stage0.loops.task3;

/**
 * Write a program that will print the Greatest Common Divisor (GCD) of two numbers given as method arguments:
 */

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first % second == 0) {
            System.out.println(second);
            return;
        }
        if (second % first == 0) {
            System.out.println(first);
            return;
        }
        for (int i = first > second ? second : first; i > 0; i--) {
            if (first % i == 0 && second % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
