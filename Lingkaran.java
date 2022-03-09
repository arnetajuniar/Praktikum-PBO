/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Lingkaran implements MenghitungBangun{
    private double jarijari, luas, keliling;
    public Lingkaran(double r){
        jarijari=r;
    }
    public void setJari(int r){
        jarijari = r;
    }
    public double getJari(){
        return jarijari;
    }
    public double getDiameter(){
        return 2*jarijari;
    }
    
    public double hitungLuas(){
        luas = PHI*(jarijari*jarijari);
        return luas;
    }
    public double hitungKeliling(){
        keliling = PHI*(2*jarijari);
        return keliling;
    }
}
