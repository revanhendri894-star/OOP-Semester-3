/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author WORKPLUS
 */
/*
public class main {
    public static void main(String[] args) {
        mobil mobil = new mobil("Toyota", 180, "Bensin", 4);
        
        mobil.tampilkanInfoKendaraan();
        mobil.tampilkanInfoMobil();
    }
}
*/
public class main {
    public static void main(String[] args) {
        // Buat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Budi", 30, "Programmer", 10000000);

        // Tampilkan informasi pekerja menggunakan metode toString()
        System.out.println("--- Informasi Pekerja ---");
        System.out.println(pekerja.toString());

        // Ubah nama pekerja menggunakan metode setter
        pekerja.setNama("Budi Santoso");
        
        // Tampilkan ulang informasi pekerja
        System.out.println("\n--- Setelah Nama Diubah ---");
        System.out.println(pekerja.toString());

        System.out.println("\n--- Coba Akses Langsung Atribut ---");
        // Akses atribut usia
        System.out.println("Akses usia langsung: " + pekerja.usia); 
    }
}