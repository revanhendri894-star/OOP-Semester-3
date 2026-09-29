/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author WORKPLUS
 */
public class MainTugas {
    public static void main(String[] args) {
        // Membuat objek produk
        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk laptop = new Elektronik("Laptop Gaming", 10000000);
        Produk kaos = new Pakaian("Kaos Polos", 50000);

        // Membuat objek KeranjangBelanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kaos);

        // Menampilkan detail belanjaan dan total
        keranjang.tampilkanDetailBelanja();
    }
}
