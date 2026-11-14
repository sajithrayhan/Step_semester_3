package control_flow.assigment_problems;

/**
 * Problem 4: Sum of Natural Numbers Using a While Loop.
 *
 * <p>A while loop adds every natural number from 1 up to N and the total is printed.
 */
public class SumOfNaturalNumbers {

    static int sumUpToN(int n) {
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumUpToN(5));    // 15
        System.out.println(sumUpToN(10));   // 55
    }
}
