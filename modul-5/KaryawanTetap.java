/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KaryawanTetap extends Karyawan {
   private double gajiBulanan;
    
    public KaryawanTetap(String nama, int usia, String posisi, double gajiBulanan){
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }
   
   @Override
    public void tampilkanData(){
        System.out.println("Karyawan Tetap");
        System.out.println("Nama = " + getNama());
        System.out.println("Usia = " + getUsia());
        System.out.println("Posisi = " + getPosisi());
        System.out.println("Gaji Bulanan = " +gajiBulanan); 

    }
}