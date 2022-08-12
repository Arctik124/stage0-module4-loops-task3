package school.mjc.stage0.loops.task3;

/**
 * Write a program that will display the sum of the series [ 9 + 99 + 999 + 9999 ... n].
 * Where n is a number passed as a method argument, n is the last number which consists of "9" n times:
 */
public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int current = 0;
        int multiplicative = 1;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            current += 9 * multiplicative;
            sum += current;
            multiplicative *= 10;
        }
        System.out.println(sum);

    }
}
