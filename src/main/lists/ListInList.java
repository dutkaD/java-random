package main.lists;

import java.util.ArrayList;
import java.util.List;

public class ListInList {
    public static void main(String[] args) {

        // Create a list of fruits
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Create an empty list with three empty lists inside
        List<List<String>> nestedEmptyLists = new ArrayList<>();
        nestedEmptyLists.add(new ArrayList<>()); // Create the first "bucket" for the fruit name length <= 4
        nestedEmptyLists.add(new ArrayList<>()); // Create the second "bucket" for the fruit name length > 4 and <= 6
        nestedEmptyLists.add(new ArrayList<>()); // Create the third "bucket" for the fruit name length > 6

        // Print the list of fruits
        System.out.println("List of Fruits: " + fruits);



        // Print the nested empty lists
        System.out.println("Nested Empty Lists: " + nestedEmptyLists);
    }
}
