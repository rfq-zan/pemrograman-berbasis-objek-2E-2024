/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamhs;
/**
 *
 * @author ASUS
 */
public class SuperMhs {


    protected long nim;
    protected String name;
    protected String home;
    protected String major;


    public SuperMhs(long nim, String name, String home, String major) {
        this.nim = nim;
        this.name = name;
        this.home = home;
        this.major = major;
    }

    // Getter and setter methods
    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String gethome() {
        return home;
    }

    public void sethome(String home) {
        this.home = home;
    }

    public String getmajor() {
        return major;
    }

    public void setmajor(String major) {
        this.major = major;
    }


    public void displaydata() {
        System.out.println("NIM: " + nim);
        System.out.println("name: " + name);
        System.out.println("home: " + home);
        System.out.println("major: " + major);
    }
}

