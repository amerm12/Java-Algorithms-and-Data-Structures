/**
 * Link class represents a node in a linked list.
 */
public class Link {
    public  int data; //Data stored in the node
    public Link next; //Reference to the next node in the list

    /**
     * Constructor to create a new node with the given data.
     *
     * @param data The data to be stored in the node.
     */
    public Link (int data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Display the data stored in the node.*/
    public void displayLink() {
        System.out.print("{" + data + "}");
    }
}