/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Web {
    private double tulis1, coding1, wawancara1, tulisWD, codingWD, wawancaraWD;
    public Web(double T1, double C1, double W1){
        tulis1 = T1;
        coding1 = C1;
        wawancara1 = W1;
    }
    //encapsulation
    public void setTulis1(int T1){
        tulis1 = T1;
    }
    public double getTulis1(){
        return tulis1;
    }
    public void setCoding1(int C1){
        coding1 = C1;
    }
    public double getCoding1(){
        return coding1;
    }
    public void setWawancara1(int W1){
        wawancara1 = W1;
    }
    public double getWawancara1(){
        return wawancara1;
    }
    public double hitungTulisWD(){
        tulisWD = 0.4*tulis1;
        return tulisWD;
    }
    public double hitungCodingWD(){
        codingWD = 0.35*coding1;
        return codingWD;
    }
    public double hitungWawancaraWD(){
        wawancaraWD = 0.25*wawancara1;
        return wawancaraWD;
    }
}
