package de.ait.homework37;

public class MobilePhone {

    //class fields

    private int id; //Mobile phone ID
    private String brand; //mobile phone brand
    private String model; //mobile phone model
    private String operationSystem; //mobile phone operating system
    private int price; //mobile phone price in euros

    //class constructor


    public MobilePhone(int id, String brand, String model, String operationSystem, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.operationSystem = operationSystem;
        if (price > 0) {  //preliminary price check
            this.price = price;
        } else {
            System.err.println("price cannot be negative");
        }
    }

    //Getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (this.price > 0) { //preliminary price check
            this.price = price;
        } else {
            System.err.println("price cannot be negative");
        }
    }

    //obtaining information about an object

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", price=" + price +
                '}';
    }
}
