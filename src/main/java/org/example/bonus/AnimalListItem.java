package org.example.bonus;

import java.util.Objects;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;


    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public AnimalListItem getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AnimalListItem that)) return false;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
