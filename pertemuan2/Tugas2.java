import java.lang.Math;
import java.util.Scanner;
public class Tugas2 {
    public static void main (String[] args){
        Double a, b, c, gamma;
        Scanner input = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("NIM   : 0110221095");
        System.out.println("Nama  : Muhammad Amar Dafi");
        System.out.println("Kelas : 3TI04");
        System.out.println("==========================");
        
        System.out.print("Masukkan nilai sisi a : ");
        a = input.nextDouble();

        System.out.print("Masukkan nilai sisi b : ");
        b = input.nextDouble();

        System.out.print("Masukkan nilai sudut(°) yang diapit a dan b : ");
        gamma = Math.toRadians(input.nextDouble());

        c = Math.sqrt(
            (a * a) + (b * b) - ((2 * a * b) * Math.cos(gamma))
        );

        input.close();
        System.out.println("Nilai sisi c adalah : " + c);
    }
}