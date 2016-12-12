/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Autista extends Persona {

    private String patente;

    public Autista(String cognome, String nome, String patente) {
        super(cognome, nome);
        this.patente = patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return super.toString() + " , Patente: " + patente;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode() + Objects.hashCode(this.patente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }
        final Autista other = (Autista) obj;
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return true;
    }

}
