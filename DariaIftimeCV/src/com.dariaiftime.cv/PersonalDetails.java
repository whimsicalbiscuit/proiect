// Clasa pentru datele personale
package com.dariaiftime.cv;

public class PersonalDetails {
    private String nume;
    private int varsta;
    private String liceu;
    private String experientaProfesionala;

    // Constructor
    public PersonalDetails(String nume, int varsta, String liceu, String experientaProfesionala) {
        this.nume = nume;
        this.varsta = varsta;
        this.liceu = liceu;
        this.experientaProfesionala = experientaProfesionala;
    }

    // Getters și Setters
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getLiceu() {
        return liceu;
    }

    public void setLiceu(String liceu) {
        this.liceu = liceu;
    }

    public String getExperientaProfesionala() {
        return experientaProfesionala;
    }

    public void setExperientaProfesionala(String experientaProfesionala) {
        this.experientaProfesionala = experientaProfesionala;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "PersonalDetails{" +
               "nume='" + nume + '\'' +
               ", varsta=" + varsta +
               ", liceu='" + liceu + '\'' +
               ", experientaProfesionala='" + experientaProfesionala + '\'' +
               '}';
    }
}
