import java.util.*;
public class Loop {
    public static void main (String[] args) {

        //for loop
        //counter++ => counter = counter + 1
//        for(int counter = 0; counter <11; counter++){
//            //System.out.println(counter);
//            System.out.print(counter+" ");
//
//        for (int i = 0; i<11; i++){
//            System.out.print(counter+" ");
//        }
        // while loop
//        int i = 0;
//        while (i<11){
//            System.out.println(i);
//            i= i+1;
//        }

        // Do while loop
//        int i =0;
//        do {
//            System.out.println(i);
//            i = i + 1;
//        }while(i>11);
//        }

        // diff bet Do While & While Loop

//       int i = 12;
////        while(i>11){
////            System.out.println("Chanchal");
////        }
////
//        do{
//            System.out.println("Chanchal");
//        }while (i>11);


        //Print all even numbers till n.
//                int n = 25;
//
//
//                for(int i=1; i<=n; i++) {
//                    if(i % 2 == 0) {
//                        System.out.println(i);
//                    }
//                }
        Scanner sc = new Scanner(System.in);
        int input;


        do {
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }


            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();

            } while(input == 1);

          }
        }