/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author WORKPLUS
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanDetailBelanja() {
        System.out.println("=== Detail Keranjang Belanja ===");
        for (Produk p : listProduk) {
            System.out.println("Produk       : " + p.getNama());
            System.out.println("Harga Awal   : Rp " + p.getHarga());
            System.out.println("Diskon       : Rp " + p.hitungDiskon());
            System.out.println("Harga Akhir  : Rp " + p.getHargaSetelahDiskon());
            System.out.println("--------------------------------");
        }
        System.out.println("Total Bayar  : Rp " + hitungTotalHarga());
    }
}
