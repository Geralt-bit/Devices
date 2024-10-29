package org.example.devices;

public class Device {
    protected DeviceType type;
    protected String name;
    protected Double price;
    protected Double weight;

    public Device() {
    }

    public Device(DeviceType type, String name, Double price, Double weight){
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
