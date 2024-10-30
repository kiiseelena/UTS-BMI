package bmi;

/**
 *
 * @author kieee
 */
import java.util.Scanner;
public class bmi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------- Kalkulator BMI --------");
        System.out.println("--------------------------------");
        System.out.print("Masukan tinggi badan : ");
        int tinggiBadan = in.nextInt();
        System.out.print("Masukan berat badan : ");
        int beratBadan = in.nextInt();
        bmiBeraksi operasiBMI = new bmiBeraksi(tinggiBadan, beratBadan);
        operasiBMI.operasiBMI();
    }
}