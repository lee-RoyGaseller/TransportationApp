package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Transportation App!");
        Car car1 = new Car(1,"red");

        System.out.println("first car: "+ car1);
        System.out.println();

        HovLane lane = new HovLane(car1);
        System.out.println("lane: " + lane);

        int size = lane.size();
        System.out.println("size: "+ size);

        Car car2 = new Car(2,"blue");

        lane.prepend(car2);
        System.out.println("line: " + size);
        /*

        Car car3 = new Car(3, "green");

        lane.preppend(car3);

        System.out.println("lane: " + lane);

        int laneSize = lane.size();

        System.out.println("size: "+ laneSize);
        */




    }
}
