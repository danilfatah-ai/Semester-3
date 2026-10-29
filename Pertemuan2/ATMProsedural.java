/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class ATMProsedural {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //I/O stream Java
        //1. Input Scanner
        //2. Buffered Reader
        //3. J Option Pane
        
        int CorrectPIN = 135791;
        int SaldoATM = 999999999;
        int Kesempatan = 0;
        while (true){
            System.out.println("Masukkan PIN Anda: ");
            int PIN = input.nextInt();
        if (PIN == CorrectPIN){
            Kesempatan = 0;
            
            while(true){
                 System.out.println("====MENU TRANSAKSI====");
                 System.out.println("1. CEK SALDO       ");
                 System.out.println("2. SETOR TUNAI     ");
                 System.out.println("3. TARIK TUNAI     ");
                 System.out.println("4. KELUAR          ");
                 System.out.println("MASUKKAN PILIHAN:  ");
                 int choice = input.nextInt();
                 if (choice == 1){
                     System.out.println("Saldo Anda: "+SaldoATM);
                     while(true){
                     System.out.println("Tekan 0 Untuk Kembali Ke Menu Transaksi");
                     int back = input.nextInt();
                     if (back == 0){
                     break;
                     } else {
                         System.out.println("Gagal Untuk Kembali Ke Menu Transaksi.");
                         System.out.println("Silahkan Tekan 0 Untuk Kembali!!");
                     }
                    }
                 }
                 else if (choice == 2){
                     System.out.println("Masukkan Jumlah Setor: ");
                     int SetorUang = input.nextInt();
                     SaldoATM = SaldoATM + SetorUang;
                     System.out.println("Uang Anda Berhasil Disetorkan.");
                    while(true){
                     System.out.println("Tekan 0 Untuk Kembali Ke Menu Transaksi");
                     int back = input.nextInt();
                     if (back == 0){
                     break;
                     } else {
                         System.out.println("Gagal Untuk Kembali Ke Menu Transaksi.");
                         System.out.println("Silahkan Tekan 0 Untuk Kembali!!");
                     }
                    }
                 }
                 else if (choice == 3){
                     System.out.println("Masukkan Jumlah Tarik: ");
                     int AmbilUang = input.nextInt();
                     if(AmbilUang <= SaldoATM){
                     SaldoATM = SaldoATM - AmbilUang;
                     System.out.println("Penarikan Berhasil");
                     System.out.println("Saldo Anda Sisa: "+SaldoATM);
                     }
                     else{
                        System.out.println("Transaksi Gagal!!\nSaldo Anda Sisa: "+SaldoATM);
                     }
                     while(true){
                     System.out.println("Tekan 0 Untuk Kembali Ke Menu Transaksi");
                     int back = input.nextInt();
                     if (back == 0){
                     break;
                     } else {
                         System.out.println("Gagal Untuk Kembali Ke Menu Transaksi.");
                         System.out.println("Silahkan Tekan 0 Untuk Kembali!!");
                     }
                    }
                   }
                 else if (choice == 4){
                     System.out.println("Terima Kasih Telah Menggunakan");
                     System.out.println("Layanan Transaksi Dari Kami");
                     System.exit(0);
                 }
      }
    }
        else {
            Kesempatan++;
            System.out.println("PIN Salah!! Coba Lagi.");
            if(Kesempatan >= 3){
            System.out.println("KARTU ANDA DIBLOKIR!!");
            System.out.println("Anda Salah Memasukkan PIN 3 Kali");
            break;
            }
            continue;
        }
     }
   }
}