
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pilih, menu, T, C, W, T1, C1, W1, nik, ulang;
        double nilaiAkhir;
        String nama;
        
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih jenis form: ");
        pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.print("Input NIK: ");
            nik = input.nextInt();
            System.out.print("Input Nama: ");
            input.nextLine();
            nama = input.nextLine();
            System.out.print("Input Nilai Tes Tulis: ");
            T = input.nextInt();
            System.out.print("Input Nilai Tes Coding: ");
            C = input.nextInt();
            System.out.print("Input Nilai Tes Wawancara : ");
            W = input.nextInt();
            
            Android a = new Android(T, C, W);
            
            nilaiAkhir = a.hitungTulisAD() + a.hitungCodingAD() + a.hitungWawancaraAD();
            
            if(nilaiAkhir >= 85){
                System.out.println("Nama: " + nama);
                System.out.println("Nilai akhir: " + nilaiAkhir);
                System.out.println("KETERANGAN: LOLOS");
            } else{
                System.out.println("Nama: " + nama);
                System.out.println("Nilai akhir: " + nilaiAkhir);
                System.out.println("KETERANGAN: GAGAL");
            }
            
        } else if(pilih == 2){
            System.out.print("Input NIK: ");
            nik = input.nextInt();
            System.out.print("Input Nama: ");
            input.nextLine();
            nama = input.nextLine();
            System.out.print("Input Nilai Tes Tulis: ");
            T1 = input.nextInt();
            System.out.print("Input Nilai Tes Coding: ");
            C1 = input.nextInt();
            System.out.print("Input Nilai Tes Wawancara : ");
            W1 = input.nextInt();
            
            Web w = new Web(T1, C1, W1);
            
            nilaiAkhir = w.hitungTulisWD() + w.hitungCodingWD() + w.hitungWawancaraWD();
            
            if(nilaiAkhir >= 85){
                System.out.println("Nama: " + nama);
                System.out.println("Nilai akhir: " + nilaiAkhir);
                System.out.println("KETERANGAN: LOLOS");
            } else{
                System.out.println("Nama: " + nama);
                System.out.println("Nilai akhir: " + nilaiAkhir);
                System.out.println("KETERANGAN: GAGAL");
            }
        }
    }
}
