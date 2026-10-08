// Q9. Explain when to choose Array, ArrayList, or LinkedList.
public class Mixed_Q09_Explain_when_to_choose_Array_ArrayList_or_LinkedList {
    public static void main(String[] args) {
        System.out.println("ARRAY:");
        System.out.println(" - Use when the size is fixed and known in advance.");
        System.out.println(" - Fastest access by index, works with primitives, uses least memory.");
        System.out.println();
        System.out.println("ARRAYLIST:");
        System.out.println(" - Use when the size changes and you mostly read by index or add at the end.");
        System.out.println(" - Resizes automatically; inserting/deleting in the middle is slow (shifting).");
        System.out.println();
        System.out.println("LINKEDLIST:");
        System.out.println(" - Use when you frequently insert/delete at the beginning or middle.");
        System.out.println(" - No shifting needed, but no direct index access and extra memory per node.");
    }
}
