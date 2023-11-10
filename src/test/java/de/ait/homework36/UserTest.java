package de.ait.homework36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    @BeforeEach
    public void setUp(){
        user = new User("Иван", 30);
    }

    @Test
    public void testGetName(){
        User anton = new User("Anton",29);
        assertEquals("Anton",anton.getName());
    }

    @Test
    public void testSetName(){
        User anna = new User("Anna",18);
        anna.setName("Anna W");
        assertEquals("Anna W",anna.getName());
    }


    @Test
    void testGetAge() {
        assertEquals(30, user.getAge());
    }

    @Test
    void testSetAge() {
        user.setAge(20);
        assertEquals(20, user.getAge());
    }


    @Test
    void testAddFriend() {
        user.addFriend("Маша");
        user.addFriend("Оля");
        List<String> expectedFriends = new ArrayList<>();
        expectedFriends.add("Маша");
        expectedFriends.add("Оля");
        assertEquals(expectedFriends, user.getFriends());
    }

    @Test
    void testRemoveFriend() {
        user.addFriend("Саша");
        user.addFriend("Маша");
        user.removeFriend("Саша");
        ArrayList<String> expectedFriends = new ArrayList<>();
        expectedFriends.add("Маша");
        assertEquals(expectedFriends, user.getFriends());
    }




}
