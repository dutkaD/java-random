//package main;
//
//
//import java.util.ArrayList;
//
//public class GuestList {
//
//    public final static int GUESTS_MAX = 50;
//
//    public final static double PRICE_ADULT = 55.95;
//
//    public final static double PRICE_CHILD = 32.2;
//
//    private final static int START_ADULT_AGE = 12;
//
//
//    public static void checkGuestCount(int numberOfGuests) {
//        if (numberOfGuests > GUESTS_MAX) {
//            System.out.println("Es sind zu viele Gäste!");
//        } else {
//            System.out.println("Die Anzahl der Gäste ist im akzeptablen Bereich.");
//        }
//    }
//
//
//    // for each guest, anzahl getraenke, anzahlt food, pauschal preis
//    public static double getWeddingCosts(ArrayList<Guest> guestAges) {
//        if (guestAges.size() > GUESTS_MAX) {
//            System.out.println("Es sind zu viele Gäste!");
//            return -1;
//        } else {
//            System.out.println("Die Anzahl der Gäste ist im akzeptablen Bereich.");
//            double sum = 0;
//            for (int age : guestAges) {
//                if (age <= 11) {
//                    sum += PRICE_CHILD;
//                } else {
//                    sum += PRICE_ADULT;
//                }
//            }
//            return sum;
//        }
//
//    }
//
//
//}
