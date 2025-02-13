import java.util.Scanner;
public class Pemilihan{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double nilaiTgs, nilaiKuis, nilaiUTS, nilaiUAS;
        System.out.print("Masukkan nilai Tugas :");
        nilaiTgs = sc.nextDouble();
        System.out.print("Masukkan nilai Kuis :");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS :");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS :");
        nilaiUAS = sc.nextDouble();
        if (nilaiTgs > 100 || nilaiTgs < 0 || nilaiKuis > 100 || nilaiKuis < 0 || nilaiUTS > 100 || nilaiUTS < 0 || nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("Nilai Tidak Valid");
            return;
        }
        nilaiTgs = nilaiTgs * 0.20;
        nilaiKuis = nilaiKuis * 0.20;
        nilaiUTS = nilaiUTS * 0.30;
        nilaiUAS = nilaiUAS * 0.30;
        double totalNilai = nilaiTgs + nilaiKuis + nilaiUTS + nilaiUAS;
        System.out.println("Nilai Akhir : " + totalNilai);
        if (totalNilai > 80 && totalNilai <= 100) {
            System.out.println("Nilai Huruf : A");
        }else if (totalNilai > 73 && totalNilai <= 80) {
            System.out.println("Nilai Huruf : B+");
        }else if (totalNilai > 65 && totalNilai <= 73) {
            System.out.println("Nilai Huruf : B");
        }else if (totalNilai > 60 && totalNilai <= 65) {
            System.out.println("Nilai Huruf : C+");
        }else if (totalNilai > 50 && totalNilai <= 60) {
            System.out.println("Nilai Huruf : C");
        }else if (totalNilai > 30 && totalNilai <= 50) {
            System.out.println("Nilai Huruf : D");
        } else {
            System.out.println("Nilai Huruf : E");
        }
        if (totalNilai > 50 && totalNilai <= 100) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}