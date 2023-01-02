package com.hillel.shevchenko.HomeWork14;

public class FitnessTracker {

    private final String name;
    private final int birthday;
    private final String monthOfBirthday;
    private final int ageOfBirthday;
    private int age;
    private final String email;
    private final int phoneNumber;

    public String surname;
    public int weight;
    public int firstPressureIndicator;
    public int secondPressureIndicator;
    public int NumberOfStepsPerDay;

    public FitnessTracker(String name, int birthday, String monthOfBirthday, int ageOfBirthday, String email,
                          int phoneNumber, String surname, int weight, int firstPressureIndicator,
                          int secondPressureIndicator, int numberOfStepsPerDay) {
        this.name = name;
        this.birthday = birthday;
        this.monthOfBirthday = monthOfBirthday;
        this.ageOfBirthday = ageOfBirthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.firstPressureIndicator = firstPressureIndicator;
        this.secondPressureIndicator = secondPressureIndicator;
        NumberOfStepsPerDay = numberOfStepsPerDay;
    }

    private int getAge() {
        this.age = 2020 - this.ageOfBirthday;
        return age;
    }


    public void printAccountInfo() {
        System.out.println("FitnessTracker {" +
                "name ='" + name + '\'' +
                ", birthday = " + birthday +
                ", monthOfBirthday = '" + monthOfBirthday + '\'' +
                ", ageOfBirthday = " + ageOfBirthday +
                ", age = " + getAge() +
                ", email = '" + email + '\'' +
                ", phoneNumber = " + phoneNumber +
                ", surname = '" + surname + '\'' +
                ", weight = " + weight +
                ", firstPressureIndicator = " + firstPressureIndicator +
                ", secondPressureIndicator = " + secondPressureIndicator +
                ", NumberOfStepsPerDa y= " + NumberOfStepsPerDay +
                '}');
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public int getAgeOfBirthday() {
        return ageOfBirthday;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getFirstPressureIndicator() {
        return firstPressureIndicator;
    }

    public int getSecondPressureIndicator() {
        return secondPressureIndicator;
    }

    public int getNumberOfStepsPerDay() {
        return NumberOfStepsPerDay;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFirstPressureIndicator(int firstPressureIndicator) {
        this.firstPressureIndicator = firstPressureIndicator;
    }

    public void setSecondPressureIndicator(int secondPressureIndicator) {
        this.secondPressureIndicator = secondPressureIndicator;
    }

    public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
        NumberOfStepsPerDay = numberOfStepsPerDay;
    }
}
