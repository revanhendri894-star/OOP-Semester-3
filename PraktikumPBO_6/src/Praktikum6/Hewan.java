/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author WORKPLUS
 */
public class Hewan {
    // Metode umum yang akan di-override
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }

    // Overloading Metode 1: menerima 1 parameter (String makanan)
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    // Overloading Metode 2: menerima 2 parameter (String makanan, int jumlah)
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}
