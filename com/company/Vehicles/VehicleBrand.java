package com.company.Vehicles;

import java.util.Random;

public enum VehicleBrand {
    Acura,
    Lucid,
    Maserati,
    Porsche,
    Subaru,
    Suzuki,
    Tesla,
    Toyota,
    Volvo;

    public static VehicleBrand getRandomBrand(){
        int c  = new Random().nextInt(VehicleBrand.values().length);

        return switch (c) {
            case 1 -> Lucid;
            case 2 -> Maserati;
            case 3 -> Porsche;
            case 4 -> Subaru;
            case 5 -> Suzuki;
            case 6 -> Tesla;
            case 7 -> Toyota;
            case 8 -> Volvo;
            default -> Acura;
        };
    }

}
