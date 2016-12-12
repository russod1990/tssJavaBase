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

        Box box = new Box(new Persona("Rossi", "Mario"));
        System.out.println(box);
        Persona object = (Persona) box.getObject();
        
    }

}
