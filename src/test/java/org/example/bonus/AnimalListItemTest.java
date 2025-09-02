package org.example.bonus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalListItemTest {

    @Test
    public void setNext_returnsTrue_givenNextElementIsNotNull() {
        //Given
        Animal dog = new Animal("dog",6);
        Animal cat = new Animal("cat", 2);
        AnimalListItem element1 = new AnimalListItem(dog);
        AnimalListItem element2 = new AnimalListItem(cat);
        boolean expected = true;
        //When
        element1.setNext(element2);
        boolean actual = element1.getNext().equals(element2);
        //Then
        assertEquals(expected, actual);
    }



}
