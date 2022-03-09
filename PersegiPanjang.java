/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class PersegiPanjang implements MenghitungBangun {
    private double panjang, lebar;
    
    public PersegiPanjang(double p, double l){
        panjang=p;
        lebar=l;
    }
    //encapsulation
    public void setPanjang(int p){
        panjang = p;
    }
    public double getPanjang(){
        return panjang;
    }
    public void setLebar(int l){
        lebar = l;
    }
    public double getLebar(){
        return lebar;
    }
    //over ride
    public double hitungLuas(){
        return panjang*lebar;
    }
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }
}
