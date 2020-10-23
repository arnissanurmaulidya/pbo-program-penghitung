/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Penghitung {
    
    public int getPenghitungPenjumlahan(int O, int P){
        int penjumlahan = O+ P;
        return penjumlahan;
        
    }
    
    public int getPenghitungPengurangan(int A, int B){
        int pengurangan = A - B;
        return pengurangan;
        
    }
    
    public int getPenghitungPerkalian(int R, int S){
        int perkalian = R * S;
        return perkalian;
        
    }
    
    public int getPenghitungPembagian(int F, int G){
        int pembagian = F / G;
        return pembagian;
        
    }
    
    public void statusProgram(){
        System.out.println("Ini merupakan program penghitung");
    }
}
