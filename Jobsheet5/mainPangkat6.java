import java.util.Scanner; 
public class mainPangkat6 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan Jumlah Elemen : "); 
        int elemen = input.nextInt(); 
 
    Pangkat6[] png = new Pangkat6[elemen]; 
    for (int i = 0; i < elemen; i++) { 
        System.out.print("Masukkan Nilai Basis Elemen Ke- "+(i+1)+": "); 
        int basis = input.nextInt(); 
        System.out.print("Masukkan Pangkat Basis Elemen Ke- "+(i+1)+": "); 
        int pangkat = input.nextInt(); 
        png[i] = new Pangkat6(basis, pangkat); 
         
    } 

    System.out.println("HASIL PANGKAT BRUTEFORCE : "); 
    for (Pangkat6 p : png) { 
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));   
    } 
    System.out.println("HASIL PANGKAT DIVIDE AND CONQUER"); 
    for (Pangkat6 p : png) { 
        System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));   
         } 
 
    } 
} 