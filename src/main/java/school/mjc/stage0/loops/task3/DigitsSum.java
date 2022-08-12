package school.mjc.stage0.loops.task3;

/**
 * Write a program that will find the sum of digits of a given number passed as a method argument. There are some tips:
 * if you concatenate int with string you will be able to use string.length() and iterate till the end. you shouldn't
 * use other String methods, but length:
 */
public class DigitsSum {
    public void printDigitsSum(int t) {
        String num = t + "";
        int sum = 0;
        int digit;
        int divisor;
        if (t < 0) {
            t = -t;
        }
        for (int i = num.length(); i > 0; i--) {
            divisor = 10;
            for (int j = 1; j < i; j++) {
                divisor *= 10;
            }
            digit = t / divisor;
            t -= digit * divisor;
            sum += digit;
        }
        sum += t;
        System.out.println(sum);
    }
}
