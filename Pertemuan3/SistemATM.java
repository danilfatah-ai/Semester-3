/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author LENOVO
 */
public class SistemATM {
    public static void main(String[] args) {
    Rekening rek1 = new Rekening("0001",-2000000);
    Rekening rek2 = new Rekening("0002",3000000);
    Rekening rek3 = new Rekening("0003",4000000);
    
    Nasabah nsbh1 = new Nasabah ("Anies Baswedan","113355");
    
    nsbh1.tambahrekening(rek1);
    nsbh1.tambahrekening(rek2);
    nsbh1.tambahrekening(rek3);
    
     Rekening rek4 = new Rekening("0004",5000000);
     Rekening rek5 = new Rekening("0005",6000000);
     Rekening rek6 = new Rekening("0006",7000000);
     
     Nasabah nsbh2 = new Nasabah ("Ganjar Pranowo","224466");
     
     nsbh2.tambahrekening(rek4);
     nsbh2.tambahrekening(rek5);
     nsbh2.tambahrekening(rek6);
      
      Rekening rek7 = new Rekening("0007",8000000);
      Rekening rek8 = new Rekening("0008",9000000);
      Rekening rek9 = new Rekening("0009",9999999);
      
      Nasabah nsbh3 = new Nasabah ("Prabowo Subianto","135790");
      
      nsbh3.tambahrekening(rek7);
      nsbh3.tambahrekening(rek8);
      nsbh3.tambahrekening(rek9);
      
      Nasabah[] KumpulanNasabah = new Nasabah[3];
      KumpulanNasabah[0] = nsbh1;
      KumpulanNasabah[1] = nsbh2;
      KumpulanNasabah[2] = nsbh3;
      
      ATM Mesin = new ATM(KumpulanNasabah);
      Mesin.CekData();
      
        System.out.println("========== RIWAYAT TRANSAKSI ==========");
        rek2.Setor(5000000);
        rek2.Tarik(3000000);
        
        rek7.Setor(1000000);
        rek7.Tarik(500000);
        
        rek5.Setor(1200000);
        rek5.Tarik(1000000);
        
        Mesin.CekData();
   }
}
