package org.cydeo;

public class Car {
    private String make;
    private String model;

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make) {
        this.make = make;
    }
}
