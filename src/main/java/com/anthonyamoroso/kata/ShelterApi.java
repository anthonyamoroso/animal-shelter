package com.anthonyamoroso.kata;

import java.util.Optional;

public interface ShelterApi {

    void drop(Animal animal);

    Optional<Animal> adopt();
}
