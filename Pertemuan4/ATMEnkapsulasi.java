/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ATMEnkapsulasi {
    // Method untuk menjalankan menu interaktif ATM
    public static void tampilkanMenu(NasabahEnkapsulasi nasabah) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        System.out.println("\nSelamat datang di ATM, " + nasabah.getNama() + "!");
        System.out.println("Bank: " + nasabah.getRekening().getNamaBank());

        while (status) {
            System.out.println("\n--- MENU UTAMA ATM ---");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Silakan pilih menu (1-4): ");
            
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda saat ini: Rp " + nasabah.getRekening().getSaldo());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah nominal setor: Rp ");
                    double jumlahSetor = scanner.nextDouble();
                    nasabah.getRekening().setor(jumlahSetor);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah nominal tarik: Rp ");
                    double jumlahTarik = scanner.nextDouble();
                    nasabah.getRekening().tarik(jumlahTarik);
                    break;
                case 4:
                    status = false;
                    System.out.println("Terima kasih telah menggunakan layanan ATM.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
