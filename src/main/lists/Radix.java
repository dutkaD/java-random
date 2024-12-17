package main.lists;

import main.lists.PinguLib.*;

import java.util.ArrayList;

import static main.lists.PinguLib.charAt;

public class Radix {


    public static void radixSort(StringList unsorted) {

        //find longest String by always taking the longer String and changing maxLength to new length
        int maxLength = 0;
        //for schleife wenn s länger als maxLength ist ->(return) maxLength zu s.length
        for (String s : unsorted) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }

        for (int i = maxLength - 1; i >= 0; i--) {
            StringList[] buckets = new StringList[256]; // this line creates a list with 256 nulls inside


            for (String s : unsorted) {
                char c = charAt(s, i);
                // Note: int ascii = (int) c musst du nicht verwenden! Du kannst direkt 'c' als index vom Bucket benutzen

                // before we add a word to a bucket -> we need to create an empty list for the bucket at position 'c'
                if (buckets[c] == null) {
                    buckets[c] = new StringList();
                }

                buckets[c].add(s);
            }

            int s = unsorted.size();
            for (int j = 0; j < s; j++) {
                unsorted.remove(0);
            }

            // FIXME: statt buckets[j] kannst du hier 'l' verwenden
            // z.b da wo du if(buckets[j] != null) machst -> if(l != null)
            // NOTE: wenn du "!=" Vergleich machst, bitte kein Space zwischen ! und = , sonst funktioniert es nicht

            //            for(StringList l: buckets){
            //                if(buckets[j] != null){
            //                    unsorted.addAll(buckets[j]);
            //                    buckets[j] = new StringList();//gesammter Bucket mit drin (neue sortierte Liste)
            //                }
            //            }


            // TODO: verwende diese Zeile um zu sehen was nach dem sort in unsorted drinnen liegt
            System.out.println(unsorted);
        }
    }
}

