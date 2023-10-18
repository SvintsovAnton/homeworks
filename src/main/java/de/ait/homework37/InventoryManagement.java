package de.ait.homework37;

import java.util.ArrayList;
import java.util.Iterator;

public class InventoryManagement {

    ArrayList<MobilePhone> listOfMobilePhone = new ArrayList<>(); //listOfMobilePhone used for storing Mobile Phone objects

    //method to add a new mobile phone to the list.
    //Condition: impossible to add two phones with the same ID
    public void addMobilePhone(MobilePhone phone) {
        boolean identicalID = false; //flag indicating the presence of identical IDs
        for (MobilePhone phoneInList : listOfMobilePhone) { //checking for identical ID
            if (phoneInList.getId() == phone.getId()) {
                identicalID = true;
            }
        }
        if (identicalID) {
            System.out.println("it is impossible to add two phones with the same ID");
        } else {
            listOfMobilePhone.add(phone);
        }
    }

    //method for searching and obtaining a mobile phone by ID.
    public MobilePhone getMobilePhone(int id) {
        boolean absenceOfObject = true; //flag indicating the absence of an object
        for (MobilePhone phoneInList : listOfMobilePhone) {
            if (phoneInList.getId() == id) {
                absenceOfObject = false;
                return phoneInList;
            }
        }
        System.out.println("Mobile phone with this ID is not in the database");
        return null;
    }

    //method to update information about an existing mobile phone
    //(if changes are necessary or if errors are found in the name, price, etc.)
    //Condition: mobile phone must be on listOfMobilePhone
    public void updateMobilePhone(MobilePhone phone, int id,String brand, String model,String operationSystem,int price) {
        if (listOfMobilePhone.contains(phone)) {
            phone.setId(id);
            phone.setBrand(brand);
            phone.setModel(model);
            phone.setOperationSystem(operationSystem);
            phone.setPrice(price);
            }
        else {
            System.out.println("the mobile phone is not in the list, to make changes it must be added to the list");
        }}

    //method for deleting a mobile phone by ID.
    public void deleteMobilePhone(int id) {
        Iterator<MobilePhone> phoneIterator = listOfMobilePhone.iterator();
        while (phoneIterator.hasNext()) {
            MobilePhone nextPhone = phoneIterator.next();
            if (nextPhone.getId() == id) {
                phoneIterator.remove();
            }
        }
    }

    //Gets a list of all mobile phones in inventory.
    public String listMobilePhones() {
        String informationAboutPhone="";
        for (MobilePhone phoneInList : listOfMobilePhone) {
            informationAboutPhone = informationAboutPhone+phoneInList.toString();
        }
        return informationAboutPhone;
    }

}


/*  Вначале я создал данный метод, однако  его не получилось протестировать и я создал другой метод выше
  public void updateMobilePhone(MobilePhone phone) {
        if (listOfMobilePhone.contains(phone)) {
            System.out.println("Update information about Mobile Phone: " + phone.toString());
            System.out.println("Enter new ID or 0 if ID remains unchanged");
            int newId = new java.util.Scanner(System.in).nextInt();
            if (newId != 0) {
                phone.setId(newId);
            }
            System.out.println("Enter new brand or 0 if brand remains unchanged");
            String newBrand = new java.util.Scanner(System.in).nextLine();
            if (!newBrand.equals("0")) {
                phone.setBrand(newBrand);
            }
            System.out.println("Enter new model or 0 if model remains unchanged");
            String newModel = new java.util.Scanner(System.in).nextLine();
            if (!newModel.equals("0")) {
                phone.setModel(newModel);
            }
            System.out.println("Enter new operation system or 0 if operation system  remains unchanged");
            String newOpearationSystem = new java.util.Scanner(System.in).nextLine();
            if (!newOpearationSystem.equals("0")) {
                phone.setOperationSystem(newOpearationSystem);
            }
            System.out.println("Enter new price or 0 if price remains unchanged");
            int newPrice = new java.util.Scanner(System.in).nextInt();
            if (newPrice != 0) {
                phone.setPrice(newPrice);
            }
        } else {
            System.out.println("the mobile phone is not in the list, to make changes it must be added to the list");
        }
    } */


