package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public Enum feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            if (isPremium) {
                return SALMON;
            } else {
                return TUNA;
            }
        } else if (animal.equals("Dog")) {
            if (isPremium) {
                return BONE;
            } else {
                return DOG_FOOD;
            }
        } else {
            if (isPremium) {
                return LETTUCE;
            } else {
                return CABBAGE;
            }
        }
    }
}
