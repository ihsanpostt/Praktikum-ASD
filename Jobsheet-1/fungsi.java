import java.util.Scanner;

public class Fungsi {

    public static void hitungPendapatan(int[][] stok, int[][] hargaBunga) {
        // Harga per jenis bunga
        int[] harga = {75000, 50000, 60000, 10000}; 
        
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j]; 
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": " + pendapatan);
        }
    }

    public static void tampilkanStokSetelahPengurangan(int[] stokAwal) {
        Scanner scanner = new Scanner(System.in);

        int[] pengurangan = new int[stokAwal.length];

        System.out.println("Masukkan pengurangan stok bunga pada RoyalGarden 4:");
        for (int i = 0; i < stokAwal.length; i++) {
            System.out.print("Pengurangan stok bunga ke-" + (i + 1) + ": ");
            pengurangan[i] = scanner.nextInt();
        }

        for (int i = 0; i < stokAwal.length; i++) {
            int stokAkhir = stokAwal[i] - pengurangan[i];
            System.out.println("Stok akhir bunga ke-" + (i + 1) + " setelah pengurangan: " + stokAkhir);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] stokBunga = {
            {10, 5, 15, 9}, 
            {7, 6, 11, 9},  
            {12, 2, 10, 10}, 
            {5, 5, 7, 12}   
        };

        int[][] hargaBunga = {
            {75000, 50000, 60000, 10000}
        };

        hitungPendapatan(stokBunga, hargaBunga);

       
        System.out.println("\nStok bunga setelah pengurangan di RoyalGarden 4:");
        tampilkanStokSetelahPengurangan(stokBunga[3]);
    }
}
