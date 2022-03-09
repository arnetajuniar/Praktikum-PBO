/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double volume, tinggi, luasP;
    
    public Balok(double p, double l, double t){
        super(p,l);
        tinggi=t;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    
    //over ride
    public double hitungVol(){
        return super.hitungLuas() * tinggi;
    }
    //over ride
    public double hitungLuasP(){
        return 2*(super.hitungLuas()+(super.getLebar()*tinggi)+(super.getPanjang()*tinggi));
    }
}
