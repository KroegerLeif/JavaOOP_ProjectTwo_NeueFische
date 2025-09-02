package org.example.maps;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;

    public Pharmacy() {
        this.medications = new HashMap<>();
    }

    public Pharmacy(Map<String, Medication> medications) {
        this.medications = medications;
    }

    public int getCount(){
        return medications.size();
    }

    public void save(Medication medication){
        medications.put(medication.getName(), medication);
    }

    public Medication findMedication(String medicationName){
        return medications.get(medicationName);
    }

    public void delete(String medicationName){
        medications.remove(medicationName);
    }

    public void printAllMedications() {
        System.out.println("Alle Medikamente:");
        for(Map.Entry<String,Medication> entry : medications.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "medications=" + medications +
                '}';
    }
}
