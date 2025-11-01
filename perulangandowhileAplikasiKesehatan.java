import java.util.Scanner;
public class perulangandowhileAplikasiKesehatan {
    public static void main (String[] args){
     // membuat variabel dan scanner DO WHILE
     Scanner scan = new Scanner (System.in);
      int pilihan;

        do {
            // Menampilkan menu sederhana
            System.out.println("=== Menu Rumah Sakit ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Lihat Daftar Pasien");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();

            if (pilihan == 1) {
                System.out.println("Fitur Tambah Pasien belum tersedia.");
            } else if (pilihan == 2) {
                System.out.println("Fitur Lihat Daftar Pasien belum tersedia.");
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3);
        scan.close();
    }}

