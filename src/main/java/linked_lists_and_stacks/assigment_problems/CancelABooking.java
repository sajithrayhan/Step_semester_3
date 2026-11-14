package linked_lists_and_stacks.assigment_problems;

/**
 * Problem 4: Cancel a Booking.
 *
 * <p>Removes the first appearance of a booking number. The head is handled separately; otherwise
 * the walk stops at the node just before the match and links it to the node after the match. If the
 * booking is missing, a message is printed and the chain is left unchanged.
 *
 * <p>Complexity: O(1) time when the booking is at the head (no walk is needed) and O(n) time when it
 * is at the end or absent (the whole chain is walked). Additional space is O(1).
 */
public class CancelABooking {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    static Node build(String... bookings) {
        Node head = null;
        Node tail = null;
        for (String booking : bookings) {
            Node node = new Node(booking);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return head;
    }

    static Node removeFirst(Node head, String booking) {
        if (head == null) {
            System.out.println(booking + " not found");
            return null;
        }
        if (head.data.equals(booking)) {
            return head.next;
        }
        Node previous = head;
        while (previous.next != null && !previous.next.data.equals(booking)) {
            previous = previous.next;
        }
        if (previous.next == null) {
            System.out.println(booking + " not found");
            return head;
        }
        previous.next = previous.next.next;
        return head;
    }

    static String describe(Node head) {
        StringBuilder chain = new StringBuilder();
        for (Node current = head; current != null; current = current.next) {
            chain.append(current.data).append(" -> ");
        }
        return chain.append("null").toString();
    }

    public static void main(String[] args) {
        System.out.println(describe(removeFirst(build("104", "101", "107", "101"), "101")));
        System.out.println(describe(removeFirst(build("104", "101", "107"), "104")));
        System.out.println(describe(removeFirst(build("104", "101"), "200")));
    }
}
