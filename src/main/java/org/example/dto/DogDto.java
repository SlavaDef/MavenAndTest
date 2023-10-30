package org.example.dto;

public class DogDto {

    private String name;
    private int age;

    private int yearOfBirth;
    private String passport;
    private String address;

    public DogDto() {
    }

    public DogDto(String name, int age, int yearOfBirth, String passport, String address) {
        this.name = name;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
        this.passport = passport;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DogDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                ", passport='" + passport + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
