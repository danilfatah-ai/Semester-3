/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Nasabah {
    String Nama;
    String PIN;
    Rekening[] DaftarRekening;
    int JumlahRekening = 0;
    
    Nasabah(String NamaNasabah, String PINnasabah){
        Nama = NamaNasabah;
        PIN = PINnasabah;
        DaftarRekening = new Rekening[5];
    }
    
    void tambahrekening (Rekening Rek){
        if(JumlahRekening <5){
            DaftarRekening[JumlahRekening] = Rek;
            JumlahRekening++;
        }
    }
}
