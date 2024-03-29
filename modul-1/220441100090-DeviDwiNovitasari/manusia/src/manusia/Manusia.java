/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

class Menungso{
    String name;
    int age;
    String home;
    
    void berjalan(){
        System.out.println(name +" sedang berjalan tenang");
    }
    void berlari(){
        System.out.println(name +" sedang berlari sampai terengah-engah");
    }
    void attribute(){
        System.out.println("Nama = "+name);
        System.out.println("Umur = "+age);
        System.out.println("Alamat = "+home);
    }
}

public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menungso manusia1=new Menungso();
        manusia1.name="Razzan";
        manusia1.age=13;
        manusia1.home="Sumenep";
        
        Menungso manusia2=new Menungso();
        manusia2.name="Dika";
        manusia2.age=43;
        manusia2.home="Lamongan";

       manusia1.attribute();
       manusia1.berjalan();
        System.out.println("========================");
       manusia2.attribute();
       manusia2.berlari();

    }
    
}
