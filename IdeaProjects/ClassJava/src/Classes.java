public class Classes {
    private static int maxSize;
    private static int front;
    private static int rear;
    private static int[] queueArray;

    public Classes(int size) {
        maxSize = size + 1; // One extra space for avoiding confusion between full and empty conditions
        queueArray = new int[maxSize];
        front = rear = 0;
    }

    public static void enqueue(int data) {
        if ((rear + 1) % maxSize == front) {
            System.out.println("Overflow: Queue is full");
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = data;
            System.out.println(data + " enqueued to the queue");
        }
    }

    public static void dequeue() {
        if (front == rear) {
            System.out.println("Underflow: Queue is empty");
        } else {
            front = (front + 1) % maxSize;
            System.out.println(queueArray[front] + " dequeued from the queue");
        }
    }

    public static void displayQueue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue: ");
            int i = (front + 1) % maxSize;
            while (i != rear) {
                System.out.print(queueArray[i] + " ");
                i = (i + 1) % maxSize;
            }
            System.out.println(queueArray[i]); // Print the last element
        }
    }

    public static void main(String[] args) {
        Classes queue = new  Classes(5);

        enqueue(1);
        enqueue(2);
        enqueue(3);
        displayQueue();

        dequeue();
        displayQueue();

        enqueue(4);
        enqueue(5);
        enqueue(6); // This will show that the queue is full
        displayQueue();
    }
}


