import java.util.Scanner;

public class PemilihanHariDenganIf06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int dayNumber = input.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            System.out.println("Weekday");
        }
        else if (dayNumber == 6 || dayNumber == 7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
