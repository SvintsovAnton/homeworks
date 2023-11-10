package de.ait.homework36;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName; //user_name is bad for code
    private int age;
    private List<String> friendsList = new ArrayList<>(); // String -> Object User

    public User(String name, int age) {
        this.userName = name;
        this.age = age; //mistaces
    }

    public String getName() { //GetName
         return userName;
    }

    public void setName(String newName) {
        this.userName = newName;
    } //SetName

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public void addFriend(String friendName) {
        friendsList.add(friendName);
    }

    public void removeFriend(String friendName) {
        friendsList.remove(friendName);
    }

    public List<String> getFriends() {
        return new ArrayList<>(friendsList);

    }
}