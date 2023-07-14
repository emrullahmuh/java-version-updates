package org.example;

public class apple {
    private double weight;
    private color color;

    public apple(double weight, org.example.color color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public org.example.color getColor() {
        return color;
    }
}
