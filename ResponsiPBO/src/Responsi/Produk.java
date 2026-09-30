/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author WORKPLUS
 */
public class Produk {
       // Enkapsulasi: atribut dibuat private supaya tidak bisa diakses langsung dari luar kelas
    private String namaProduk;
    private int harga;
 
    // Constructor: dipanggil saat objek dibuat (new Produk(...)) untuk mengisi nilai awal
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk; // "this" menunjuk ke atribut milik objek ini
        this.harga = harga;
    }
 
    // Getter: untuk MEMBACA nilai atribut private
    public String getNamaProduk() {
        return namaProduk;
    }
 
    // Setter: untuk MENGUBAH nilai atribut private
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
 
    public int getHarga() {
        return harga;
    }
 
    public void setHarga(int harga) {
        this.harga = harga;
    }
 
    // Metode yang nanti di-override (ditimpa) oleh kelas turunan
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    } 
}
