/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_hierarki;

/**
 *
 * @author WORKPLUS
 */
public class MainHierarki {
    public static void main(String[] args) {
        mobil mobilKu = new mobil();
        mobilKu.nama = "Honda Civic";
        mobilKu.kecepatan = 200;
        mobilKu.jumlahRoda = 4;
        mobilKu.jumlahPintu = 4;
        mobilKu.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motorKu = new SepedaMotor();
        motorKu.nama = "Kawasaki Ninja";
        motorKu.kecepatan = 250;
        motorKu.jumlahRoda = 2;
        motorKu.jenisKopling = "Manual";
        motorKu.tampilkanInfo();
    }
}
