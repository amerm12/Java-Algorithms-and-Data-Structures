/**
 * In Priority Queue program elements are having priority based on the number value (Higher the number,
 * greater the priority). Numbers are placed in priority queue from the highest to the lowest. The
 * underlying array elements are going to be in the descending order.
 *
 * Main class contains the main method to demonstrate the PriorityQueue functionality.
 */
public class Main {
    public static void main(String[] args) {

        //Create a PriorityQueue with a maximum size of
        PriorityQueue queue = new PriorityQueue(5);

        //Insert elements into the queue
        queue.insert(7);
        queue.insert(9);
        queue.insert(10);
        queue.insert(8);
        queue.insert(6);

        //Display the initial elements in the queue
        System.out.print("Input: ");
        queue.display();

        //Remove and display elements from the queue until it is empty
        System.out.print("Final output: ");
        while (!queue.isEmpty()) {
            long item = queue.remove();
            System.out.print(item + " ");
        }
    }
}