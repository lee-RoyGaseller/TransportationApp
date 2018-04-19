package com.company;

import java.util.ArrayList;

public class HovLane {
    private Car head;
    private HovLane next;

    public HovLane(Car head) {
        this.head = head;
        next = null;
    }

    public HovLane() {
    }

    public Car getHead() {
        return head;
    }

    public void setHead(Car head) {
        this.head = head;
    }

    public HovLane getNext() {
        return next;
    }

    public void setNext(HovLane next) {
        this.next = next;
    }

    public HovLane prepend(Car car) {
       HovLane head = new HovLane(car);
        head.next = this;
        return head;
    }

    public int size() {
        int count = 1;
        HovLane temp = this;
        while (temp.next != null) {

            count++;
            temp = temp.next;
        }
        return count;

    }

    public int howManyCarsAreOfThisColor(String color){
        int count = 0;
        HovLane temp = this;
        while (temp.next != null) {
            if(temp.getHead().getColor().equals(color)){
                count++;
            }
            temp = temp.next;
        }
        return count;


    }



    public ArrayList<Integer> idsOfCarsHaveThisManyPassengers(int amountOfPassengers){
        ArrayList<Integer> listOfIds = new ArrayList<>();
        HovLane temp = this;
        while (temp.next != null) {
            if(temp.getHead().getNumOfPassengers() == 1){
                listOfIds.add(temp.getHead().getID());
            }
            temp = temp.next;
        }
        return listOfIds;


    }

    @Override
    public String toString() {
        if(next == null) {
            return head.toString();
        }
        else {
            return head + next.toString();
        }
    }
}
