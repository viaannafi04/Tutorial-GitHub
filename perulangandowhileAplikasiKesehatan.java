import java.util.Scanner;
public class perulangandowhileAplikasiKesehatan {
    public static void main (String[] args){
     // membuat variabel dan scanner DO WHILE
     Scanner scan = new Scanner (System.in);
      int pilihan;

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

            if (pilihan == 1) {
                // Fitur perhitungan BMI
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
                System.out.println("Fitur Tambah Pasien belum tersedia.");
            } else if (pilihan == 3) {
                System.out.println("Fitur Lihat Daftar Pasien belum tersedia.");
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan aplikasi.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println(); // memberi jarak antar output
        } while (pilihan != 3);

        scan.close();
    }
}




