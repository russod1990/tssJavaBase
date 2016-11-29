/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class DemoOggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bicycle b1 = new Bicycle(10, 1);
        Bicycle b2 = new Bicycle(10, 1);

        Bicycle b3 = new Bicycle();
        Bicycle b4 = new Bicycle(1);
        System.out.println("numero istanze create: " + Bicycle.getNumeroIstanze());
    }

}
