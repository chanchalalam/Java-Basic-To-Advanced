import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int age = sc.nextInt();

        if (age>18) {
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }
      */
        /*
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b) {
            System.out.println("Equal");
        }else{
            if(a>b) {
                System.out.println("a is greater ");
            }else{
                System.out.println("a is lesser");
            }
        }*/

       /* int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b) {
            System.out.println("Equal");
        }else if(a>b) {
                System.out.println("a is greater ");
            }else{
                System.out.println("a is lesser");
            }
        } */
      /*  If 3 is even number, print "Bazinga"
        if(3%2 == 0){
            System.out.println("Bazinga");
        }
      */
//        int button = sc.nextInt();
//
//        if (button==1) {
//            System.out.println("Hello");
//        }else if (button==2) {
//            System.out.println("Namaste");
//        } else if (button==3) {
//            System.out.println("Bonjour");
//        } else {
//            System.out.println("Invalid");
//    }

        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();


        /**
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */


        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}