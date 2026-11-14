package linked_lists_and_stacks.assigment_problems;

/**
 * Problem 1: Bus Route Stops.
 *
 * <p>The route is a singly linked chain built with a hand-written Node class (no
 * java.util.LinkedList). A tail reference lets each new stop be appended without walking the chain.
 *
 * <p>Complexity: build is O(n) time because each stop is added in constant time. printRoute is O(n)
 * time because it visits every node once. Both use O(1) additional space apart from the nodes.
 */
public class BusRouteStops {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    static Node build(String[] stops) {
        Node head = null;
        Node tail = null;
        for (String stop : stops) {
            Node node = new Node(stop);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return head;
    }

    static void printRoute(Node head) {
        int count = 0;
        Node last = null;
        StringBuilder chain = new StringBuilder();
        for (Node current = head; current != null; current = current.next) {
            chain.append(current.data).append(" -> ");
            count++;
            last = current;
        }
        chain.append("null");
        System.out.println(chain);
        if (head != null) {
            System.out.println("Stops: " + count + ", First: " + head.data + ", Last: " + last.data);
        }
    }

    public static void main(String[] args) {
        printRoute(build(new String[]{"Tambaram", "Guindy", "TNagar", "Central"}));
        printRoute(build(new String[]{"Potheri"}));
    }
}
