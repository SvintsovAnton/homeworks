package de.ait.lombok;

public class TestStudent {

    static Student studentNumberOne = new Student("Max","Müller");
    static StudentLombok studentLombok = new StudentLombok();

    public static void main(String[] args) {
        studentNumberOne.setFirstName("Maxim");
        studentLombok.setFirstName("Annika");
    }
}
