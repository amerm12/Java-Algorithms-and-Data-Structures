/**
 * The Binary Seach program takes input of target value, based on which if will: find the next greater element, print
 * inorder, preorder and postorder traversal, count total number of nodes in the binary serach tree
 */
public class Main {
    public static void main(String[] args) {

        //Create three instances of BinarySearchTree
        BinarySearchTree firstTree = new BinarySearchTree();
        BinarySearchTree secondTree = new BinarySearchTree();
        BinarySearchTree thirdTree = new BinarySearchTree();

        //Insert elements into the first binary search tree
        firstTree.root = firstTree.insert(firstTree.root, 4);
        firstTree.insert(firstTree.root, 2);
        firstTree.insert(firstTree.root, 1);
        firstTree.insert(firstTree.root, 3);
        firstTree.insert(firstTree.root, 6);
        firstTree.insert(firstTree.root, 8);

        int firstTarget = 6; //Defining the target value for the first binary search tree

        //Print information for the first example
        System.out.println("----------Output for first example----------");
        System.out.println("Target: " + firstTarget); // Print the target value

        System.out.println("Path(s): "); // Print the paths to the target value
        firstTree.printPaths(firstTarget);

        firstTree.nextGreaterElement(firstTarget); // Find the next greater element of the target value

        // Perform inorder traversal and print the result
        System.out.print("Inorder Traversal: ");
        firstTree.inorderTraversal();
        System.out.println();

        // Perform preorder traversal and print the result
        System.out.print("Preorder Traversal: ");
        firstTree.preorderTraversal();
        System.out.println();

        // Perform postorder traversal and print the result
        System.out.print("Postorder Traversal: ");
        firstTree.postorderTraversal();
        System.out.println();

        // Print the total number of nodes in the first binary search tree
        System.out.println("Number of nodes: " + firstTree.countNodes());

        // Insert elements into the second binary search tree
        secondTree.root = secondTree.insert(secondTree.root, 5);
        secondTree.insert(secondTree.root, 3);
        secondTree.insert(secondTree.root, 2);
        secondTree.insert(secondTree.root, 4);
        secondTree.insert(secondTree.root, 7);
        secondTree.insert(secondTree.root, 6);
        secondTree.insert(secondTree.root, 8);

        int secondTarget = 4; // Define the target value for the second binary search tree

        // Print information for the second example
        System.out.println("----------Output for second example----------");
        System.out.println("Target: " + secondTarget); // Print the target value

        System.out.println("Path(s): "); // Print the paths to the target value
        secondTree.printPaths(secondTarget);

        secondTree.nextGreaterElement(secondTarget); // Find the next greater element of the target value

        // Perform inorder traversal and print the result
        System.out.print("Inorder Traversal: ");
        secondTree.inorderTraversal();
        System.out.println();

        // Perform preorder traversal and print the result
        System.out.print("Preorder Traversal: ");
        secondTree.preorderTraversal();
        System.out.println();

        // Perform postorder traversal and print the result
        System.out.print("Postorder Traversal: ");
        secondTree.postorderTraversal();
        System.out.println();

        // Print the total number of nodes in the second binary search tree
        System.out.println("Number of nodes: " + secondTree.countNodes());

        // Insert elements into the third binary search tree
        thirdTree.root = thirdTree.insert(thirdTree.root, 5);
        thirdTree.insert(thirdTree.root, 3);
        thirdTree.insert(thirdTree.root, 2);
        thirdTree.insert(thirdTree.root, 4);
        thirdTree.insert(thirdTree.root, 7);
        thirdTree.insert(thirdTree.root, 6);
        thirdTree.insert(thirdTree.root, 8);

        int thirdTarget = 3; // Define the target value for the third binary search tree

        // Print information for the third example
        System.out.println("----------Output for third example----------");
        System.out.println("Target: " + thirdTarget); // Print the target value

        System.out.println("Path(s): "); // Print the paths to the target value
        thirdTree.printPaths(thirdTarget);

        thirdTree.nextGreaterElement(thirdTarget); // Find the next greater element of the target value

        // Perform inorder traversal and print the result
        System.out.print("Inorder Traversal: ");
        thirdTree.inorderTraversal();
        System.out.println();

        // Perform preorder traversal and print the result
        System.out.print("Preorder Traversal: ");
        thirdTree.preorderTraversal();
        System.out.println();

        // Perform postorder traversal and print the result
        System.out.print("Postorder Traversal: ");
        thirdTree.postorderTraversal();
        System.out.println();

        // Print the total number of nodes in the third binary search tree
        System.out.println("Number of nodes: " + thirdTree.countNodes());
    }
}