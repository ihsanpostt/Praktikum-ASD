import java.util.Scanner;
public class fungsi {
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] stok = new int[4][4];
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Masukkan stok untuk " + cabang[i] + ":");
            System.out.print("Aglonema: ");
            stok[i][0] = input.nextInt();
            System.out.print("Keladi: ");
            stok[i][1] = input.nextInt();
            System.out.print("Alocasia: ");
            stok[i][2] = input.nextInt();
            System.out.print("Mawar: ");
            stok[i][3] = input.nextInt();
        }
        
        System.out.println("\nPendapatan jika semua bunga terjual:");
        hitungPendapatan(stok, cabang);
        
        kurangiStok(stok);
        
        System.out.println("\nStok setelah pengurangan karena bunga mati:");
        tampilkanStok(stok, cabang);
        
        input.close();
    }
    
    public static void hitungPendapatan(int[][] stok, String[] cabang) {
        for (int i = 0; i < 4; i++) {
            int pendapatan = (stok[i][0] * HARGA_AGLONEMA) + (stok[i][1] * HARGA_KELADI) +
                             (stok[i][2] * HARGA_ALOCASIA) + (stok[i][3] * HARGA_MAWAR);
            System.out.println(cabang[i] + " : Rp " + pendapatan);
        }
    }
    
    public static void kurangiStok(int[][] stok) {
        for (int i = 0; i < 4; i++) {
            stok[i][0] -= 1; 
            stok[i][1] -= 2;
            stok[i][3] -= 5;
        }
    }
    
    public static void tampilkanStok(int[][] stok, String[] cabang) {
        System.out.printf("%-15s %-10s %-10s %-10s %-10s\n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-15s %-10d %-10d %-10d %-10d\n", cabang[i], stok[i][0], stok[i][1], stok[i][2], stok[i][3]);
     }
  }
}