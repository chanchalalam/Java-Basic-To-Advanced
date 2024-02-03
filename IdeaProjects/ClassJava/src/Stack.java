
public class Stack {
    private static int[] s1;
    private static int top;
    private static int n;

    public Stack(int size) {
        n = size;
        s1 = new int[n];
        top = -1;
    }

    public void push(int d) {
        if (top == n - 1) {
            System.out.println("Overflow");
        } else {
            s1[++top] = d;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        } else {
            int q = s1[top];
            top--;
            return q;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return s1[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
