/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author WORKPLUS
 */
public class Main {
   public static void main(String[] args) {
        // Polimorfisme Runtime: Referensi Hewan memegang objek Kucing
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow

        // Instansiasi langsung Kucing
        Kucing kucing = new Kucing();
        kucing.makan("ikan"); // Memanggil metode makan(String)
        kucing.makan("ikan", 2); // Memanggil metode makan(String, int) yang di-overload

        // Instansiasi langsung Anjing
        Anjing anjing = new Anjing();
        anjing.bersuara(); // Output: Woof
        anjing.makan("daging", 3); // Memanggil metode makan yang diwarisi dari Hewan
    } 
}
