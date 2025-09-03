package org.example.zoo;

public class ZooMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1, "Pinguin", "Pinguin", 1);
        Animal animal2 = new Animal(2, "Katze", "Katze", 2);
        Animal animal3 = new Animal(3, "Hund", "Hund", 3);
        Animal animal4 = new Animal(4, "Eule", "Eule", 4);

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
    }
}
