import java.util.*;
public class PatternQuestions  {
    public static void main(String[] args){
        //rows = outer loop
        //cols = inner loop
        int n = 4;
        int m = 5;

        //Pattern1 Square
        //outer loop
//        for(int i=0; i<n; i++) {
//         //inner loop
//            for(int j=0; j<m; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
         //Pattern 2 Hollow Square
        //outer loop
//        for(int i=0; i<n; i++) {
//            //inner loop
//            for(int j=0; j<m; j++) {
//                //cell -> i , j
//                if(i == 0 || i == n-1 || j == 0 || j == m-1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        //Pattern 3 Half Pyramid
        //outer loop
//        for(int i=1; i<=n; i++) {
//            //inner loop
//            for(int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Pattern 4 Inverted half Pyramid
        //outer loop
        for(int i=n; i>=1; i--) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Pattern 4 Inverted half Pyramid rotated by 180 degree
        //Method 1
        //outer loop
            for(int i=1; i<=n; i++) {
                //inner loop -> space print
                for(int j=1; j<=n-i; j++) {
                   System.out.print(" ");
            }
                //inner loop space print
               for(int j=1; j<=i; j++) {
                  System.out.print("*");
            }
            System.out.println();
        }
         //Method 2
        for(int i=n; i>=1; i--) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 6 half Pyramid number 1234
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //Pattern 7 half Pyramid rotated by 180 number
        //outer loop
        for(int i=n; i>=1; i--) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //Pattern 8 Floyd's Triangle
        //outer loop
       int  number = 1;
        for(int i = 1; i<=n; i++){
            //inner loop
            for(int j =1;j<=i;j++){
                System.out.print(number);
                number ++;//number = number+1
            }
            System.out.println();
        }

        //Pattern 9 0-1 Triangle
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) {//sum
                    System.out.print(1+" ");
                } else {//odd
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

        //Pattern 10 Butterfly Pattern
        //upper half part
        for(int i=1; i<=n; i++) {
            //1st part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half part
        //!st Part
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            //2nd Part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 11 Solid Rhombus
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 12 Number Pyramid
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //Pattern  13 Palindromic Pattern
        // Type 1
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //first part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //second part
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

         //Type2
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //first part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //second part
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //Type3
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //first part
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            //second part
            for(int j=0; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //Pattern 14 Kite
        //upper part
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
