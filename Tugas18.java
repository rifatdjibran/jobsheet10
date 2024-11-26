public class Tugas18 {

    public static void main(String[] args) {
        int[][] survei = {
            {5, 4, 3, 4, 5, 2},
            {3, 2, 4, 5, 4, 3},
            {4, 5, 5, 3, 4, 4},
            {3, 3, 2, 4, 4, 5},
            {4, 4, 3, 3, 5, 2},
            {5, 4, 4, 4, 3, 4},
            {3, 5, 3, 5, 2, 3},
            {4, 4, 5, 4, 4, 4},
            {5, 3, 4, 4, 5, 3},
            {4, 5, 4, 3, 4, 5}
        };

        double total = 0, rataRataResponden, rataRataPertanyaan, rataRataKeseluruhan, totalKeseluruhan;

        // Rata-Rata Per Responden
        System.out.println("Rata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            rataRataResponden = total / 6;
            System.out.println("Responden " + (i + 1) + " : " + rataRataResponden);
        }
        // Rata-Rata Per Pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            rataRataPertanyaan = total / 10;
            System.out.println("Responden " + (j + 1) + " : " + rataRataPertanyaan);
        }
        // Rata-Rata Keseluruhan
        totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        rataRataKeseluruhan = totalKeseluruhan / 60;
        System.out.println("Rata - rata keseluruhan :  " + rataRataKeseluruhan);
    }
}