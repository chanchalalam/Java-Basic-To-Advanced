//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
////        int n = sc.nextInt();
////        return x * x * Math.pow(n - 1, 2);
//
//
//    }
//}
//
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num < 0) {
//            System.out.println(num);
//        } else {
//            int reversedNum = reverseNumber(num);
//            System.out.println(reversedNum);
//        }
//    }
//
//    public static int reverseNumber(int num) {
//        if (num < 10) {
//            return num;
//        } else {
//            int lastDigit = num % 10;
//            int remainingDigits = num / 10;
//            int reversedRemaining = reverseNumber(remainingDigits);
//            int orderOfMagnitude = (int) Math.pow(10, (int) Math.log10(remainingDigits) + 1);
//
//            return lastDigit * orderOfMagnitude + reversedRemaining;
//        }
//

//    public static int rod_cut(int P[], int n) {
//        if (n <= 0)
//            return 0;
//
//        int q = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int cut = i + 1;
//            q = Math.max(q, P[i] + rod_cut(P, n - cut));
//        }
//        return q;
//    }
//
//    public static void main(String args[]) {
//        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
//        int length = prices.length;
//
//        int maxProfit = rod_cut(prices, length);
//        System.out.println("Maximum profit: " + maxProfit);
//    }
//public class Main {
//
//    static class Node{
//        int data;
//        Node next;
//        public Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//        Node head = null;
//
//        public void append(int data) {
//            Node ntemp = new Node(data);
//            Node cur = head;
//            if(head == null){
//                head = ntemp;
//            }
//            else{
//                while(cur.next!=null){
//                    cur = cur.next;
//                }
//                cur.next=ntemp;
//            }
//        }
//
//        public void display(){
//            if(head==null){
//                System.out.println("Empty list");
//            }else{
//                Node cur = head;
//                while(cur.next!=null){
//                    System.out.println(cur.data);
//                    cur =cur.next;
//                }
//            }
//        }
//        public static void main(String a[]){
//            Main list1= new Main();
//            list1.append(10);
//            list1.append(20);
//            list1.append(30);
//            list1.display();
//            //
//            System.out.println("after insertion");
//            list1.insertAt(8,100);
//            list1.display();
//        }
//
//
//     }
//
//    public void insertAt(int pos, int data) {
//        Node ntemp;
//        ntemp = new Node (data);
//        Node cur = head;
//        int temp = 1;
//        if(pos<=1){
//            ntemp.next=head;
//            head=ntemp;
//        }
//        else{
//            while( (temp<= pos-1)&&(cur.next!=null)){
//                cur = cur.next;
//                temp+=1;
//            }
//            ntemp .next=cur.next;
//            cur.next=ntemp;
//
//        }
//
//    }
//}
//
//
//public class Main {
//
//    static class Node {
//        int data;
//        Node next;
//
//        public Node(int d) {
//            this.data = d;
//            this.next = null;
//        }
//    }
//
//    Node head = null;
//
//    public void append(int data) {
//        Node ntemp = new Node(data);
//        Node cur = head;
//        if (head == null) {
//            head = ntemp;
//        } else {
//            while (cur.next != null) {
//                cur = cur.next;
//            }
//            cur.next = ntemp;
//        }
//    }
//
//    public void display() {
//        if (head == null) {
//            System.out.println("Empty list");
//        } else {
//            Node cur = head;
//            while (cur != null) {
//                System.out.println(cur.data);
//                cur = cur.next;
//            }
//        }
//    }
//
//    public void insertAt(int pos, int data) {
//        Node ntemp = new Node(data);
//        Node cur = head;
//        int temp = 1;
//        if (pos <= 1) {
//            ntemp.next = head;
//            head = ntemp;
//        } else {
//            while ((temp < pos - 1) && (cur.next != null)) {
//                cur = cur.next;
//                temp += 1;
//            }
//            ntemp.next = cur.next;
//            cur.next = ntemp;
//        }
//    }
//
//    public void deleteAt(int pos, int i) {
//        Node cur = head;
//        int i = 1;
//        while (i < pos - 1) {
//            cur = cur.next;
//            i += 1;
//        }
//        Node x = cur.next;
//        cur.next = cur.next.next;
//        x = null;
//    }
//
//    public static void main(String a[]) {
//        Main list1 = new Main();
//        list1.append(10);
//        list1.append(20);
//        list1.append(30);
//        list1.display();
//
//        System.out.println("After insertion at 2 pos");
//        list1.insertAt(2, 100);
//        list1.display();
//
//        System.out.println("after deletion at 2 pos");
//        list1.deleteAt(2);
//        list1.display();
//    }
//}
//
//



public class Main{

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head = null;

    public void append(int data) {
        Node ntemp = new Node(data);
        Node cur = head;
        if (head == null) {
            head = ntemp;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = ntemp;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node cur = head;
            while (cur != null) {
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
    }

    public void insertAt(int pos, int data) {
        Node ntemp = new Node(data);
        Node cur = head;
        int temp = 1;
        if (pos <= 1) {
            ntemp.next = head;
            head = ntemp;
        } else {
            while ((temp < pos - 1) && (cur.next != null)) {
                cur = cur.next;
                temp += 1;
            }
            ntemp.next = cur.next;
            cur.next = ntemp;
        }
    }

    public void deleteAt(int pos) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node cur = head;
        int temp = 1;

        if (pos == 1) {
            head = cur.next;
        } else {
            while (temp < pos - 1 && cur.next != null) {
                cur = cur.next;
                temp += 1;
            }

            if (cur.next == null) {
                System.out.println("Position out of bounds");
                return;
            }

            cur.next = cur.next.next;
        }
    }


    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String a[]) {
        Main list1 = new Main();
        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.display();

        System.out.println("After insertion at 2 pos");
        list1.insertAt(2, 100);
        list1.display();

        System.out.println("After deletion at 2 pos");
        list1.deleteAt(2);
        list1.display();

        Node middleNode = list1.findMiddle();
        if (middleNode != null) {
            System.out.println("Middle element: " + middleNode.data);
        } else {
            System.out.println("List is empty");
        }
    }
}




