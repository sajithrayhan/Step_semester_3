package linked_lists_and_stacks.assigment_problems;

/**
 * Problem 3: Book Copy Finder.
 *
 * <p>One walk through the chain keeps a position counter, a copy counter and the first position.
 * IDs are compared with equals, not ==.
 *
 * <p>Complexity: O(n) time and O(1) additional space.
 *
 * <p>Why the middle cannot be reached directly: nodes are scattered in memory and each one only
 * knows the next node. There is no index to compute an address from, so reaching the middle means
 * following next references from the head, one node at a time. An array stores elements side by
 * side, so any index is reached in O(1).
 */
public class BookCopyFinder {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    static Node build(String... ids) {
        Node head = null;
        Node tail = null;
        for (String id : ids) {
            Node node = new Node(id);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }
        return head;
    }

    static String find(Node head, String id) {
        int position = 0;
        int firstPosition = -1;
        int copies = 0;
        for (Node current = head; current != null; current = current.next) {
            position++;
            if (current.data.equals(id)) {
                copies++;
                if (firstPosition == -1) {
                    firstPosition = position;
                }
            }
        }
        if (copies == 0) {
            return id + " not found";
        }
        return id + " first at position " + firstPosition + ", copies: " + copies;
    }

    public static void main(String[] args) {
        Node trolley = build("B12", "B07", "B30", "B07", "B45", "B07");
        System.out.println(find(trolley, "B07"));   // B07 first at position 2, copies: 3
        System.out.println(find(trolley, "B99"));   // B99 not found
    }
}
