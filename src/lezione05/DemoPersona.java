/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05;

/**
 *
 * @author tss
 */
public class DemoPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Cognome", "Nome");
        //System.out.println(p.toString());
        Object o = p; // Object è l'oggetto base, quindi l'oggetto o. mostrerà solo le funzioni di Object e non quelle di Persona che estende Object
        Object q = new Persona("Rossi", "Mario"); // Object viene "sovraccaricato" con le funzioni di Persona in questa maniera
        //System.out.println(q.toString());
        Object a = new Autista("Rossi", "Mario", "B");
        //System.out.println(a.toString());
        Object[] persone = new Object[2];
        persone[0] = p;
        persone[1] = a;
        stampa(persone);
    }

    static void stampa(Object[] anagrafica) {
        for (Object z : anagrafica) {
            System.out.println(z.toString());
        }
    }
}
