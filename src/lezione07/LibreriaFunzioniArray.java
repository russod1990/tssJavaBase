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

    private static void ordina(Persona[] elencoPersone) {
        boolean disordinato;
        do {
            disordinato = false;
            for (int i = 0; i < elencoPersone.length - 1; i++) {
                Persona p = elencoPersone[i];
                Persona pNext = elencoPersone[i + 1];
                if (p.compareTo(pNext) >= 0) {
                    elencoPersone[i] = pNext;
                    elencoPersone[i + 1] = p;
                    disordinato = true;
                }
            }
        } while (disordinato);
    }
}
