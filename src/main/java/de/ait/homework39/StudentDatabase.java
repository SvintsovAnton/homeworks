package de.ait.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

    private Set<Student> students = new HashSet<>();

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (!getStudents().add(student)) {
            System.out.println("the student " + student.getName() + " is already in the database");
            return false;
        }
        System.out.println("student " + student.getName() + "  added to the database");
        return true;
    }

    public boolean removeStudent(Student student) {
        if (getStudents().contains(student)) {
            getStudents().remove(student);
            System.out.println("student " + student.getName() + "  removed from the database");
            return true;
        } else {
            System.out.println("the student " + student.getName() + " is not in the database");
            return false;
        }
    }

    public boolean containsStudent(Student student) {
        if (getStudents().contains(student)) {
            System.out.println("the student " + student.getName() + " is in the database");
            return true;
        }
        System.out.println("the student " + student.getName() + " is not in the database");
        return false;
    }

    public String printAllStudents() {
        String ollStudents = " ";
        for (Student studentInList : getStudents()) {
            ollStudents = ollStudents + studentInList.toString();
        }
        System.out.println(ollStudents);
        return ollStudents;
    }


    public boolean findStudent(String name) {
        for (Student studentInList : students) {
            if (name.equals(studentInList.getName())) {
                System.out.println("the student " + name + " is in the database");
                return true;
            }

        }
        System.out.println("the student " + name + " is not in the database");
        return false;
    }


}





