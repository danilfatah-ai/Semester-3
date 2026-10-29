/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Rekening {
    String NoRek;
    double Saldo;
    
    Rekening(String NoRekening, double saldoAwal){
        NoRek =  NoRekening;
        Saldo = saldoAwal;
    }
    
    void Setor(double Jumlah){
        System.out.println(Jumlah);
        Saldo = Saldo + Jumlah;
        System.out.println("Berhasil Setor Tunai Rp. "+Jumlah+" ke Rekening "+NoRek);}
    
    void Tarik (double Jumlah){
        if (Jumlah > 0 && Saldo >= Jumlah){
            Saldo = Saldo - Jumlah;
            System.out.println("Berhasil Tarik Tunai Rp. "+Jumlah+" dari Rekening "+NoRek);
        }
        else {
            System.out.println("Gagal Melakukan Penarikan\nSaldo Anda Tidak Cukup!!");
        }
    }
}
