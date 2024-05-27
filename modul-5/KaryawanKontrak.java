/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KaryawanKontrak extends Karyawan {
    private double upahPerJam;
    private int jumlahJamKerja;
            
    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja){
    super(nama, usia, posisi);
    this.upahPerJam = upahPerJam;
    this.jumlahJamKerja = jumlahJamKerja;
    }
    
    @Override
    public void tampilkanData(){
        System.out.println("Karyawan Kontrak");
        System.out.println("Nama = " + getNama());
        System.out.println("Usia = " + getUsia());
        System.out.println("Posisi = " + getPosisi());
        System.out.println("Upah Per Jam = " +upahPerJam);
        System.out.println("Jumlah Jam kerja = " +jumlahJamKerja);
    }
}
