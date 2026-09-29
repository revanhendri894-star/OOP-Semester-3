/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author WORKPLUS
 */
public class Main {
        public static void main(String[] args) {
 
        // ---------- 1. Output Produk ----------
        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println();
 
        // ---------- 2. Output Pegawai ----------
        System.out.println("2. Output Pegawai");
        // Ganti "Budi" dengan NAMA KAMU (sesuai catatan di soal: "sesuaikan dengan nama kalian")
        PegawaiTetap budi = new PegawaiTetap("Budi", 5000000, 1000000);
        budi.tampilkanInfo();
        System.out.println();
 
        // ---------- 3. Output Polimorfisme ----------
        System.out.println("3. Output Polimorfisme");
 
        // POLIMORFISME: variabel bertipe kelas INDUK (Produk) menampung objek kelas TURUNAN
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
 
        // Variabel bertipe Pegawai menampung objek PegawaiTetap dan PegawaiKontrak
        Pegawai pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
 
        // Walaupun dipanggil lewat referensi induk, Java otomatis menjalankan
        // tampilkanInfo() milik kelas TURUNAN yang sebenarnya (dynamic method dispatch)
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
