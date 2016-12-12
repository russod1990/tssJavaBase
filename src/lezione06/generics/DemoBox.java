/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06.generics;

/**
 *
 * @author tss
 */
public class DemoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Box box = new Box(new Autista("Rossi", "Mario","B"));
        System.out.println(box);
        if (box.getObject() instanceof Persona) {
            Persona p = (Persona) box.getObject();
            System.out.println(p.toString());
        } else {
            System.err.println("errore");
        }

    }

}
