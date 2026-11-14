package linked_lists_and_stacks.class_problems;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problem 2: Class Report Card.
 *
 * <p>Marks are set only through setMarks(), which rejects any mark outside 0 to 100. Accepted
 * students are ranked by total with a bubble sort that stops early when a pass makes no swap, and
 * the number of passes is reported.
 *
 * <p>Complexity of the sort: best case O(n) (already ordered, one pass), worst case O(n squared).
 */
public class ClassReportCard {

    static class Student {
        private final String name;
        private int markA;
        private int markB;
        private int markC;

        Student(String name) {
            this.name = name;
        }

        /** Accepts marks from 0 to 100 only; returns false and changes nothing otherwise. */
        boolean setMarks(int a, int b, int c) {
            if (!valid(a) || !valid(b) || !valid(c)) {
                return false;
            }
            this.markA = a;
            this.markB = b;
            this.markC = c;
            return true;
        }

        private static boolean valid(int mark) {
            return mark >= 0 && mark <= 100;
        }

        String getName() {
            return name;
        }

        int total() {
            return markA + markB + markC;
        }

        double average() {
            return total() / 3.0;
        }

        char grade() {
            double average = average();
            if (average >= 80) {
                return 'A';
            } else if (average >= 70) {
                return 'B';
            } else if (average >= 60) {
                return 'C';
            } else if (average >= 40) {
                return 'D';
            } else {
                return 'F';
            }
        }

        @Override
        public String toString() {
            return String.format(Locale.US, "%s total=%d avg=%.2f grade=%c", name, total(), average(), grade());
        }
    }

    /** Sorts by total, highest first, and returns the number of passes made. */
    static int bubbleSortByTotalDescending(Student[] students, int count) {
        int passes = 0;
        for (int pass = 1; pass < count; pass++) {
            boolean swapped = false;
            for (int j = 0; j < count - 1; j++) {
                if (students[j].total() < students[j + 1].total()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
            if (!swapped) {
                break;
            }
        }
        return passes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] accepted = new Student[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            Student student = new Student(scanner.next());
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (student.setMarks(a, b, c)) {
                accepted[count++] = student;
            } else {
                System.out.println(student.getName() + " skipped: marks must be 0 to 100");
            }
        }

        int passes = bubbleSortByTotalDescending(accepted, count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + accepted[i]);
        }
        System.out.println("Sorted in " + passes + " passes");
    }
}
