package linked_lists_and_stacks.assigment_problems;

/**
 * Problem 2: Late Comers in the Line.
 *
 * <p>A student with a pass joins at the front (addFirst); any other late comer joins at the end
 * (addLast). The line is a singly linked chain with a hand-written Node class.
 *
 * <p>Complexity: addFirst is O(1) time because only the head changes. addLast is O(n) time because
 * the whole chain must be walked to find the last node (O(1) only if a tail reference were kept).
 */
public class LateComersInTheLine {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    static Node addFirst(Node head, String name) {
        Node node = new Node(name);
        node.next = head;
        return node;
    }

    static Node addLast(Node head, String name) {
        Node node = new Node(name);
        if (head == null) {
            return node;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
    }

    static Node fromNames(String... names) {
        Node head = null;
        for (String name : names) {
            head = addLast(head, name);
        }
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
        Node line = fromNames("Asha", "Ravi");
        line = addFirst(line, "Neha");
        line = addLast(line, "Kiran");
        line = addFirst(line, "Mohan");
        System.out.println(describe(line));   // Mohan -> Neha -> Asha -> Ravi -> Kiran -> null

        Node empty = null;
        empty = addLast(empty, "Pooja");
        empty = addFirst(empty, "Arun");
        System.out.println(describe(empty));  // Arun -> Pooja -> null
    }
}
