package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        VIPGuest vipOne = new VIPGuest("Diana", 30);
        System.out.println("Guest 2: " + vipOne.getName());

        VIPGuest vipTwo = new VIPGuest("Bob", 15);
        System.out.println("Vip guest " + vipTwo.getName());

        NormalGuest normal = new NormalGuest("Carl", 65);
        System.out.println("Normal guest " + normal.getName());

        ArrayList<VIPGuest> vipGuests = new ArrayList<>();
        vipGuests.add(vipOne);
















        ArrayList<Integer> integers = new ArrayList();

        ArrayList<Guest> listguest = new ArrayList();
        listguest.add(vipOne);
        listguest.add(vipTwo);
        listguest.add(normal);









    }

}
