// Q6. Detect whether a linked list contains a cycle.
public class Mixed_Q06_Detect_whether_a_linked_list_contains_a_cycle {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next; // creates a cycle (remove this line for no cycle)

        Node slow = head, fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { cycle = true; break; }
        }
        System.out.println(cycle ? "Cycle detected" : "No cycle");
    }
}
