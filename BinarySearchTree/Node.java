/**
 * Node class represents a node in a binary search tree (BST).
 */
public class Node {
    int key; //Value of the node
    Node left, right; //References to the left and right child nodes

    /**
     * Constructor to create a new node with the given key.
     *
     * @param item The value to be stored in the node.
     */
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
