/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamhs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            System.out.println("Masukkan Nama Universitas: ");
            String Univ = scanner.nextLine();
            SubUniv.setUnivname(Univ);

            while (true) {
                System.out.println("\nDaftar Mahasiswa di " + SubUniv.getUnivname() + ":");
                
                System.out.println("NIM: ");
                long nim = scanner.nextLong();
                scanner.nextLine();
                
                System.out.println("Nama: ");
                String name = scanner.nextLine();
                
                System.out.println("Alamat: ");
                String home = scanner.nextLine();
                
                System.out.println("Pilihan Jurusan:");
                System.out.println("41. Teknik Informatika");
                System.out.println("42. Teknik Industri");
                System.out.println("43. Teknik Elektro");
                System.out.println("44. Sistem Informasi");
                System.out.println("48. Teknik Mesin");
                System.out.println("49. Teknik Mekatronika");
                System.out.println("Masukkan Kode Jurusan: ");
                
                int Majorcode = Integer.parseInt(scanner.nextLine());
                String major = getJurusanByKode(Majorcode);
                
                SuperMhs alldata=new SuperMhs(nim, name, home, major);
                count++;
                
                System.out.println("\nData Mahasiswa ke-" + count + ":");
                alldata.displaydata();
                
                System.out.println("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
                String pilihan = scanner.nextLine();
                if (!pilihan.equalsIgnoreCase("Y")) {
                    break; 
                }
            }
        }
    }
    


    private static String getJurusanByKode(int Majorcode) {

        return switch (Majorcode) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Unknown";
        };
    }
}


