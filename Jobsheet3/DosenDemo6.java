import java.util.Scanner;
public class DosenDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen6[] arrayOfDosen = new Dosen6[3];
        DataDosen6 dataDosen = new DataDosen6();
        for (int i = 0; i < arrayOfDosen.length; i++) {
            String kode,nama;
            boolean jenisKelamin;
            int usia;
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode Dosen    : ");
            kode = sc.nextLine();
            System.out.print("Nama Dosen    : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            System.out.println("------------------------------");
            sc.nextLine();
            arrayOfDosen[i] = new Dosen6(kode, nama, jenisKelamin, usia);
        }

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}