package com.company;

import com.company.Person.Gender;
import com.company.Person.Person;
import com.company.Vehicles.VehicleType;

import java.util.ArrayList;
import java.util.Comparator;

public class LearningZone {

    ArrayList<Person> generation = new ArrayList<>();

    public void startExpedition(){
        int entityNumber = 150;

        for(int i = 0; i < entityNumber; i++){
            generation.add(Person.getUnknownPerson());
        }
        System.out.println(Person.getFields());

        generation.stream()
                .filter(p -> p.gender.equals(Gender.Female))
                .filter(p -> p.vehicle.vehicleType.equals(VehicleType.COUPE))
                .sorted(Comparator.comparingInt(Person::getMoney))
                .forEach(System.out::println);

    }

    void printGeneration(){
        for(Person p : generation){
            System.out.println(p);
        }
    }
}
