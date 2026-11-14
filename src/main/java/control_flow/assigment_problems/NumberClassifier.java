package control_flow.assigment_problems;

/**
 * Problem 2: Positive, Negative, or Zero Classifier.
 *
 * <p>An if / else if / else ladder checks whether the number is greater than 0, less than 0, or
 * equal to 0.
 */
public class NumberClassifier {

    static void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        classifyNumber(7);    // Positive
        classifyNumber(-3);   // Negative
        classifyNumber(0);    // Zero
    }
}
