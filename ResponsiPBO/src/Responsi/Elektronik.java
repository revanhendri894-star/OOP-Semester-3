/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author WORKPLUS
 */
public class Elektronik extends Produk {
       private int garansi; // dalam tahun
 
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga); // memanggil constructor kelas induk (Produk)
        this.garansi = garansi;
    }
 
    public int getGaransi() {
        return garansi;
    }
 
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
 
    @Override // menandakan kita menimpa metode milik kelas induk
    public void tampilkanInfo() {
        super.tampilkanInfo(); // cetak nama & harga memakai metode induk (tidak perlu nulis ulang)
        System.out.println("Garansi: " + garansi + " tahun");
    } 
}