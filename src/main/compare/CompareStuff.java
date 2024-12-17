package main.compare;

import main.NormalGuest;

import java.util.*;

public class CompareStuff {

    public static void main(String[] args) {

        String[] someWords = {"fog", "table", "carton"};





        // part 1
        List<String> list  = List.of("Apple", "Carrot", "Cherry");
        List<Integer> integers  = List.of(1, 2, 3);
        List<NormalGuest> guests = List.of();


        Collections.sort(list);
        List<String> something = new ArrayList<>();

        // part 2

        // use my comparator
        Collections.sort(list, new MyComparator());

        List<String> names = Arrays.asList("Alice", "Bob", "Charles");
        // Custom sorting by length (without lambda)
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });



        System.out.println(names); // Output: [Bob, Alice, Charles]

        // part 3
        Collections.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        // or
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

    }
}
