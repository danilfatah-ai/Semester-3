/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author LENOVO
 */
public class RekeningEnkapsulasi {
    private String nomorRekening;
    private String namaBank;
    private double saldo;

    // Konstruktor
    public RekeningEnkapsulasi(String nomorRekening, String namaBank, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaBank = namaBank;
        this.saldo = saldoAwal;
    }

    // Getter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method Transaksi
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor tunai berhasil! Saldo saat ini: Rp " + saldo);
        } else {
            System.out.println("Jumlah setor tidak valid.");
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil! Sisa saldo: Rp " + saldo);
            return true;
        } else {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi atau jumlah tidak valid.");
            return false;
        }
    }
}