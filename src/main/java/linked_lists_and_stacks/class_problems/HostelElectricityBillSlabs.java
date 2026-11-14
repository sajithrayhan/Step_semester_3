package linked_lists_and_stacks.class_problems;

import java.util.Scanner;

/**
 * Problem 6: Hostel Electricity Bill.
 *
 * <p>Slabs: the first 100 units cost 3 each, the next 100 cost 5 each, and every unit above 200
 * costs 8. A fixed meter charge of 50 is added to every bill. A negative reading is invalid and the
 * room is not billed.
 *
 * <p>Complexity: billing all rooms is O(n) time and O(1) additional space.
 */
public class HostelElectricityBillSlabs {

    private static final int FIRST_SLAB_LIMIT = 100;
    private static final int SECOND_SLAB_LIMIT = 200;
    private static final int FIRST_RATE = 3;
    private static final int SECOND_RATE = 5;
    private static final int THIRD_RATE = 8;
    private static final int METER_CHARGE = 50;

    static int bill(int units) {
        int charge;
        if (units <= FIRST_SLAB_LIMIT) {
            charge = units * FIRST_RATE;
        } else if (units <= SECOND_SLAB_LIMIT) {
            charge = FIRST_SLAB_LIMIT * FIRST_RATE + (units - FIRST_SLAB_LIMIT) * SECOND_RATE;
        } else {
            charge = FIRST_SLAB_LIMIT * FIRST_RATE
                    + (SECOND_SLAB_LIMIT - FIRST_SLAB_LIMIT) * SECOND_RATE
                    + (units - SECOND_SLAB_LIMIT) * THIRD_RATE;
        }
        return charge + METER_CHARGE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rooms = scanner.nextInt();
        int billed = 0;
        long total = 0;
        for (int i = 0; i < rooms; i++) {
            String room = scanner.next();
            int units = scanner.nextInt();
            if (units < 0) {
                System.out.println(room + ": invalid reading");
                continue;
            }
            int amount = bill(units);
            System.out.println(room + ": " + units + " units, bill " + amount);
            billed++;
            total += amount;
        }
        System.out.println("Rooms billed " + billed + ", total " + total);
    }
}
