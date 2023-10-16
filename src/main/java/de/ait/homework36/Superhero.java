package de.ait.homework36;

public class Superhero {
    //field method
    private String name; //superhero name
    private int power; //superhero power level (from 1 to 10)
    private int age; //superhero age

    //constructor for the Superhero class

    public Superhero(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    //Getters and setters for fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //overridden method toString
    @Override
    public String toString() {
        return " Имя: [" + name + "]" +
                ", Сила: [" + power + "]" +
                ", Возраст: [" + age + "].";
    }

}
