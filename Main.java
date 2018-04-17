package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Transportation App!");
        Car car1 = new Car(1, "red", 2);

        System.out.println("first car: " + car1);
        System.out.println();

        HovLane lane = new HovLane(car1);
        System.out.println("lane: " + lane);

        int size = lane.size();
        System.out.println("size: " + size);

        Car car2 = new Car(2, "blue", 3);

        lane = lane.prepend(car2);
        int size2 = lane.size();

        Car car3 = new Car(2,"yellow",3);

        lane = lane.prepend(car3);
        System.out.println("line: " + size2);

        System.out.println("head: " + lane.getHead() + "next: " + lane.getNext());


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

        fillHovLane(lane, 10, colorList);
        System.out.println("the list "+ lane);

        /*for (int i = 0; i < 5; i++) {
            System.out.print(lane.getNext());


        }
*/
        int newSize = lane.size();
        System.out.println();
        System.out.println("the size: " + newSize);
    }

    private static void fillHovLane(HovLane lane, int maxSpace, ArrayList<String> colors) {
        System.out.println("the size of Lane " + lane.size());
        Random rand = new Random();
        for (int i = 0; i < rand.nextInt(maxSpace); i++) {
            String color = colors.get(rand.nextInt(colors.size()));
            Car newCar = new Car(rand.nextInt(9999), color, rand.nextInt(5));
            System.out.println("LG "+ newCar);
            lane = lane.prepend(newCar);
            System.out.println("new size: " + lane.size());

        }

    }
}
