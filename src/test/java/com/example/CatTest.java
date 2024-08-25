package com.example;

import org.junit.Test;
import org.mockito.Mockito;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class CatTest {

    public static final String MEOW = "Мяу";

    @Test
    public void getSound() {
        Feline mockFeline = Mockito.mock(Feline.class);
        Cat cat = new Cat(mockFeline);
        assertEquals(MEOW, cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Feline mockFeline = Mockito.mock(Feline.class);
        List<String> foodList = List.of("Мясо", "Рыба", "Птица");
        Mockito.when(mockFeline.eatMeat()).thenReturn(foodList);
        Cat cat = new Cat(mockFeline);
        assertEquals(foodList, cat.getFood());

    }
}