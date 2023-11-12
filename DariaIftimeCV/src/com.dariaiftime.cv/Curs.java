// Clasa pentru cursuri
package com.dariaiftime.cv;

public class Curs {
    private String numeCurs;

    // Constructor
    public Curs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    // Getter și Setter
    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Curs{" +
               "numeCurs='" + numeCurs + '\'' +
               '}';
    }
}