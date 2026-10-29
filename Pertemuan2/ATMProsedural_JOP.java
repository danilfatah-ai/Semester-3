/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

/**
 *
 * @author LENOVO
 */
import javax.swing.JOptionPane;
public class ATMProsedural_JOP {
    public static void main(String[] args) {
        int CorrectPIN = 135791;
        int SaldoATM = 999999999;
        int Kesempatan = 0;
        
        while (true) {
            // Input PIN menggunakan JOptionPane
            String inputPIN = JOptionPane.showInputDialog("Masukkan PIN Anda: ");
            
            // Jika user menekan tombol Cancel atau Silang
            if (inputPIN == null) {
                System.exit(0);
            }
            
            int PIN = Integer.parseInt(inputPIN);
            
            if (PIN == CorrectPIN) {
                Kesempatan = 0;
                
                while(true) {
                    String menu = "====MENU TRANSAKSI CHINDO BANK====\n"
                                + "1. CEK SALDO\n"
                                + "2. SETOR TUNAI\n"
                                + "3. TARIK TUNAI\n"
                                + "4. KELUAR\n"
                                + "MASUKKAN PILIHAN:\n";
                                
                    String inputChoice = JOptionPane.showInputDialog(menu);
                    if (inputChoice == null) System.exit(0);
                    int choice = Integer.parseInt(inputChoice);
                    
                    if (choice == 1){
                        JOptionPane.showMessageDialog(null, "Saldo Anda: Rp " + SaldoATM);
                       }
                    else if (choice == 2) {
                        String Setor = JOptionPane.showInputDialog("Masukkan Jumlah Setor: ");
                        if (Setor == null) System.exit(0);
                        int SetorUang = Integer.parseInt(Setor);
                        SaldoATM = SaldoATM + SetorUang;
                        
                        JOptionPane.showMessageDialog(null, "Saldo Anda saat ini: Rp " + SaldoATM, "Transaksi Berhasil",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (choice == 3) {
                        String Tarik = JOptionPane.showInputDialog("Masukkan Jumlah Tarik: ");
                        if (Tarik == null) System.exit(0);
                        int AmbilUang = Integer.parseInt(Tarik);
                        
                        // Validasi jika saldo kurang dari jumlah yang ingin ditarik
                        if (AmbilUang > SaldoATM) {
                            JOptionPane.showMessageDialog(null, 
                                "Maaf, saldo Anda tidak mencukupi!\nSaldo Anda saat ini: Rp " + SaldoATM, 
                                "Transaksi Gagal",JOptionPane.WARNING_MESSAGE);
                        } else {
                            // Jika saldo cukup, lakukan pengurangan
                            SaldoATM = SaldoATM - AmbilUang;
                            JOptionPane.showMessageDialog(null, "Saldo Anda Sisa: Rp " + SaldoATM,"Penarikan Berhasil",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else if (choice == 4) {
                        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Menggunakan\nLayanan Transaksi Dari Chindo Bank");
                        System.exit(0);
                    }
                }
            }
            else {
                Kesempatan++;
                JOptionPane.showMessageDialog(null, "PIN Salah!! Coba Lagi.", "Error", JOptionPane.ERROR_MESSAGE);
                
                if (Kesempatan >= 3) {
                    JOptionPane.showMessageDialog(null, "KARTU ANDA DIBLOKIR!!\nAnda Salah Memasukkan PIN 3 Kali", "Blokir", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }
    
    }
}
