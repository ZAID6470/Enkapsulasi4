/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasenkap4;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus3 Bus = new Bus3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();

        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
    }

}
