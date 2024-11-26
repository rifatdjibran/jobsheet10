public class Bioskop18 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        System.out.println("Panjang array utama: " + penonton.length);

        int i = 1;
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris ke-" + i + ": " + barisPenonton.length);
            i++;
        }

        for (int j = 0; j < penonton.length; j++) { 
            System.out.println("Penonton pada baris ke-" + (j+1) + ": " + String.join(", ", penonton[j]));
        }
    }
}
