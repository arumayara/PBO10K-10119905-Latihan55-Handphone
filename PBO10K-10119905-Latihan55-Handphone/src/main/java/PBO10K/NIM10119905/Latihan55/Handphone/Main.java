/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan55.Handphone;

/**
 *
 * @author
 * Nama  : Abraham Rumayara
 * KELAS : IF10K
 * NIM   : 10119905
 * Deskripsi Program : Program Handphone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Android objAndroid = new Android("Samsung","Android","Grand",3000000);
        objAndroid.display();
        objAndroid.setKeyStore("234ibfd3840fo");
        objAndroid.getKeyStore();
        
        BlackBerry objBlackBerry = new BlackBerry("BlackB","RIM","Curve",2000000);
        objBlackBerry.display();
        objBlackBerry.setPinBB("BHS249");
        objBlackBerry.getPinBB();
        
        WindowsPhone objWindowsPhone = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        objWindowsPhone.display();
        objWindowsPhone.setWpKeyStore("UUQIJWORJ");
        objWindowsPhone.getWpKeyStore();
        
        
    }
    
}
