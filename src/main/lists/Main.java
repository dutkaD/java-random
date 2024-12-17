package main.lists;

import main.lists.PinguLib.StringList;

public class Main {
    public static void main(String[] args) {

        StringList stringList = new StringList();
        stringList.add("cat");
        stringList.add("bed");
        stringList.add("Red");
        stringList.add("flat");

        Radix.radixSort(stringList);

    }
}

//        // TODO: Group fruits by their name length. There need to be three groups
//        // 1 ->  for the fruit name length <= 4
//        // 2 ->  for the fruit name length > 4 and <= 6
//        // 3 ->  for the fruit name length > 6
//
//        // Print the results
//        // -> Short names: Date
//        // -> Middle names: Apple, Banana, Cherry
//        // -> Long names: Elderberry
//
////        List<String> fruits = new ArrayList<>();
////        fruits.add("Apple");
////        fruits.add("Banana");
////        fruits.add("Cherry");
////        fruits.add("Date");
////        fruits.add("Elderberry");
//
//    }
//}
