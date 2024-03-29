/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            
        System.out.println("Masukkan nama mahasiswa =");
        String name = scanner.nextLine();
        
        System.out.println("Masukkan NIM mahasiswa =");
        long nim = scanner.nextLong();
        scanner.nextLine();
        
        System.out.println("Masukkan jurusan mahasiswa =");
        String jurusan = scanner.nextLine();
        
        System.out.println("Masukkan alamat rumah mahasiswa =");
        String alamat = scanner.nextLine();
            
        Mahasiswa mahasiswa=new Mahasiswa(name, nim, jurusan, alamat);
        
        System.out.println("\nStudent Data");
        mahasiswa.Allinfo();
    }
    
}
