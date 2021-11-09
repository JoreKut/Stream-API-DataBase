package com.company.Person;

import com.company.Vehicles.Vehicle;

import java.util.Random;

public class Person {

    private static final String[] Names = {"Daniil", "Yaroslav", "Alexander", "Kirill", " Egor", "Pavel", "Vasiliy"};


    public Gender gender;
    public Vehicle vehicle;
    public String name;
    public int height;
    public int weight;
    public int money;

    public Person(Gender gender, Vehicle vehicle, String name, int height, int weight, int money) {
        this.gender = gender;
        this.vehicle = vehicle;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public static Person getUnknownPerson(){

        int height = 160 + new Random().nextInt(50);
        int weight = 50 + new Random().nextInt(70);
        int money = 16000 + new Random().nextInt(500000);

        String name = Names[new Random().nextInt(Names.length)];

        return new Person(Gender.getRandomGender(), Vehicle.getRandomVehicle(), name, height, weight, money);
    }

    public Gender getGender() {
        return gender;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return  String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, '\'' + name + '\'') +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value,  gender) +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value,  vehicle) +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, " height=" + height) +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, " weight=" + weight) +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, " money=" + money) +
                String.format(OutputFormat.BracketLength.value, "|");
    }

    public static String getFields(){
        return  String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "NAME") +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "GENDER") +
                String.format(OutputFormat.BracketLength.value, "|") +
                Vehicle.getFields()  +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "HEIGHT") +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "WEIGHT") +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "MONEY") +
                String.format(OutputFormat.BracketLength.value, "|") +
                "\n" + "-".repeat((OutputFormat.wordLength + OutputFormat.bracketLength) * 9 );
    }
}
