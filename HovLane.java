package com.company;

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

    public void prepend(Car car) {
       HovLane hHead = this.head.carConvert(this.head);
        hHead.next = head;
        head = car;


    }

    public HovLane carConvert(Car theCar){

        HovLane car = new HovLane(theCar);

        return car;
    }

    public int size() {
        int count = 1;
        HovLane temp = this;
        while (next != null) {

            count++;
            temp = temp.next;
        }
        return count;

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
