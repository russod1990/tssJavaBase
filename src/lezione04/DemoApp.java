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
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bici = new Bicycle(0, 1);
        bici.setSpeed(100);
        System.out.println(bici.getSpeed());
        
        Box box=new Box();
        box.setBici(bici);
        
        System.out.println("bici " + box.getBici());
    }
    
}
