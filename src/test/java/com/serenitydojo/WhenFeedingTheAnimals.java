package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds("Cat", false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds("Hamster", false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds("Dog", false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds("Cat", true);

        Assert.assertEquals(SALMON, food);

    }

    @Test
    public void shouldFeedPremiumDogsPremiumFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds("Dog", true);

        Assert.assertEquals(BONE, food);

    }

    @Test
    public void shouldFeedPremiumHamstersPremiumFood() {
        Feeder feeder = new Feeder();

        Enum food = feeder.feeds("Hamster", true);

        Assert.assertEquals(LETTUCE, food);

    }
}
