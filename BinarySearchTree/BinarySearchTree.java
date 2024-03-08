import java.util.ArrayList;

/**
 * BinarySearchTree class represents a binary search tree (BST) data structure.
 */
public class BinarySearchTree {
    Node root; //Root node of the binary search tree

    /**
     * Constructor to create an empty binary search tree.
     */
    BinarySearchTree() {
        root = null;
    }

    /**
     * Method to insert a new node with the given key into the binary search tree.
     *
     * @param node The root node of the subtree where the key will be inserted.
     * @param key  The key value to be inserted.
     * @return The root of the updated subtree after insertion.
     */
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key); //Create a new node with the given key if the tree is empty
            return node;
        }

        //Recusively insert the key in the appropriate subtree.
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);

        return node;
    }

    /**
     * Method to search for a node with the given key in the binary search tree.
     *
     * @param root The root node of the subtree to search in.
     * @param key  The key value to search for.
     * @return The node containing the key value, or null if the key is not found.
     */
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root; //Return the node if found or null if not found

        //Recursively search in the appropriate subtree based on the key value
        if (root.key < key)
            return search(root.right, key);

        return search(root.left, key);
    }

    /**
     * Prints all paths where the specified key value is found.
     *
     * @param key  The key value to search for in the tree.
     */
    public void printPaths(int key) {
        printPaths(key, root);
    }

    ArrayList<Integer> mainPath = new ArrayList<>(); //Store the main path from the root to the key

    /**
     * Recursively prints all paths in the binary search tree where the specified key value is found.
     *
     * @param key  The key value to search for in the tree.
     * @param node The current node being processed.
     */
    private void printPaths(int key, Node node){

        if (key > node.key) {
            mainPath.add(node.key); //Add the current node to the main path
            printPaths(key, node.right); //Search in the right subtree
        }
        else if (key < node.key) {
            mainPath.add(node.key); //Add the current node to the main path
            printPaths(key, node.left); //Search in the left subtree
        }
        else if(key == node.key){
            ArrayList<Integer> path = new ArrayList<>();
            printRemainingPaths(node, path); //If key is found, print the remaining paths
        }
    }

    /**
     * Recursively prints the remaining paths from the current node in the binary search tree.
     *
     * @param node       The current node being processed.
     * @param otherPaths The list containing the path from the root to the current node.
     */
    private void printRemainingPaths(Node node, ArrayList<Integer> otherPaths){
        if(node == null){
            return;
        }

        otherPaths.add(node.key); //Add the current node to the path
        if (node.left == null && node.right == null) {
            //If leaf node reached, print the complete path
            for (int i : mainPath) {
                System.out.print(i + "-");
            }
            for (int i = 0; i < otherPaths.size(); i++) {
                System.out.print(otherPaths.get(i));
                if (i < otherPaths.size() - 1) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        //Recursively print paths in the left and right subtrees
        printRemainingPaths(node.left, new ArrayList<>(otherPaths));
        printRemainingPaths(node.right, new ArrayList<>(otherPaths));
    }

    /**
     * Find the next greater element in the binary search tree for given tree
     * @param key The key value to search for.
     */
    public void nextGreaterElement(int key){
        Node node = search(root, key); //Search for the node with given key value
        if(node == null){
            System.out.println("Node not found."); //If node not found, print message and return
            return;
        }
        Node nextGreaterElement = nextGreaterElement(root, key); //Find the next greater element

        if(nextGreaterElement != null){
            System.out.println(nextGreaterElement.key + " is next greater element of the target value.");
        }
        else {
            System.out.println("There is no greater element."); //If no greater element found, print message
        }
    }

    /**
     * Find the next greater element in the binary tree for given key
     *
     * @param root The roto node of the binary search tree.
     * @param key The key value to serach for.
     * @return The next greater element node.
     */
    private Node nextGreaterElement(Node root, int key){
        Node successor = null;
        Node current = root;

        //Traverse the tree to find the next greater element
        while (current != null){
            if (current.key > key){
                successor = current;
                current = current.left; //Traverse left subtree
            }
            else{
                current = current.right; //Traverse right subtree
            }
        }
        return successor;
    }

    /**
     * Perform inorder traversal of the binary search tree.
     */
    public void inorderTraversal()
    {
        inorderTraversal(root);
    }

    /**
     * Recursively perform inorder traversal of the binary search tree.
     *
     * @param node The current node being processed.
     */
    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left); //Traverse left subtree
            System.out.print(node.key + " "); //Visit current node
            inorderTraversal(node.right); //Traverse right subtree
        }
    }

    /**
     * Perform preorder traversal of the binary search tree.
     */
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    /**
     * Perform preorder traversal of the binary search tree.
     *
     * @param node The current node being processed.
     */
    private void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " "); //visit current node
            preorderTraversal(node.left); //Traverse left subtree
            preorderTraversal(node.right); //Traverse right subtree
        }
    }

    /**
     * Perform postorder traversal of the binary serach tree.
     */
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    /**
     * Recursively perform postorder traversal of the binary search tree
     *
     * @param node The current node being processed.
     */
    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left); //Traverse left subtree
            postorderTraversal(node.right); //Traverse right subtree
            System.out.print(node.key + " "); //Visit current node
        }
    }

    /**
     * Count the number of nodes in the binary serach tree.
     *
     * @return total number of nodes in the tree.
     */
    public int countNodes() {
        return countNodes(root);
    }

    /**
     * Recursively count the number of nodes in the binary serach tree.
     *
     * @param node The current node being processed.
     * @return The total number of nodes in the subtree rooted at the given node
     */
    private int countNodes(Node node) {
        if (node == null) {
            return 0; //Return 0 if node is null
        }
        else {
            //Recursively count nodes in the left and right subtree and add 1 for the current node
            int leftNodesCounter = countNodes(node.left);
            int rightNodesCounter = countNodes(node.right);
            return 1 + leftNodesCounter + rightNodesCounter;
        }
    }
}