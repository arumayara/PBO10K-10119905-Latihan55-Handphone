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
public class Handphone {
    protected String Manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.Manufacture= man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void display(){
        System.out.println("Manufaktur : "+ Manufacture);
        System.out.println("OS : "+ operatingSystem);
        System.out.println("Model : "+ model);
        System.out.println("Harga : "+ harga);
    }
    
}
