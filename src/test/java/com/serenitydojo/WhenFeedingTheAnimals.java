package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", false);

        Assert.assertEquals("Tuna", food);
    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", false);

        Assert.assertEquals("Dog Food", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", true);

        Assert.assertEquals("Salmon", food);

    }

    @Test
    public void shouldFeedPremiumDogsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", true);

        Assert.assertEquals("Bone", food);

    }

    @Test
    public void shouldFeedPremiumHamstersPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", true);

        Assert.assertEquals("Lettuce", food);

    }
}
