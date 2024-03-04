import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Langkah 1: Masukkan total detik
        System.out.print("Masukkan total detik: ");
        long totalDetik = scanner.nextLong();

        // Langkah 2: Hitung detik sekarang
        long detikSekarang = totalDetik % 60;

        // Langkah 3: Hitung total menit
        long totalMenit = totalDetik / 60;

        // Langkah 4: Hitung menit sekarang
        long menitSekarang = totalMenit % 60;

        // Langkah 5: Hitung total jam
        long totalJam = totalMenit / 60;

        // Langkah 6: Hitung jam sekarang
        long jamSekarang = totalJam % 24;

        // Langkah 7: Tampilkan waktu (jam : menit : detik)
        System.out.println("\nWaktu sekarang:");
        System.out.printf("%d : %d : %d", jamSekarang, menitSekarang, detikSekarang);

        scanner.close();
    }
}