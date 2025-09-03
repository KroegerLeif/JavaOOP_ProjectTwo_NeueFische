package org.example.zoo;

import java.util.List;

public record Zoo(List<Animal> animals) {
    public int calculateFeedPerDayInGramm(){
        int sum = 0;
        for(Animal animal: animals){
            sum += animal.species().feedingramPerDay();
        }
        return sum;
    }
}
