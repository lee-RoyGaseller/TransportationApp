package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Transportation App!");
        Car car1 = new Car(1,"red", 2);

        System.out.println("first car: "+ car1);
        System.out.println();

        HovLane lane = new HovLane(car1);
        System.out.println("lane: " + lane);

        int size = lane.size();
        System.out.println("size: "+ size);

        Car car2 = new Car(2,"blue", 3);

        HovLane newLane = lane.prepend(car2);
        int size2 = newLane.size();
        System.out.println("line: " + size2);

        System.out.println("head: " + newLane.getHead() + "next: " +newLane.getNext());

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("red");
        colorList.add("blue");
        colorList.add("green");
        colorList.add("purple");
        colorList.add("orange");
        colorList.add("yellow");
        colorList.add("grey");
        colorList.add("silver");
        colorList.add("white");


        /*

        Car car3 = new Car(3, "green");

        lane.preppend(car3);

        System.out.println("lane: " + lane);

        int laneSize = lane.size();

        System.out.println("size: "+ laneSize);
        */




    }
}
