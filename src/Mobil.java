/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author JARKOM 18
 */
public class Mobil {
    protected String merk;
    protected int harga, kecepatan;
    
    /**
     * Konstruktor
     * Method yang namanya = nama kelas
     * Tidak boleh menggunakan void
     * Tidak boleh ada return value
     * Dijalankan hanya 1 kali
     * digunakan untuk inisialisasi
     */
    
    Mobil(String merk, int harga, int kecepatan){
        this.merk = merk;
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    Mobil (){
        
    }
    
    void setMerk (String merk) {
        this.merk = merk;
    }
    
    void setHargaKecepatan (int harga,int kecepatan) {
        this.harga = harga;
        this.kecepatan = kecepatan;
    }

    String getMerk(){
        return merk;
    }
    
    int getHarga(){
        return harga;
    }
    
    int getKecepatan(){
        return kecepatan;
    }
    
    void infoMobil(){
        System.out.println("Merk Mobil : " + getMerk());
        System.out.println("Harga : " + getHarga());
        System.out.println("Kecepatan : " + getKecepatan());
        
    }
}