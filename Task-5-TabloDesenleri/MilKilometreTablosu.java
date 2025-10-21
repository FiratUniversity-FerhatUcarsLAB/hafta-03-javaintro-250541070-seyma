public class MilKilometreTablosu {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        // Mil - kilometre dönüşüm oranı
        double milToKm = 1.609;

        // Hesaplanacak mil değerleri
        int mil1 = 1;
        int mil5 = 5;
        int mil10 = 10;
        int mil20 = 20;
        int mil50 = 50;

        // Hesaplamalar
        double km1 = mil1 * milToKm;
        double km5 = mil5 * milToKm;
        double km10 = mil10 * milToKm;
        double km20 = mil20 * milToKm;
        double km50 = mil50 * milToKm;

        // Sonuçları yazdır
        System.out.println("Mil -> Kilometre Hesaplamaları:");
        System.out.printf("%d mil = %.2f km\n", mil1, km1);
        System.out.printf("%d mil = %.2f km\n", mil5, km5);
        System.out.printf("%d mil = %.2f km\n", mil10, km10);
        System.out.printf("%d mil = %.2f km\n", mil20, km20);
        System.out.printf("%d mil = %.2f km\n", mil50, km50);
    }
}
