import java.util.Scanner;

public class PemilihanBilangan06{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;
        String hasil;

        System.out.print("Masukkan sebuah angka: ");
        angka = input.nextInt();    

        hasil = (angka % 2 == 0) ? " termasuk bilangan genap" : " termasuk bilangan ganjil";
        System.out.println("Angka " + angka + hasil );
    }
}
