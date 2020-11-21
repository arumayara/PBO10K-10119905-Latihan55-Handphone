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
public class Android extends Handphone{
    private String keyStore;
    
    public Android(String man, String os, String model, int harga){
        super (man, os, model, harga);
    }

    public String getKeyStore() {
        System.out.println("Android Key Store :"+keyStore);
        System.out.println("");
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
    
}
