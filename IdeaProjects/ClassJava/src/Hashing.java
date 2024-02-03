import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.*;


    public class Hashing {
//        public static void main(String args[]) {
//            HashSet<Integer> set = new HashSet<>();
//
//            //Add
//            set.add(1);
//            set.add(2);
//            set.add(3);
//            set.add(1);
//
//
//            //Size
//            System.out.println("size of set is : " + set.size());
//
//
//            //Search
//            if(set.contains(1)) {
//                System.out.println("present");
//            }
//
//
//            if(!set.contains(6)) {
//                System.out.println("absent");
//            }
//
//
//            //Delete
//            set.remove(1);
//            if(!set.contains(1)) {
//                System.out.println("absent");
//            }
//
//            //Print all elements
//            System.out.println(set);
//
//
//            //Iteration - HashSet does not have an order
//            set.add(0);
//            Iterator it = set.iterator();
//            while (it.hasNext()) {
//                System.out.print(it.next() + ", ");
//            }
//            System.out.println();
//
//
//            //isEmpty
//            if(!set.isEmpty()) {
//                System.out.println("set is not empty");
//            }
//        }
//    }

        public static void main(String args[]) {
            //Creation
            HashMap<String, Integer> map = new HashMap<>();


            //Insertion
            map.put("India", 120);
            map.put("US", 30);
            map.put("China", 150);


            System.out.println(map);


            map.put("China", 180);
            System.out.println(map);




            //Searching
            if(map.containsKey("Indonesia")) {
                System.out.println("key is present in the map");
            } else {
                System.out.println("key is not present in the map");
            }


            System.out.println(map.get("China")); //key exists
            System.out.println(map.get("Indonesia")); //key doesn't exist


            //Iteration (1)
            for( Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }


            //Iteration (2)
            Set<String> keys = map.keySet();
            for(String key : keys) {
                System.out.println(key+ " " + map.get(key));
            }
            //Removing
            map.remove("China");
            System.out.println(map);


        }
    }





