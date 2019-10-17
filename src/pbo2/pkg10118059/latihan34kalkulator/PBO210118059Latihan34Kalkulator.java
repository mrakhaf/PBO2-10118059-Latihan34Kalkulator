/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan34kalkulator;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan34Kalkulator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Kalkulator clc = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        clc.value1 = input.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        clc.value2 = input.nextDouble();
        System.out.println("");
        
        System.out.println("Hasil Pertambahan : " + clc.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + clc.kurangBilangan());
        System.out.println("Hasil Perkalian   : " + clc.kaliBilangan());
        System.out.println("Hasil Pembagian   : " + clc.bagiBilangan());
        System.out.println("Hasil Sisa        : " + clc.sisaBilangan());
        
        
    
    }
    
}
