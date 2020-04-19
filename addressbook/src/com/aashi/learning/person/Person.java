package com.aashi.learning.person;

import java.util.Objects;

//every class in Java inherits from a class called Object. Object class has few functions.
public class Person {
    //default constructor
    public Person(){
        System.out.println("Calling default constructor");
    }

    //custom constructor
    public Person(String fName, String lName, int age){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    private String firstName;
    private String lastName;
    private int age;
    public int abc;//public variable.. dont need getter and setter
    public static int shared;//class level variable

    //getters and setters
    //getters help to read the value of a variable
    //setter help to write the value of a variable.

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //function coming from Object class to show the values of the object when the object is printed
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", abc=" + abc +
                ", shared=" + shared +
                '}';
    }


    //coming from Object class. Helps compare two objects with their values.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName());
    }

    //dont worry about it
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge());
    }
}
