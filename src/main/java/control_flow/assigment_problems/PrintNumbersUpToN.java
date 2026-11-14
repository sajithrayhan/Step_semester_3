package control_flow.assigment_problems;

/**
 * Problem 3: Print Numbers 1 to N.
 *
 * <p>A for loop starts its counter at 1 and runs while the counter is less than or equal to N,
 * printing each number on its own line.
 */
public class PrintNumbersUpToN {

    static void printNumbersUpToN(int n) {
        for (int counter = 1; counter <= n; counter++) {
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        printNumbersUpToN(5);   // 1 2 3 4 5, one per line
    }
}
