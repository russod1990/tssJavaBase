/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07;

/**
 *
 * @author tss
 */
public class Messaggio implements Comparable<Messaggio>{
    private String testo;

    public Messaggio(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public String toString() {
        return "Messaggio{" + "testo=" + testo + '}';
    }

    @Override
    public int compareTo(Messaggio o) {
        return this.testo.compareTo(o.getTesto());
    }
    
    
}
