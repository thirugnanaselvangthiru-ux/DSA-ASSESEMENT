// Q8. Implement round-robin traversal using a circular linked list.
public class Mixed_Q08_Implement_round_robin_traversal_using_a_circular_linked_list {
    static class Node {
        String name;
        Node next;
        Node(String n) { name = n; }
    }

    public static void main(String[] args) {
        Node p1 = new Node("P1"), p2 = new Node("P2"), p3 = new Node("P3");
        p1.next = p2;
        p2.next = p3;
        p3.next = p1; // circular

        Node current = p1;
        for (int turn = 1; turn <= 8; turn++) {
            System.out.println("Turn " + turn + ": " + current.name);
            current = current.next;
        }
    }
}
