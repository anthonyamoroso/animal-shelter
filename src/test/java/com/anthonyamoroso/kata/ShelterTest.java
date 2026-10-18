package com.anthonyamoroso.kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ShelterTest {

    private final Shelter shelter = new Shelter();

    @Test
    void should_drop_and_adopt() {
        // Given
        Animal flocon = new Animal("FLOCON");
        Animal nougat = new Animal("NOUGAT");

        // When
        shelter.drop(flocon);
        shelter.drop(nougat);
        Optional<Animal> firstAdopted = shelter.adopt();
        Optional<Animal> secondAdopted = shelter.adopt();
        Optional<Animal> thirdAdopted = shelter.adopt();

        // Then
        assertTrue(firstAdopted.isPresent());
        assertEquals(flocon, firstAdopted.get());

        assertTrue(secondAdopted.isPresent());
        assertEquals(nougat, secondAdopted.get());

        assertTrue(thirdAdopted.isEmpty());
    }
}