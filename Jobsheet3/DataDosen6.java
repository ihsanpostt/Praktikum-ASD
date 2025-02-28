public class DataDosen6 {
    void dataSemuaDosen(Dosen6[] arrayOfDosen){
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-"+(i+1));
            System.out.println("Kode Dosen    : "+ arrayOfDosen[i].kode);
            System.out.println("Nama Dosen    : "+ arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : "+ (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : "+ arrayOfDosen[i].usia);
            System.out.println("----------------------------------");   
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen6[] arrayOfDosen){
        int[] jumlahDosen = new int[2];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) jumlahDosen[0]++;
            else jumlahDosen[1]++;
        }
        System.out.println("Jumlah Dosen Pria    : "+jumlahDosen[0]);
        System.out.println("Jumlah Dosen Wanita    : "+jumlahDosen[1]);
        System.out.println("----------------------------------");   
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen6[] arrayOfDosen){
        float[] rerataUsia = new float[2];
        int[] jumlahDosen = new int[2];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                rerataUsia[0] += arrayOfDosen[i].usia;
                jumlahDosen[0]++;
            }
            else {
                rerataUsia[1] += arrayOfDosen[i].usia;
                jumlahDosen[1]++;
            }
        }
        rerataUsia[0] /= jumlahDosen[0];
        rerataUsia[1] /= jumlahDosen[1];
        System.out.println("Rata-rata Usia Dosen Pria    : "+rerataUsia[0]);
        System.out.println("Rata-rata Usia Dosen Wanita    : "+rerataUsia[1]);
        System.out.println("----------------------------------");
    }

    void infoDosenPalingTua(Dosen6[] arrayOfDosen){
        int tertua = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > arrayOfDosen[tertua].usia) tertua = i;
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode Dosen    : "+ arrayOfDosen[tertua].kode);
        System.out.println("Nama Dosen    : "+ arrayOfDosen[tertua].nama);
        System.out.println("Jenis Kelamin : "+ (arrayOfDosen[tertua].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : "+ arrayOfDosen[tertua].usia);
        System.out.println("----------------------------------");
    }
    void infoDosenPalingMuda(Dosen6[] arrayOfDosen){
        int termuda = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < arrayOfDosen[termuda].usia) termuda = i;
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode Dosen    : "+ arrayOfDosen[termuda].kode);
        System.out.println("Nama Dosen    : "+ arrayOfDosen[termuda].nama);
        System.out.println("Jenis Kelamin : "+ (arrayOfDosen[termuda].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : "+ arrayOfDosen[termuda].usia);
        System.out.println("----------------------------------");

    }
}