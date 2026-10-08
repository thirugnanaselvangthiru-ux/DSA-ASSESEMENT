// Q7. Delete a doubly linked-list node when only its node reference is given.
public class Mixed_Q07_Delete_a_doubly_linked_list_node_when_only_its_node_reference_is_given {
    static class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    static void deleteNode(Node node) {
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10), n2 = new Node(20), n3 = new Node(30), n4 = new Node(40);
        n1.next = n2; n2.prev = n1;
        n2.next = n3; n3.prev = n2;
        n3.next = n4; n4.prev = n3;

        deleteNode(n3); // only the node reference is given

        for (Node t = n1; t != null; t = t.next) System.out.print(t.data + " ");
        System.out.println();
    }
}
