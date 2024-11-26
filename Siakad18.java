import java.util.Scanner;

public class Siakad18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahSiswa, jumlahMatkul;
        int[][] nilai;
        
        while (true) {
            System.out.print("Masukkan jumlah siswa: ");
            jumlahSiswa = input.nextInt();

            System.out.print("Masukkan jumlah mata kuliah: ");
            jumlahMatkul = input.nextInt();

            // Inisialisasi array nilai dengan jumlah siswa dan mata kuliah yang baru
            nilai = new int[jumlahSiswa][jumlahMatkul];

            // Input nilai untuk setiap siswa dan mata kuliah
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.println("Input nilai mahasiswa ke-" + (i + 1));
                double totalPerSiswa = 0;

                for (int j = 0; j < jumlahMatkul; j++) {
                    System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                    nilai[i][j] = input.nextInt();
                    totalPerSiswa += nilai[i][j];
                }

                System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
            }

            System.out.println("=========================================");
            System.out.println("Rata-rata nilai setiap Mata Kuliah:");

            for (int j = 0; j < jumlahMatkul; j++) {
                double totalPerMatkul = 0;

                for (int i = 0; i < jumlahSiswa; i++) {
                    totalPerMatkul += nilai[i][j];
                }

                System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
            }

            
            System.out.print("Apakah Anda ingin mengubah jumlah siswa dan mata kuliah? (y/n): ");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        input.close();
    }
}
