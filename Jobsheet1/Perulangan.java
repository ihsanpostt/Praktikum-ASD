import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nim :");
        String nim = scanner.nextLine();

        int n = nim.charAt(nim.length() - 1) - '0';

        if (n < 10) {
            n += 10;
        }

        System.out.println("==========================");
        System.out.println("n : " + n);

        for (int i = 2; i <= n; i += 2) {
            if (i != 6 && i != 10) {
                System.out.print("* " + i + " ");
            }
        }
    }
}
