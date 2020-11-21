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
public class BlackBerry extends Handphone{
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getPinBB() {
        System.out.println("PIN :"+pinBB);
        System.out.println("");
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
    
}
