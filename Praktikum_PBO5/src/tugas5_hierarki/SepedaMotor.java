/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5_hierarki;

/**
 *
 * @author WORKPLUS
 */
public class SepedaMotor extends kendaraanDarat {
    String jenisKopling;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Kopling: " + jenisKopling);
        System.out.println("Tipe Kendaraan: Sepeda Motor");
    }   
}
