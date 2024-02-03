
//Operations :

//        Declare an ArrayList of different Types
//        Add Element
//        Get Element
//        Add Element at a specific Index
//        Set Element at a specific Index
//        Delete Element from an Index
//        Size of the List
//        Loop/Iterate on the List
//        Sort the List

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        // Get an element
        int element = list.get(0);
        System.out.println("Element at index 0: " + element);

        // Add element in between
        list.add(1, 2);
        System.out.println("List after adding 2 at index 1: " + list);

        // Set element
        list.set(0, 0);
        System.out.println("List after setting element at index 0 to 0: " + list);

        // Delete element
        list.remove(0);
        System.out.println("List after removing element at index 0: " + list);

        // Get size of list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Loop through the list
        System.out.print("Elements of the list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sort the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }
}
