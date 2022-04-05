/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double p, l, t, r;
        int pilih, ulangi;
        do{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih   : ");
            pilih = input.nextInt();
            
            if(pilih==1){
                System.out.print("Input panjang : ");
                p = input.nextInt();
                System.out.print("Input lebar   : ");
                l = input.nextInt();
                System.out.print("Input tinggi  : ");
                t = input.nextInt();
                
                Balok b = new Balok(p,l,t);
                
                System.out.println("Luas Persegi Panjang= " + b.hitungLuas());
                System.out.println("Keliling Persegi Panjang = " + b.hitungKeliling());
                System.out.println("Volume Balok= " + b.hitungVol());
                System.out.println("Luas Permukaan Balok= " + b.hitungLuasP());
            } else if(pilih==2){
                System.out.print("Input tinggi  : ");
                t = input.nextInt();
                System.out.print("Input jari-jari: ");
                r = input.nextInt();
                
                Tabung tb = new Tabung(r,t);
                
                System.out.println("Luas Lingkaran= " + tb.hitungLuas());
                System.out.println("Keliling Lingkaran= " + tb.hitungKeliling());
                System.out.println("Volume Tabung= " + tb.hitungVol());
                System.out.println("Luas Permukaan Tabung= " + tb.hitungLuasP());
            } else if(pilih==0){
                System.exit(0);
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulangi = input.nextInt();
        } while(ulangi==1);
    }
}
