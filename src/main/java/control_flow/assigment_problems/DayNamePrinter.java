package control_flow.assigment_problems;

/**
 * Problem 5: Day Name Using a Switch.
 *
 * <p>A switch statement has one case per day number and prints the matching day name. Every case
 * ends with break so execution does not fall through into the next one, and the default case prints
 * "Invalid day number" for anything outside 1 to 7.
 */
public class DayNamePrinter {

    static void printDayName(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }

    public static void main(String[] args) {
        printDayName(3);   // Wednesday
        printDayName(9);   // Invalid day number
    }
}
