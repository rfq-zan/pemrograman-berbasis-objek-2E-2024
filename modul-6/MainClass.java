/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainClass {
private static ArrayList<IDosen> daftarDosen = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dosendata;

        do {
            System.out.println("Silahkan pilih data yang akan diinput = ");
            System.out.println("1. Menambah Dosen Tetap");
            System.out.println("2. Menambah Dosen Tidak Tetap");
            System.out.println("3. Menampilkan data");
            System.out.println("4. Selesai");
            System.out.print("Masukkan angka sesuai kriteria  = ");
            dosendata = scanner.nextInt();
            scanner.nextLine();

            switch (dosendata) {
                case 1:
                    tambahDosenTetap(scanner);
                    break;
                case 2:
                    tambahDosenTidakTetap(scanner);
                    break;
                case 3:
                    tampilkanSemuaDosen();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (dosendata != 4);
    }

    private static void tambahDosenTetap(Scanner scanner) {
        System.out.print("Nama = ");
        String nama = scanner.nextLine();
        System.out.print("NIK = ");
        String nik = scanner.nextLine();
        System.out.print("Umur = ");
        int umur = scanner.nextInt();
        System.out.print("Jenis Kelamin (M/F) = ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Gaji Pokok = ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Tunjangan = ");
        double tunjangan = scanner.nextDouble();
        scanner.nextLine(); 

        IDosen dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
        daftarDosen.add(dosenTetap);
        System.out.println("Dosen Tetap berhasil ditambahkan kedalam data");
    }

    private static void tambahDosenTidakTetap(Scanner scanner) {
        System.out.print("Nama = ");
        String nama = scanner.nextLine();
        System.out.print("NIK = ");
        String nik = scanner.nextLine();
        System.out.print("Umur = ");
        int umur = scanner.nextInt();
        System.out.print("Jenis Kelamin (M/F) = ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Jam Mengajar = ");
        int jamMengajar = scanner.nextInt();
        System.out.print("Honor Per Jam = ");
        double honorPerJam = scanner.nextDouble();
        scanner.nextLine();

        IDosen dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerJam);
        daftarDosen.add(dosenTidakTetap);
        System.out.println("Dosen Tidak Tetap berhasil ditambahkan kedalam data");
    }

    private static void tampilkanSemuaDosen() {
        if (daftarDosen.isEmpty()) {
            System.out.println("Data dosen masih kosong, silahkan menginput data dosen");
        } else {
            for (IDosen dosen : daftarDosen) {
                if (dosen instanceof DosenTetap) {
                    ((DosenTetap) dosen).tampilkanInfo();
                } else if (dosen instanceof DosenTidakTetap) {
                    ((DosenTidakTetap) dosen).tampilkanInfo();
                }
                System.out.println();
            }
        }
    } 
}
