/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JARKOM 18
 */
public class MobilBensin extends Mobil{
    String bahan_bakar;
    
    MobilBensin (String merk, int harga, int kecepatan, String bahan_bakar){
        super(merk,harga,kecepatan);
        this.bahan_bakar = bahan_bakar;
    }
    
    void setBahanBakar (String bahan_bakar){
        this.bahan_bakar = bahan_bakar;
    }
    
    String getBahanBakar(){
        return bahan_bakar;
    }
    
    void infoMobilBensin(){
        super.infoMobil();
        System.out.println("Bahan Bakar : " + getBahanBakar());
        System.out.println("-------------------------");
    }    
}
