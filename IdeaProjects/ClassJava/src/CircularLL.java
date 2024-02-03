public class CircularLL {

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head = null;

    public void create(int d) {
        Node ntemp = new Node(d);
        Node cur = head;

        if (head == null) {
            head = ntemp;
            ntemp.next = head;
        } else {
            while (cur.next != head) {
                cur = cur.next;
            }
            cur.next = ntemp;
            // Pointing back to the head for a circular link
            ntemp.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node cur = head;
            do {
                System.out.println(cur.data);
                cur = cur.next;
            } while (cur != head);
        }
    }

    public static void main(String a[]) {
        CircularLL list1 = new CircularLL();
        list1.create(10);
        list1.create(20);
        list1.create(30);
        list1.display();
    }
}
