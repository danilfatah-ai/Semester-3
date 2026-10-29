/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author LENOVO
 */
public class ATM {
    Nasabah[] dbNasabah;
    
    ATM (Nasabah[] nasabah){
        dbNasabah = nasabah;
    }
    
    void CekData(){
        for(int i = 0; i < dbNasabah.length; i++){
            Nasabah nsbh = dbNasabah[i];
            System.out.println("Nama Nasabah: " +nsbh.Nama);
            
            for(int j = 0; j < nsbh.JumlahRekening; j++){
                Rekening rek = nsbh.DaftarRekening[j];
                System.out.println("No Rekening: " +rek.NoRek+ "\nSaldo: " +rek.Saldo);
            }
        }
    }
}
