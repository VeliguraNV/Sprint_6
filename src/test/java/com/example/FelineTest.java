package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    public static final String EXPECTED_GET_FAMILY = "Кошачьи";

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedListFood, feline.eatMeat());


    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals(EXPECTED_GET_FAMILY, feline.getFamily());
    }

    @Test
    public void getKittensWithEmptyParam() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithParam() {
        Feline feline = new Feline();
        assertEquals(2, feline.getKittens(2));
    }
}