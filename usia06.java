import java.util.Scanner;

public class usia06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int usia = -1;
    
        while (usia < 0) {
            System.out.print("Masukkan usia Anda (harus angka positif): ");
            
            if (input.hasNextInt()) {
                usia = input.nextInt();
                
                if (usia < 0) {
                    System.out.println("Input tidak valid. Usia harus merupakan angka positif.");
                }
            } else {
                System.out.println("Input tidak valid. Masukkan angka positif.");
                input.next(); 
            }
        }
        
        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }
        
        System.out.println("Anda termasuk dalam kategori: " + kategori);
    }
}
