import java.util.ArrayList;
import java.util.Scanner;
public class perulangandowhileAplikasiKesehatan {
    public static void main (String[] args){
     // membuat variabel dan scanner DO WHILE
     Scanner scan = new Scanner (System.in);
      int pilihan;
      ArrayList<String> daftarPasien = new ArrayList<>();

        do {
            // Menampilkan menu sederhana
            System.out.println("========================");
            System.out.println("=== Menu Rumah Sakit ===");
            System.out.println("========================");
            System.out.println("1. Hitung BMI (Indeks Massa Tubuh)");
            System.out.println("2. Tambah Pasien");
            System.out.println("3. Lihat Daftar Pasien");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            if (pilihan == 1) {
                // Fitur perhitungan BMI
                System.out.print("Masukkan nama pasien: "); 
                String nama = scan.nextLine();
                System.out.print("Masukkan berat badan (kg): ");
                double berat = scan.nextDouble();
                System.out.print("Masukkan tinggi badan (meter): ");
                double tinggi = scan.nextDouble();

                double bmi = berat / (tinggi * tinggi);
                System.out.printf("Hasil BMI Anda: %.2f\n", bmi);

                // Menentukan kategori BMI
                if (bmi < 18.5) {
                    System.out.println("Kategori: Berat badan kurang");
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    System.out.println("Kategori: Normal / Ideal");
                } else if (bmi >= 25 && bmi <= 29.9) {
                    System.out.println("Kategori: Kelebihan berat badan");
                } else {
                    System.out.println("Kategori: Obesitas");
                }

        
            } else if (pilihan == 2) { 
                System.out.print("Masukkan nama pasien baru: ");
                String pasienBaru = scan.nextLine();
                daftarPasien.add(pasienBaru); // menyimpan nama pasien ke daftar
                System.out.println("Pasien " + pasienBaru + " berhasil ditambahkan!");
            } else if (pilihan == 3) {
                System.out.println("=== Daftar Pasien ===");
                if (daftarPasien.isEmpty()) {
                    System.out.println("Belum ada pasien yang terdaftar.");
                } else {
                    int no = 1;
                    for (String p : daftarPasien) {
                        System.out.println(no + ". " + p);
                        no++;
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan aplikasi.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println(); // memberi jarak antar output
        } while (pilihan != 4);

        scan.close();
    }
}






