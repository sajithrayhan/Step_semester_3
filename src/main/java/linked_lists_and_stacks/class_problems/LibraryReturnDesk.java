package linked_lists_and_stacks.class_problems;

import java.util.Scanner;

/**
 * Problem 3: Library Return Desk.
 *
 * <p>Returned books form a stack on an array of size 3 (last in, first out). Waiting students form
 * a circular queue on an array of size 3 that reuses free places (first in, first out); a size
 * counter tells a full queue from an empty one.
 *
 * <p>Complexity: every operation (RETURN, SHELVE, WAIT, SERVE) is O(1) time.
 */
public class LibraryReturnDesk {

    private static final int CAPACITY = 3;

    static class BookPile {
        private final String[] books = new String[CAPACITY];
        private int top = -1;

        String giveBack(String book) {
            if (top == CAPACITY - 1) {
                return book + " rejected: pile is full";
            }
            books[++top] = book;
            return book + " placed on pile";
        }

        String shelve() {
            if (top == -1) {
                return "pile is empty";
            }
            return "shelved " + books[top--];
        }
    }

    static class StudentLine {
        private final String[] students = new String[CAPACITY];
        private int front = 0;
        private int rear = -1;
        private int size = 0;

        String join(String student) {
            if (size == CAPACITY) {
                return student + " rejected: line is full";
            }
            rear = (rear + 1) % CAPACITY;
            students[rear] = student;
            size++;
            return student + " joined the line";
        }

        String serve() {
            if (size == 0) {
                return "no one waiting";
            }
            String student = students[front];
            front = (front + 1) % CAPACITY;
            size--;
            return "served " + student;
        }
    }

    public static void main(String[] args) {
        BookPile pile = new BookPile();
        StudentLine line = new StudentLine();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String command = scanner.next().replace(",", "").toUpperCase();
            switch (command) {
                case "RETURN":
                    System.out.println(pile.giveBack(scanner.next().replace(",", "")));
                    break;
                case "SHELVE":
                    System.out.println(pile.shelve());
                    break;
                case "WAIT":
                    System.out.println(line.join(scanner.next().replace(",", "")));
                    break;
                case "SERVE":
                    System.out.println(line.serve());
                    break;
                default:
                    System.out.println("unknown command: " + command);
            }
        }
    }
}
