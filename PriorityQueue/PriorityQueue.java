/**
 * PriorityQueue class represents a priority queue data structure.
 * It stores elements in ascending order.
 */
public class PriorityQueue {
    private int maxSize;  // Maximum size of the priority queue.
    private long[] queArray;  // Array to store queue elements.
    private int nItems;  // Number of items in the queue.

    /**
     * Constructor to initialize the priority queue with a given maximum size.
     *
     * @param maxSize Maximum size of the priority queue.
     */
    public PriorityQueue(int maxSize){
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        nItems = 0;
    }

    /**
     * Insertion method for adding element into hte priority queue.
     *
     * @param item The element to insert into the piority queue.
     */
    public void insert(long item){
        if (nItems < maxSize) {
            queArray[nItems++] = item;
        }
    }

    /**
     * Removal method for removing the minimum element from the priority queue.
     *
     * @return The minimum element removed from the priority queue.
     */
    public long remove(){
        long min = queArray[0];
        int minIndex = 0;

        for (int i = 1; i < nItems; i++) {
            if (queArray[i] < min) {
                min = queArray[i];
                minIndex = i;
            }
        }

        for (int i = minIndex; i < nItems - 1; i++){
            queArray[i] = queArray[i + 1];
        }

        nItems--;
        return min;
    }

    /**
     * Check if the priority queue is empty.
     *
     * @return True if the priority queue is empty, otherwise false.
     */
    public boolean isEmpty(){
        return (nItems == 0);
    }

    /**
     * Check if the priority queue is full.
     *
     * @return True if priority queue is full, otherwise false.
     */
    public boolean isFull(){
        return (nItems == maxSize);
    }

    /**
     * Display the elements in the priority queue.
     */
    public void display(){
        for (int i = 0; i < nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println();
    }
}