/**
 * LinkedList class represents a singly linked list data structure.
 */
public class LinkedList {
    private Link first; //Reference to the first node in the linked list.

    /**
     * Constructor to initialize an empty liked list.
     */
    public LinkedList(){
        first = null;
    }

    /**
     * Check if the linked list is empty.
     *
     * @return True if the linked list is empty, otherwise false.
     */
    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * Insert a new node at the beginning of the linked list.
     *
     * @param data The data to be inserted into the new node.
     */
    public void insertFirst(int data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    /**
     * Find the first occurrence of a node with a specified data.
     *
     * @param key The data to search for.
     * @return The first occurrence of the node with the specified data. or null if not found.
     */
    public Link find(int key) {
        Link current = first;
        while(current.data != key) {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    /**
     * Delete the first occurrence of a node with a specified data.
     *
     * @param key The data to be deleted.
     * @return The deleted node, or null if not found.
     */
    public Link deleteFirst(int key) {
        Link current = first;
        Link previous = first;

        while (current.data != key) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    }

    /**
     * Display the elements of the linked list.
     */
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    /**
     * Count the number of duplicate elements in the linked list.
     *
     * @return The number of the duplicate elements
     */
    public int countDuplicates() {
        int duplicates = 0;
        Link nodeOne = first;

        while(nodeOne != null){
            Link runnerNode = nodeOne.next;

            while (runnerNode != null) {
                if(nodeOne.data == runnerNode.data){
                    duplicates++;
                }
                runnerNode = runnerNode.next;
            }
            nodeOne = nodeOne.next;
        }
        return duplicates;
    }

    /**
     * Delete duplicate elements from teh linked list.
     */
    public void deleteDuplicates() {
        Link nodeOne = first;

        while(nodeOne != null){
            Link runnerNode = nodeOne.next;

            while (runnerNode != null) {
                if(nodeOne.data == runnerNode.data){
                    deleteFirst(runnerNode.data);
                }
                runnerNode = runnerNode.next;
            }
            nodeOne = nodeOne.next;
        }
    }

    /**
     * Swap the positions of two nodes with the specified data in the linked list
     *
     * @param dataOne The data of the first node to be swapped.
     * @param dataTwo The data of the second node to be swapped.
     */
    public void swap(int dataOne, int dataTwo) {
        Link nodeOne = find(dataOne);
        Link nodeTwo = find(dataTwo);

        if (nodeOne == null || nodeTwo == null) {
            System.out.println("Nodes not found!");
            return;
        }

        Link tempNode = new Link(nodeOne.data);
        nodeOne.data = nodeTwo.data;
        nodeTwo.data = tempNode.data;
    }

    /**
     * Sort the linked list using bubble sort algorithm.
     */
    public void sort() {
        boolean swapped = true;

        while(swapped) {
            swapped = false;
            Link nodeOne = first;

            while(nodeOne.next != null){
                Link nodeTwo = nodeOne.next;

                if(nodeOne.data > nodeTwo.data){
                    swap(nodeOne.data, nodeTwo.data);
                   swapped = true;
                }
                nodeOne = nodeOne.next;
            }
        }
    }
}