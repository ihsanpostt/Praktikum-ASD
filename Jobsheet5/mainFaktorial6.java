import java.util.Scanner;

public class mainFaktorial6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai faktorial: ");
        int nilai = scanner.nextInt();

        Faktorial6 fk = new Faktorial6();

        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
