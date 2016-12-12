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
public class DemoEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona a = new Persona("Rossi", "Mario");
        Persona b = a;

        System.out.println(a.equals(b));

    }

    static int cerca(Object[] anagrafica, Object elemento) {
        for (int i = 0; i < anagrafica.length; i++) {
            if (anagrafica[i].equals(elemento)) {
                return i;
            }

        }
        return -1;
    }
}
