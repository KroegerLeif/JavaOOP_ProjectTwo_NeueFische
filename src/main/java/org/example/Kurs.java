package org.example;

import java.util.Objects;

public class Kurs {
    private String kursName;
    private String dozent;
    private String raum;

    public Kurs(String kursName, String dozent, String raum) {
        this.kursName = kursName;
        this.dozent = dozent;
        this.raum = raum;
    }

    public String getKursName() {
        return kursName;
    }
    public String getDozent() {
        return dozent;
    }
    public String getRaum() {
        return raum;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Kurs kurs)) return false;
        return Objects.equals(kursName, kurs.kursName) && Objects.equals(dozent, kurs.dozent) && Objects.equals(raum, kurs.raum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kursName, dozent, raum);
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "kursName='" + kursName + '\'' +
                ", dozent='" + dozent + '\'' +
                ", raum='" + raum + '\'' +
                '}';
    }
}
