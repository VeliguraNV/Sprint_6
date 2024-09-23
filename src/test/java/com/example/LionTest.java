package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;


public class LionTest {

    @Test
    public void getKittens() throws Exception {
        Feline mockitoFeline = Mockito.mock(Feline.class);
        Mockito.when(mockitoFeline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", mockitoFeline);
        assertEquals(1, lion.getKittens());

    }


    @Test
    public void getFood() throws Exception {
        Feline mockitoFeline = Mockito.mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockitoFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", mockitoFeline);
        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void lionConstructorTrowsException() {
        Feline mockitoFeline = Mockito.mock(Feline.class);
        assertThrows(Exception.class, () -> new Lion("Трансгендер", mockitoFeline));
    }
}