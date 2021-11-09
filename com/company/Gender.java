package com.company;

import java.util.Random;

public enum Gender {
    Male,
    Female;

    public static Gender getRandomGender(){
        int c = new Random().nextInt(Gender.values().length);
        if (c == 0) return Male;

        return Female;
    }
}
