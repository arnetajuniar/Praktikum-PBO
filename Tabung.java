/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double tinggi, volume, luasP;
    
    public Tabung(double r, double t){
        super(r);
        tinggi=t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi=tinggi;
    }
    //over ride
    public double hitungVol(){
        return PHI*(super.getJari()*super.getJari()*tinggi);
    }
    public double hitungLuasP(){
        return 2*(PHI*super.getJari()) * (super.getJari()+tinggi);
    }
}
