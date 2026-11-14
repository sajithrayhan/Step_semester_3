package linked_lists_and_stacks.class_problems;

import java.util.Scanner;

/**
 * Problem 1: Campus Staff Salary.
 *
 * <p>Staff holds the common data and a bonus of 0. Teacher and LabAssistant override getBonus().
 * Everyone is stored in one Staff[] array and printed in a single loop with no type checks.
 *
 * <p>Complexity: printing all salaries is O(n) time, where n is the number of staff.
 */
public class CampusStaffSalary {

    static class Staff {
        protected final String name;
        protected final double baseSalary;

        Staff(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        String getType() {
            return "Staff";
        }

        double getBonus() {
            return 0;
        }

        double getTotal() {
            return baseSalary + getBonus();
        }
    }

    static class Teacher extends Staff {
        Teacher(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        String getType() {
            return "Teacher";
        }

        @Override
        double getBonus() {
            return 5000;
        }
    }

    static class LabAssistant extends Staff {
        LabAssistant(String name, double baseSalary) {
            super(name, baseSalary);
        }

        @Override
        String getType() {
            return "LabAssistant";
        }

        @Override
        double getBonus() {
            return 2000;
        }
    }

    static Staff create(String type, String name, double baseSalary) {
        switch (type) {
            case "Teacher":      return new Teacher(name, baseSalary);
            case "LabAssistant": return new LabAssistant(name, baseSalary);
            default:             return new Staff(name, baseSalary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Staff[] staff = new Staff[count];
        for (int i = 0; i < count; i++) {
            staff[i] = create(scanner.next(), scanner.next(), scanner.nextDouble());
        }

        double grandTotal = 0;
        for (Staff person : staff) {
            System.out.println(person.name + " (" + person.getType() + "): base " + person.baseSalary
                    + ", bonus " + person.getBonus() + ", total " + person.getTotal());
            grandTotal += person.getTotal();
        }
        System.out.println("Grand Total Salary: " + grandTotal);
    }
}
