/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class programPenghitung {
    public static void main(String [] args){
        
        Penghitung angka = new Penghitung();
        angka.statusProgram();
        System.out.println("Hasil Penjumlahan adalah "+angka.getPenghitungPenjumlahan(23, 54));
        System.out.println("Hasil Pengurangan adalah "+angka.getPenghitungPengurangan(120, 37));
        System.out.println("Hasil Perkalian adalah "+angka.getPenghitungPerkalian(12, 43));
        System.out.println("Hasil Pembagian adalah "+angka.getPenghitungPembagian(250, 55));
    }
}
