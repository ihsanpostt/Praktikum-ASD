import java.util.Scanner;
public class fungsi {
    static Scanner sc = new Scanner(System.in);
    public static void hitungPendapatan(int[][] stockBunga, int[] harga) {      
        System.out.println("========================================================");
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual");
        System.out.println("========================================================");
    
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * harga[j];
            }
            System.out.println("Pendapatan Royal Garden " + (i + 1) + " : Rp " + totalPendapatan);
        }
    
        System.out.println("========================================================");
    }
    
    public static void tampilkanStokCabang(int[][] stockBunga) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    
        System.out.println("========================================================");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Jenis Bunga", "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4");
        System.out.println("========================================================");
    
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("%-15s", namaBunga[i]);
            for (int j = 0; j < stockBunga.length; j++) {
                System.out.printf("%-15d", stockBunga[j][i]);
            }
            System.out.println();
        }
        System.out.println("========================================================");
    }
    
    public static void penguranganStok(int[][] stockBunga) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] pengurangan = {1, 2, 0, 5}; 
    
        System.out.println("=============================================");
        System.out.println("Mengurangi Stok Bunga yang Mati di Royal Garden 4");
        System.out.println("=============================================");
    
        int cabang = 3; 
        
        for (int i = 0; i < namaBunga.length; i++) {
            if (stockBunga[cabang][i] >= pengurangan[i]) {
                stockBunga[cabang][i] -= pengurangan[i];
            } else {
                System.out.println("Stok bunga " + namaBunga[i] + " tidak cukup untuk dikurangi di Royal Garden 4.");
                stockBunga[cabang][i] = 0; 
            }
        }
    
        System.out.println("Pengurangan stok selesai.");
    }
    
    public static void main(String[] args) {
        int[][] stockBunga = {{10, 5, 15, 7}, {6, 11, 9, 12},{2,10,10,5},{5,7,12,9}};
        int [] harga = {75000, 50000, 60000, 10000};
        while (true) {
        System.out.println("=============================================");
        System.out.println("Selamat Datang Retail Toko Bunga Royal Garden");
        System.out.println("=============================================");
        System.out.println("1. Tampilkan Pendapatan");
        System.out.println("2. Tampilkan Stok per cabang");
        System.out.println("3. Pengurangan Stok");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu :");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                hitungPendapatan(stockBunga, harga);
                break;
            case 2:
                tampilkanStokCabang(stockBunga);
                break;
            case 3:
                penguranganStok(stockBunga);
                break;
            case 4:
                System.out.println("Terima Kasih");
                break;
        
            default:
            System.out.println("Menu Tidak Valid, coba lagi");
                break;
            }
            if (pilihan == 4) {
                break;
            }
        }
        
    }
    
}
