package com.company.Vehicles;

import java.util.Random;

public enum VehicleType {
    SEDAN,
    COUPE,
    SPORTS_CAR,
    STATION_WAGON,
    HATCHBACK,
    CONVERTIBLE,
    MINIVAN;

    public static VehicleType getRandomType(){
        int c = new Random().nextInt(VehicleType.values().length);
        return switch (c) {
            case 1 -> COUPE;
            case 2 -> SPORTS_CAR;
            case 3 -> STATION_WAGON;
            case 4 -> HATCHBACK;
            case 5 -> CONVERTIBLE;
            case 6 -> MINIVAN;
            default -> SEDAN;
        };
    }
}
