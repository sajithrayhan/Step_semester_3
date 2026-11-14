package linked_lists_and_stacks.class_problems;

import java.util.Scanner;

/**
 * Problem 4: Payment Processing.
 *
 * <p>Each payment mode implements the PaymentMode interface and works out its own fee. All payments
 * are stored in one PaymentMode[] array, and the loop only calls interface methods without checking
 * the type of any element.
 *
 * <p>Complexity: processing all payments is O(n) time.
 */
public class PaymentProcessing {

    interface PaymentMode {
        String label();

        double getFee(double amount);

        /** Returns the amount processed: the original amount plus the fee. */
        double processPayment(double amount);
    }

    static class CashPayment implements PaymentMode {
        @Override
        public String label() {
            return "Cash";
        }

        @Override
        public double getFee(double amount) {
            return 0;
        }

        @Override
        public double processPayment(double amount) {
            return amount + getFee(amount);
        }
    }

    static class CardPayment implements PaymentMode {
        private static final double FEE_RATE = 0.02;

        @Override
        public String label() {
            return "Card";
        }

        @Override
        public double getFee(double amount) {
            return amount * FEE_RATE;
        }

        @Override
        public double processPayment(double amount) {
            return amount + getFee(amount);
        }
    }

    static class UpiPayment implements PaymentMode {
        @Override
        public String label() {
            return "UPI";
        }

        @Override
        public double getFee(double amount) {
            return 0;
        }

        @Override
        public double processPayment(double amount) {
            return amount + getFee(amount);
        }
    }

    static PaymentMode create(String mode) {
        switch (mode.toLowerCase()) {
            case "cash": return new CashPayment();
            case "card": return new CardPayment();
            case "upi":  return new UpiPayment();
            default: throw new IllegalArgumentException("Unknown payment mode: " + mode);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        PaymentMode[] payments = new PaymentMode[count];
        double[] amounts = new double[count];
        for (int i = 0; i < count; i++) {
            payments[i] = create(scanner.next());
            amounts[i] = scanner.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < count; i++) {
            double processed = payments[i].processPayment(amounts[i]);
            System.out.println(payments[i].label() + ": amount " + amounts[i]
                    + ", fee " + payments[i].getFee(amounts[i]) + ", processed " + processed);
            total += processed;
        }
        System.out.println("Total Amount Processed: " + total);
    }
}
