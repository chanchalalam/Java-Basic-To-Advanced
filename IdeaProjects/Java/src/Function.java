import java.util.*;
public class Function {
    //Print Name
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }

//    public static void main(String arg[]){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        printMyName(name);
//    }
    // Print sum of two number
//    public static void sum(int a, int b) {
//        int sum = a + b;
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        sum(a, b);
//
//    }

    //Print multiply two number
//    public static int multiply(int a, int b) {
//        return a*b;
//    }
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//
//        int result = multiply(a, b);
//        System.out.println(result);
//    }

    //Factorial
//    public static void printFactorial(int n) {
//        //loop
//        if (n < 0) {
//            System.out.println("Invalid Number");
//            return;
//        }
//        int factorial = 1;
//
//
//        for (int i = n; i >= 1; i--) {
//            factorial = factorial * i;
//        }
//
//
//        System.out.println(factorial);
//        return;
//    }
//        public static void main (String args[]){
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//
//            printFactorial(n);

    //the product of 2 numbers.


    public static int calculateProduct(int a, int b) {
        return a * b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateProduct(a, b));

    }
    }

