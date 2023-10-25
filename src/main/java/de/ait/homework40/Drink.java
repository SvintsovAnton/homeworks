package de.ait.homework40;

public class Drink {
    private String name;
    private String type;
    private double volume;

    public Drink(String name, String type, double volume) {
        this.name = name;
        this.type = type;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


}
