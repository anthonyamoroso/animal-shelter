package com.anthonyamoroso.kata;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class Shelter implements ShelterApi {

    private Queue<Animal> shelter = new LinkedList<>();

    @Override
    public void drop(Animal animal) {
        shelter.add(animal);
    }

    @Override
    public Optional<Animal> adopt() {
        return Optional.ofNullable(shelter.poll());
    }
}
