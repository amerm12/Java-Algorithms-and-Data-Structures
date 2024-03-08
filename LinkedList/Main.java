/**
 * The Linked list program takes the values in the list and can: count duplicates, remove duplicates, print removed
 * duplicates, swap nodes, sort list.
 */
public class Main {
    public static void main (String[] args) {
        //Create a new LinkedList instance
        LinkedList list = new LinkedList();

        //Insert elements into the list
        list.insertFirst(5);
        list.insertFirst(15);
        list.insertFirst(10);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(5);

        //Display the initial list
        System.out.println("Initial list: ");
        list.displayList();

        //Find specific element in the list
        System.out.println("Element found in the list: " + list.find(10).data);

        //Count and display the number of duplicate elements in the list
        System.out.println("Number of duplicates in the list: " + list.countDuplicates());

        //Delete duplicate elements from the list
        list.deleteDuplicates();
        System.out.println("List after deleting duplicates: ");
        list.displayList();

        //Sort the list
        list.sort();
        System.out.println("Sorted list:");
        list.displayList();

        //Swap two elements in the list
        int dataOne = 15;
        int dataTwo = 30;
        list.swap(dataOne, dataTwo);
        System.out.println("List after swapping " + dataOne + " and " + dataTwo + ": ");
        list.displayList();
    }
}
