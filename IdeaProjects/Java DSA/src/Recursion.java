public class Recursion {
    //Print numbers from 5 to 1.
//    public static void printNumbers(int n) {
//        if(n == 0) {
//            return;
//        }
//        System.out.println(n);
//        printNumbers(n-1);
//    }


    //Print numbers from 1 to 5.
//
//    public static void main(String[] args) {
//        int n =5;
//        printNumbers(n);

//    public static void printNumbers(int n) {
//        if(n == 6) {
//            return;
//        }
//        System.out.println(n);
//        printNumbers(n+1);
//    }
//
//    public static void main(String[] args) {
//        int n =1;
//        printNumbers(n);

    // Print the sum of first n natural numbers.

//    public static void printSum(int n, int sum) {
//        if (n == 0) {
//            System.out.println(sum);
//            return;
//        }
//        sum += n;
//        printSum(n - 1, sum);
//    }
//
//    public static void main(String args[]) {
//        printSum(5, 0);

    //Print factorial of a number n.

//    public static void printFactorial(int n, int fact) {
//        if(n == 0) {
//            System.out.println(fact);
//            return;
//        }
//        fact *= n;
//        printFactorial(n-1, fact);
//    }
//    public static void main(String args[]) {
//        printFactorial(5, 1);


    //Print the fibonacci sequence till nth term.

//    public static void printFactorial(int a, int b, int n) {
//        if(n == 0) {
//            return;
//        }
//        System.out.println(a);
//        printFactorial(b, a+b, n-1);
//    }
//    public static void main(String args[]) {
//        printFactorial(0, 1, 5);

    ////Print x^n (with stack height = n)
//    public static int printPower(int x, int n) {
//        if(n == 0) {
//            return 1;
//        }
//        if(x == 0) {
//            return 0;
//        }
//
//        int x_ = printPower(x, n-1);
//        int xn = x * x_;
//        return xn;
//    }
//    public static void main(String args[]) {
//        int x = 2, n = 5;
//        int output = printPower(x, n);
//        System.out.println(output);

    //Print x^n (with stack height = logn)
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
            return x * printPower(x, n/2) * printPower(x, n/2);
        }
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);

    }
}