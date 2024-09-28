import java.util.Scanner;   
public class SIAKAD06 { 
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);   

        String nama, nim;  
        char kelas; 
        byte absen; 
        Double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;   
        String nilaiHuruf = "";
        String kualifikasi = "";

        System.out.print("Masukkan Nama: ");  
        nama = sc.nextLine(); 
        System.out.print("Masukkan Nim: ");  
        nim = sc.nextLine();    
        System.out.print("Masukkan Kelas: "); 
        kelas = sc.nextLine(). charAt(0);   
        System.out.print("Masukkan nomor absen: ");   
        absen = sc.nextByte();  

        System.out.print("Masukkan nilai kuis: ");    
        nilaiKuis = sc.nextDouble();    
        System.out.print("Masukkan nilai tugas: ");   
        nilaiTugas = sc.nextDouble();   
        System.out.print("Masukkan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if ( nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
     

        System.out.println("Mahasiswa dengan nama " + nama  + " (NIM " + nim + ") " + "kelas " + kelas  + " nomor absen " +
        absen + "\nNilai Akhir: " + nilaiAkhir + "\nNilai akhir huruf: " + nilaiHuruf + "\nKualifikasi: " + kualifikasi);    
    }
      
}
