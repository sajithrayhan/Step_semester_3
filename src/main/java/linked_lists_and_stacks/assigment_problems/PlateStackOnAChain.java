package linked_lists_and_stacks.assigment_problems;

/**
 * Problem 5: Plate Stack on a Chain.
 *
 * <p>A stack built on a singly linked chain where the top of the stack is the head. push adds a node
 * at the head and pop removes the head, so the stack never becomes full.
 *
 * <p>Complexity: push, pop, peek and isEmpty are all O(1) time.
 *
 * <p>Compared with an array-based stack: the array version is also O(1) per operation, but it has a
 * fixed capacity (or needs an occasional O(n) resize), while the chain grows one node at a time and
 * is never full. The array uses less memory per element and has better cache locality, whereas each
 * chain node pays for an extra next reference and an allocation.
 */
public class PlateStackOnAChain {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    static class PlateStack {
        private Node top;
        private int size;

        String push(String plate) {
            Node node = new Node(plate);
            node.next = top;
            top = node;
            size++;
            return "push " + plate + " -> top " + plate + ", size " + size;
        }

        String pop() {
            if (isEmpty()) {
                return "pop -> stack is empty";
            }
            String plate = top.data;
            top = top.next;
            size--;
            return "pop -> " + plate + ", size " + size;
        }

        String peek() {
            if (isEmpty()) {
                return "peek -> stack is empty";
            }
            return "peek -> " + top.data;
        }

        boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        PlateStack stack = new PlateStack();
        System.out.println(stack.push("P1"));
        System.out.println(stack.push("P2"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.push("P3"));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("isEmpty -> " + stack.isEmpty());
    }
}
