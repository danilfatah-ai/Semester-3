/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author LENOVO
 */
public class NasabahEnkapsulasi {
    private String nama;
    private String pin;
    private RekeningEnkapsulasi rekening; // Relasi: Nasabah memiliki sebuah Rekening

    // Konstruktor
    public NasabahEnkapsulasi(String nama, String pin, RekeningEnkapsulasi rekening) {
        this.nama = nama;
        this.pin = pin;
        this.rekening = rekening;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public RekeningEnkapsulasi getRekening() {
        return rekening;
    }

    // Method verifikasi PIN
    public boolean verifikasiPin(String inputPin) {
        return this.pin.equals(inputPin);
    }
}
