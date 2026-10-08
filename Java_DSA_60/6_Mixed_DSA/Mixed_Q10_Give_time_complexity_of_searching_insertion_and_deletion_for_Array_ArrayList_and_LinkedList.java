// Q10. Time complexity of searching, insertion and deletion for Array, ArrayList and LinkedList.
public class Mixed_Q10_Give_time_complexity_of_searching_insertion_and_deletion_for_Array_ArrayList_and_LinkedList {
    public static void main(String[] args) {
        System.out.println("Operation        | Array | ArrayList     | LinkedList");
        System.out.println("-----------------+-------+---------------+-----------");
        System.out.println("Search           | O(n)  | O(n)          | O(n)");
        System.out.println("Access by index  | O(1)  | O(1)          | O(n)");
        System.out.println("Insert at end    | O(n)  | O(1) amortized| O(n) (O(1) with tail)");
        System.out.println("Insert at start  | O(n)  | O(n)          | O(1)");
        System.out.println("Insert in middle | O(n)  | O(n)          | O(n)");
        System.out.println("Delete at start  | O(n)  | O(n)          | O(1)");
        System.out.println("Delete at end    | O(1)  | O(1)          | O(n)");
        System.out.println("Delete in middle | O(n)  | O(n)          | O(n)");
        System.out.println();
        System.out.println("Note: Array size is fixed, so 'insert' means shifting elements within it.");
        System.out.println("Binary search is O(log n) on a sorted Array/ArrayList.");
    }
}
