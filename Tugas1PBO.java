/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1pbo;

/**
 *
 * @author LENOVO
 */
import static java.lang.System.exit;
import java.util.Scanner;
import tugas1pbo.Konversi;

public class Tugas1PBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suhuAwal, farenheit, kelvin, reamur;
        int pilih = 0;
        boolean pil = true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius  : ");
        suhuAwal = input.nextInt();
        Konversi suhu = new Konversi(suhuAwal);
        
        do{
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat data konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            pilih = input.nextInt();
            
            if(pilih==1){
                System.out.println("");
                suhu.suhuAkhir();
            } else if(pilih == 2){
                input = new Scanner(System.in);
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu dalam Celcius : ");
                suhu.suhuAwal = input.nextInt();
            } else if(pilih == 3){
                System.exit(0);
            } else{
                System.out.println("Oops maaf opsi tidak tersedia, mohon masukkan opsi dengan benar");
                pil = true;
            }
        }
        while(pil = true);
    }
    
}
