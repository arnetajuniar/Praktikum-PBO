/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1pbo;

/**
 *
 * @author LENOVO
 */
public class Konversi {
    int suhuAwal;
    public Konversi(int suhuAwal){
        this.suhuAwal = suhuAwal;
    }

    void suhuAkhir(){
        System.out.println("Suhu dalam Celcius : " + suhuAwal + ".0° C");
        System.out.println("Suhu dalam Farenheit : " + farenheit() + "° F");
        System.out.println("Suhu dalam Reamur : " + reamur() + "° R");
        System.out.println("Suhu dalam Kelvin : " + kelvin() + "° K");

        if(suhuAwal <= 0){
            System.out.println("Kondisi air beku");
        } else if(suhuAwal > 0 && suhuAwal < 100){
            System.out.println("Kondisi air normal");
        } else if(suhuAwal >= 100){
            System.out.println("Kondisi air mendidih");
        }
    }

    float farenheit(){
        return ((9*suhuAwal)/5)+32;
    }

    float reamur(){
        return (4*suhuAwal)/5;
    }

   double kelvin(){
        return suhuAwal + 273.15;
    }
}