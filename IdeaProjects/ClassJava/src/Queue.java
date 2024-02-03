public class Queue {
//    class ArrayQueue {
//        private int[] items;
//        private int front;
//        private int rear;
//
//        public ArrayQueue(int capacity) {
//            items = new int[capacity];
//            front = -1;
//            rear = -1;
//        }
//
//        public boolean isEmpty() {
//            return front == -1;
//        }
//
//        public boolean isFull() {
//            return rear == items.length - 1;
//        }
//
//        public void enqueue(int item) {
//            if (isFull()) {
//                System.out.println("Queue overflow");
//                return;
//            }
//            if (front == -1) {
//                front = 0;
//            }
//            rear++;
//            items[rear] = item;
//        }
//
//        public int dequeue() {
//            if (isEmpty()) {
//                System.out.println("Queue underflow");
//                return -1;
//            }
//            int item = items[front];
//            if (front == rear) {
//                front = rear = -1;
//            } else {
//                front++;
//            }
//            return item;
//        }
//    }
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

    class LinkedQueue {
        private Node front;
        private Node rear;

        public LinkedQueue() {
            front = rear = null;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void enqueue(int item) {
            Node newNode = new Node(item);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue underflow");
                return -1;
            }
            int item = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return item;
        }
    }

}
