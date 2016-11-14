/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione2;

/**
 * Esempio di commenti in Java
 *
 * @author tss
 */
public class Main {

    int colore; //variabile di istanza
    private static int carattere; // variabile statica

    /**
     * da questo metodo partirà l'esecuzione del programma
     *
     * @param args
     */
    public static void main(String[] args) {
        // commento su singola riga

        /*
        commento
        su
        più
        righe
         */
        /**
         * commento multiriga per i metodi (funzionalità)
         */
        System.out.println("Start esempio commenti ...");
        int totale = 10; //variabile locale
        if (totale > 0) {
            int x = 5; //variabile locale
        } else {
            int x = 5; //varibaile locale
        }
        int x = 10; //variabile locale
        System.out.println("" + totale);
    }

}
