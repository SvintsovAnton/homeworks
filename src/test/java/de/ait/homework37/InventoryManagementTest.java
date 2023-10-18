package de.ait.homework37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagementTest {
    InventoryManagement inventoryManagement;

    @BeforeEach
    void setUp() {
        inventoryManagement = new InventoryManagement();
    }
@DisplayName("Add mobilephone in list")
    @Test
    void addMobileOnePhone() {
        MobilePhone galaxyZFlip5 = new MobilePhone(001,"Galaxy","Z Flip 5","Android",1319);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        Assertions.assertEquals(true,inventoryManagement.listOfMobilePhone.contains(galaxyZFlip5));
    }
    @DisplayName("Add mobilephones in list with same ID")
    @Test
    void addMobileTwoPhoneWithSameID() {
        MobilePhone galaxyZFlip5 = new MobilePhone(1,"Galaxy","Z Flip 5","Android",1319);
        MobilePhone galaxyZFold5 = new MobilePhone(1,"Galaxy","Z Fold 5","Android",1889);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        inventoryManagement.addMobilePhone(galaxyZFold5);
        Assertions.assertEquals(false,inventoryManagement.listOfMobilePhone.contains(galaxyZFold5));
    }

    @DisplayName("get mobilphone by ID")
    @Test
    void getMobilePhonePositiv() {
        MobilePhone galaxyZFlip5 = new MobilePhone(1,"Galaxy","Z Flip 5","Android",1319);
        MobilePhone galaxyZFold5 = new MobilePhone(2,"Galaxy","Z Fold 5","Android",1889);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        inventoryManagement.addMobilePhone(galaxyZFold5);
        Assertions.assertEquals(galaxyZFlip5,inventoryManagement.getMobilePhone(1));
    }
    @DisplayName("get a phone that is not on the list")
    @Test
    void getMobilePhoneNegativ() {
        MobilePhone galaxyZFlip5 = new MobilePhone(1,"Galaxy","Z Flip 5","Android",1319);
        MobilePhone galaxyZFold5 = new MobilePhone(2,"Galaxy","Z Fold 5","Android",1889);
        inventoryManagement.addMobilePhone(galaxyZFold5);
        Assertions.assertEquals(null,inventoryManagement.getMobilePhone(1));
    }


    @DisplayName("update a phone that is not on the list")
    @Test
    void updateMobilePhoneWithoutList() {
        MobilePhone galaxyZFlip5 = new MobilePhone(1,"Galaxy","Z Flip 5","Android",1319);
        MobilePhone galaxyZFold5 = new MobilePhone(2,"Galaxy","Z Fold 5","Android",1889);
        inventoryManagement.addMobilePhone(galaxyZFold5);
        inventoryManagement.updateMobilePhone(galaxyZFlip5,3,"Galaxy","Z Flip 5","Android",1319);
        Assertions.assertEquals(1,galaxyZFlip5.getId());
    }

    @DisplayName("update a phone without changes parameter")
    @Test
    void updateMobilePhoneWithoutСhanges() {
        MobilePhone galaxyZFlip5 = new MobilePhone(111,"Galaxy","Z Flip 5","Android",1319);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        inventoryManagement.updateMobilePhone(galaxyZFlip5,111,"Galaxy","Z Flip 5","Android",1319);
        Assertions.assertEquals(111,galaxyZFlip5.getId());
    }
    @DisplayName("update a phone with changes parameter")
    @Test
    void updateMobilePhoneWithСhanges() {
        MobilePhone galaxyZFlip5 = new MobilePhone(111,"Galaxy","Z Flip 5","Android",1319);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        inventoryManagement.updateMobilePhone(galaxyZFlip5,777,"Galaxy","Z Flip 5","Android",1319);
        Assertions.assertEquals(777,galaxyZFlip5.getId());
    }

    @DisplayName("delete a phone")
    @Test
    void deleteMobilePhone() {
        MobilePhone galaxyZFlip5 = new MobilePhone(1,"Galaxy","Z Flip 5","Android",1319);
        MobilePhone galaxyZFold5 = new MobilePhone(2,"Galaxy","Z Fold 5","Android",1889);
        inventoryManagement.addMobilePhone(galaxyZFold5);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        inventoryManagement.deleteMobilePhone(2);
        Assertions.assertEquals(false,inventoryManagement.listOfMobilePhone.contains(galaxyZFold5));
    }


   @DisplayName("get list of phones")
   @Test
    void listMobilePhones() {
        MobilePhone galaxyZFlip5 = new MobilePhone(1,"Galaxy","Z Flip 5","Android",1319);
        MobilePhone galaxyZFold5 = new MobilePhone(2,"Galaxy","Z Fold 5","Android",1889);
        inventoryManagement.addMobilePhone(galaxyZFold5);
        inventoryManagement.addMobilePhone(galaxyZFlip5);
        Assertions.assertEquals("{id=2, brand='Galaxy', model='Z Fold 5', operationSystem='Android', price=1889}{id=1, brand='Galaxy', model='Z Flip 5', operationSystem='Android', price=1319}",inventoryManagement.listMobilePhones());
    }
}