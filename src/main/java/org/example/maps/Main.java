package org.example.maps;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        Medication medication = new Medication("Paracetamol", 100, true);
        Medication medication2 = new Medication("Aspirin", 100, true);
        Medication medication3 = new Medication("Magnesium", 10, false);
        Medication medication4 = new Medication("Eisen", 100, true);
        pharmacy.save(medication);
        pharmacy.save(medication2);
        pharmacy.save(medication3);
        pharmacy.save(medication4);
        System.out.println(pharmacy.getCount());
        System.out.println(pharmacy.findMedication("Aspirin"));
        pharmacy.delete("Aspirin");
        System.out.println(pharmacy.getCount());
        System.out.println(pharmacy.findMedication("Aspirin"));
        System.out.println(pharmacy);
        pharmacy.printAllMedications();
    }
}
