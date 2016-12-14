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
public class LibreriaFunzioniArray {

    private LibreriaFunzioniArray() {

    }

    public static void ordina(Comparable[] array) {
        boolean disordinato;
        do {
            disordinato = false;
            for (int i = 0; i < array.length - 1; i++) {
                Comparable p = array[i];
                Comparable pNext = array[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    array[i] = pNext;
                    array[i + 1] = p;
                    disordinato = true;
                }
            }
        } while (disordinato);
    }

    public static void stampa(Object[] objects) {
        System.out.println("INIZIO STAMPA");
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println("FINE STAMPA");
    }
}
