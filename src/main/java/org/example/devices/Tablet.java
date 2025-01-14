package org.example.devices;

public class Tablet extends Device {
    protected double butteryLife;
    protected boolean hasStylus;  // Change to boolean

    public Tablet() {}

    public Tablet(DeviceType type, String name, Double price, Double weight, Double butteryLife, boolean hasStylus) {
        super(type, name, price, weight);
        this.butteryLife = butteryLife;
        this.hasStylus = hasStylus;
    }

    public double getButteryLife() {
        return butteryLife;
    }

    public void setButteryLife(double butteryLife) {
        this.butteryLife = butteryLife;
    }

    public boolean isHasStylus() {  // Change the return type to boolean
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {  // Change parameter type to boolean
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", butteryLife=" + butteryLife +
                ", hasStylus=" + hasStylus +
                '}';
    }
}
