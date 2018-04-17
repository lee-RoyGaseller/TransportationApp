package com.company;

import java.util.Objects;

public class Car  {
    private int ID;
    private String color;
    private int num;




    public Car(int ID, String color, int num) {
        this.ID = ID;
        this.color = color;
        this.num = num;

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public HovLane carConvert(Car theCar){

        HovLane car = new HovLane(theCar);

        return car;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getID() == car.getID() &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getID(), getColor());
    }

    @Override
    public String toString() {
        return "Car{" + "ID=" + ID + ", color='" + color + '\'' + ", num=" + num + '}';
    }
}
