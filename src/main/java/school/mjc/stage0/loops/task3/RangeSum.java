package school.mjc.stage0.loops.task3;

/**
 * Write a program that will print the sum between numbers given as method arguments:
 */
public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
