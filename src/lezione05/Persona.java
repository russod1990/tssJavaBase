/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Persona {

    // Anagrafica
    private String cognome;
    private String nome;
    private String sesso[] = {"M", "F"};
    private Date dataNascita;

    // Costruttore vuoto
    public Persona() {
    }

    // Costruttore generico
    public Persona(String cognome, String nome, String sesso[], Date dataNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.sesso = sesso;
        this.dataNascita = dataNascita;
    }

    // Costruttore NOMECOGNOME
    public Persona(String cognome, String nome) {
        this(cognome, nome, null, null); // richiama il costrutto generico
    }

    // get nominativo generico
    public String getNominativo() {
        String nominativo = this.cognome + " " + this.nome;
        return nominativo;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Override del metodo toString della primitiva Object
    @Override
    public String toString() {
        return cognome + " , " + nome; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.cognome);
        hash = 61 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

}
