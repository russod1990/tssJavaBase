/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.ordinamento;

import lezione07.Persona;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    public static void main(String[] args) {
        Persona[] elencoPersone = new Persona[4];
        Persona a = new Persona("Rossi", "Mario");
        elencoPersone[0] = a;
        Persona b = new Persona("Verdi", "Luca");
        elencoPersone[1] = b;
        Persona c = new Persona("Bianchi", "Massimo");
        elencoPersone[2] = c;
        Persona d = new Persona("Magenta", "Tiziano");
        elencoPersone[3] = d;

        stampa(elencoPersone);

        ordina(elencoPersone);

        stampa(elencoPersone);
    }

    private static void ordina(Comparable<Persona>[] elencoPersone) {
        boolean disordinato;
        do {
            disordinato = false;
            for (int i = 0; i < elencoPersone.length - 1; i++) {
                Comparable p = elencoPersone[i];
                Comparable pNext = elencoPersone[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    elencoPersone[i] = pNext;
                    elencoPersone[i + 1] = p;
                    disordinato = true;
                }
            }
        } while (disordinato);
    }

    private static void stampa(Persona[] elencoPersone) {
        System.out.println("INIZIO STAMPA");
        for (Persona p : elencoPersone) {
            System.out.println(p);
        }
        System.out.println("FINE STAMPA");
    }

}
