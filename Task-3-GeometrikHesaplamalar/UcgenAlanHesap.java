// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class UcgenAlan {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        double u = (a+b+c) / 2;
        
        // Alan hesapla
        double alan =Math.sqrt(u * (u-a) * (u-b) * (u-c));
        
        // Sonucları hesapla
        System.out.println("Alan: " + alan);
    }
}
