/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Android {
    private double tulis, coding, wawancara, tulisAD, codingAD, wawancaraAD, nilaiAkhir;
    public Android(double T, double C, double W){
        tulis = T;
        coding = C;
        wawancara = W;
    }
    //encapsulation
    public void setTulis(int T){
        tulis = T;
    }
    public double getTulis(){
        return tulis;
    }
    public void setCoding(int C){
        coding = C;
    }
    public double getCoding(){
        return coding;
    }
    public void setWawancara(int W){
        wawancara = W;
    }
    public double getWawancara(){
        return wawancara;
    }
    public double hitungTulisAD(){
        tulisAD = 0.2*tulis;
        return tulisAD;
    }
    public double hitungCodingAD(){
        codingAD = 0.5*coding;
        return codingAD;
    }
    public double hitungWawancaraAD(){
        wawancaraAD = 0.3*wawancara;
        return wawancaraAD;
    }

}
