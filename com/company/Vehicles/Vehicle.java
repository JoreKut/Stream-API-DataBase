package com.company.Vehicles;

import com.company.Person.OutputFormat;

import java.util.Random;

public class Vehicle {
    public VehicleType vehicleType;
    public VehicleBrand brand;
    public int price;
    public int year;

    public Vehicle(VehicleType vehicleType, VehicleBrand brand, int price, int year) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public static Vehicle getRandomVehicle(){
        int price = 100000 + new Random().nextInt(10000000);
        int year = 1980 + new Random().nextInt(41);

        return new Vehicle(VehicleType.getRandomType(), VehicleBrand.getRandomBrand(), price, year);
    }

    public void starting(){
        System.out.println(vehicleType + " " + brand + " has started");
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public VehicleBrand getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return  String.format(OutputFormat.WordLength.value,  vehicleType )+
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value,  brand) +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, " price=" + price + "$  ") +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, year + "-year");
    }
    public static String getFields(){
        return  String.format(OutputFormat.WordLength.value, "VEHICLE TYPE") +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "VEHICLE BRAND")  +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "VEHICLE PRICE")  +
                String.format(OutputFormat.BracketLength.value, "|") +
                String.format(OutputFormat.WordLength.value, "VEHICLE YEAR");
    }

}
