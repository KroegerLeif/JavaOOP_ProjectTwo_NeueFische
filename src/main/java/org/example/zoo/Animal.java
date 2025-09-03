package org.example.zoo;

public record Animal(int id,
                     String name,
                     String species,
                     int age,
                     Owner owner){
}
