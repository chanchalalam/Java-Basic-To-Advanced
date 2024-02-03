public class Array {

   // Java Strings are Immutable.


//    public static void main(String[] args) {
    //1D Array
    //Declaring Array
    //int[] marks = new int[3];
    //int marks[] = new int[3];
//        int marks[]= {97,98,95};
//        marks[0] = 97;
//        marks[1] = 75;
//        marks[2] = 98;
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//
//        for(int i =0; i<3;i++){
//            System.out.println(marks[i]);
//        }

    //Taking User in Array
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers []= new int[size];
//
//        for(int i =0;i<size;i++){
//            System.out.println(numbers[i]);
//        }
    //Take input and Print the Same
//       Scanner sc = new Scanner(System.in);
////        int size = sc.nextInt();
////        int numbers []= new int[size];
////
    //input
    //for(int i =0;i<size;i++){
////            numbers[i] = sc.nextInt();
// //        }

    //output
////        for(int i =0;i<size;i++){
////            System.out.println(numbers[i]);
////        }


    //2D ARRAY
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//        //input
//        //rows
//        for(int i =0;i<rows;i++){
//            //colums
//            for (int j=0;j<rows;i++){
//                numbers[i][j]=sc.nextInt();
//
//            }
//        }
//            // output
//        for (int i =0;i<rows;i++){
//            for (int j=0;j<cols;j++){
//                System.out.println(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//
//    }
//}
//

//
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//
//        int[][] numbers = new int[rows][cols];
//
//
//        //input
//        //rows
//        for (int i = 0; i < rows; i++) {
//            //columns
//            for (int j = 0; j < cols; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//
//        int x = sc.nextInt();
//
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                //compare with x
//                if (numbers[i][j] == x) {
//                    System.out.println("x found at location (" + i + ", " + j + ")");
//                }
//            }
//        }
//
//    }

//    public static void main(String args[]) {
//        String name1 = "Tony";
//        String name2 = "Tony";
//
//
//        if(name1.equals(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//
//
//        //DO NOT USE == to check for string equality
//        //Gives correct answer here
//        if(name1 == name2) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//
//
//        //Gives incorrect answer here
//        if(new String("Tony") == new String("Tony")) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//
//    }

    //Substring
//   // The substring of a string is a subpart of it.
//    public class Strings {
//        public static void main(String args[]) {
//            String name = "TonyStark";
//
//            System.out.println(name.substring(0, 4));
//        }
//    }

    //ParseInt Method of Integer class
//    public class Strings {
//        public static void main(String args[]) {
//            String str = "123";
//            int number = Integer.parseInt(str);
//            System.out.println(number);
//
//
//        }
//    }

    //ToString Method of String class

    public static void main(String args[]) {
        int number = 123;
        java.lang.String str = Integer.toString(number);
        System.out.println(str.length());


    }
}





