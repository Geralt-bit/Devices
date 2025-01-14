package org.example.devices;

public class Laptop extends Device {
    protected int ramSize;
    protected String processorType;

    public Laptop() {
    }

    public Laptop(DeviceType type, String name, Double price, Double weight, int ramSize, String processorType) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", ram size=" + ramSize +
                ", processor type='" + processorType + '\'' +
                '}';
    }
}
