/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class SistemATMEnkapsulasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Daftar nasabah (database sementara)
        ArrayList<NasabahEnkapsulasi> daftarNasabah = new ArrayList<>();

        RekeningEnkapsulasi rek1 = new RekeningEnkapsulasi("11112222", "Bank Mandiri", 2500000);
        daftarNasabah.add(new NasabahEnkapsulasi("Prabowo Subianto", "112233", rek1));

        RekeningEnkapsulasi rek2 = new RekeningEnkapsulasi("33334444", "Bank Mandiri", 5000000);
        daftarNasabah.add(new NasabahEnkapsulasi("Soeharto", "223344", rek2));

        RekeningEnkapsulasi rek3 = new RekeningEnkapsulasi("55556666", "Bank Mandiri", 1000000);
        daftarNasabah.add(new NasabahEnkapsulasi("Tommy Soeharto", "445566", rek3));

        // 2. Input Login HANYA MENGGUNAKAN PIN
        System.out.println("=== SELAMAT DATANG DI ATM ===");
        System.out.print("Masukkan PIN Anda (6 digit): ");
        String inputPin = input.nextLine();

        // 3. Proses Pencarian Nasabah berdasarkan PIN saja
        NasabahEnkapsulasi nasabahLogin = null;
        for (NasabahEnkapsulasi n : daftarNasabah) {
            // Memanggil method verifikasiPin() yang sudah ada di class Nasabah
            if (n.verifikasiPin(inputPin)) {
                nasabahLogin = n; // Ditemukan
                break;            // Berhenti mencari
            }
        }

        // 4. Validasi Hasil Login
        if (nasabahLogin != null) {
            // Jika PIN cocok, masuk ke menu ATM milik nasabah tersebut
            ATMEnkapsulasi.tampilkanMenu(nasabahLogin);
        } else {
            // Jika PIN tidak ada yang cocok di dalam daftar
            System.out.println("\nPIN Salah! Akses ditolak.");
        }
        input.close();
    }
}
