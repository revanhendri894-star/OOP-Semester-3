/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_hewan;

/**
 *
 * @author WORKPLUS
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Milo";
        kucing.jenis = "Mamalia";
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Spike";
        anjing.jenis = "Mamalia";
        anjing.tampilkanInfo();
    }
}
