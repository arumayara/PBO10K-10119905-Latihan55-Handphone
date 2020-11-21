/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan55.Handphone;

/**
 *
 * @author aruma
 */
public class WindowsPhone extends Handphone{
    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getWpKeyStore() {
        System.out.println("Wp Key Store :"+ wpKeyStore);
        System.out.println("");
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
    
    
    
}
