/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner inputs = new Scanner(System.in)) {
            ArrayList<Karyawan> karyawanList = new ArrayList<>();
            
            System.out.print("Silahkan masukkan jumlah karyawan yang ingin di input = ");
            int jumlahKaryawan = inputs.nextInt();
            inputs.nextLine();
            
            while (true) {
                System.out.print("Silahkan masukkan jumlah karyawan yang ingin di input (max 5) = ");
                jumlahKaryawan = inputs.nextInt();
                inputs.nextLine();
                
                if (jumlahKaryawan > 0 && jumlahKaryawan <= 5) {
                    break;
                } else {
                    System.out.println("Jumlah karyawan harus antara 1 sampai 5. Silahkan coba lagi.");
                }
            }
            
            for (int i = 0; i < jumlahKaryawan; i++) {
                System.out.println("Silahkan masukkan data karyawan yang ke " + (i + 1) + " =");
                System.out.print("Nama = ");
                String nama = inputs.nextLine();
                
                System.out.print("Usia = ");
                int usia = inputs.nextInt();
                inputs.nextLine();
                
                System.out.print("Posisi = ");
                String posisi = inputs.nextLine();
                
                String jenisKaryawan;
           
                 do {
                    System.out.print("Silahkan masukkan jenis Karyawan (Tetap/Kontrak) = ");
                    jenisKaryawan = inputs.nextLine();
                    
                    if (jenisKaryawan.equalsIgnoreCase("Tetap")) {
                        System.out.print("Gaji Bulanan = ");
                        double gajiBulanan = inputs.nextDouble();
                        inputs.nextLine();
                        
                        karyawanList.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
                    } else if (jenisKaryawan.equalsIgnoreCase("Kontrak")) {
                        System.out.print("Upah Per Jam = ");
                        double upahPerJam = inputs.nextDouble();
                        System.out.print("Jumlah Jam Kerja = ");
                        int jumlahJamKerja = inputs.nextInt();
                        inputs.nextLine();
                        
                        karyawanList.add(new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
                    } else {
                        System.out.println("Jenis karyawan tidak ada, Silahkan masukkan (Tetap/Kontrak)!!!");
                    }
                } while (!jenisKaryawan.equalsIgnoreCase("Tetap") && !jenisKaryawan.equalsIgnoreCase("Kontrak"));
            }
            
            System.out.println("\nData Karyawan = ");
            for (int i = 0; i < jumlahKaryawan; i++) {
                System.out.println("Karyawan ke-" + (i + 1) + ":");
                karyawanList.get(i).tampilkanData();
                System.out.println();
            }
        }
    }
}