package org.example.zoo;

public class ZooMain {
    public static void main(String[] args) {
        Species bird = new Species("Bird", 10);
        Species cat = new Species("Cat", 5);
        Species dog = new Species("Dog", 5);

        Animal animal1 = new Animal(1, "Pinguin", bird, 1,new Owner("John", 20, "Street 123"));
        Animal animal2 = new Animal(2, "Katze", cat, 2,new Owner("Jane", 25, "Street 123"));
        Animal animal3 = new Animal(3, "Hund", dog, 3,new Owner("Jane", 27, "Street 123"));
        Animal animal4 = new Animal(4, "Eule", bird, 4,new Owner("Jane", 29, "Street 123"));

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
    }
}
