public class BinaryTreeMain06 {
    public static void main(String[] args) {
          BinaryTree06 bst = new BinaryTree06();

        bst.addRecursive(new Mahasiswa06("24416012l", "Ali", "A", 3.57));
        bst.addRecursive(new Mahasiswa06("24416022l", "Badar", "B", 3.85));
        bst.addRecursive(new Mahasiswa06("24416018S", "Candra", "C", 3.21));
        bst.addRecursive(new Mahasiswa06("24416022O", "Dewi", "B", 3.54));
        
        System.out.println("Daftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);
        
        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";;
        System.out.println(hasilCari);
        
        bst.addRecursive(new Mahasiswa06("24416013l", "Devi", "A", 3.72));
        bst.addRecursive(new Mahasiswa06("24416020S", "Ehsan", "D", 3.37));
        bst.addRecursive(new Mahasiswa06("24416017O", "Fizi", "B", 3.46));
        
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
        
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
        System.out.println();

        Mahasiswa06 ipkTerbesar = bst.cariMaxIpk();
        System.out.println("mahasiswa dengan ipk terbesar : " + ipkTerbesar.nama + " dengan ipk " + ipkTerbesar.ipk);
        Mahasiswa06 ipkTerkecil = bst.cariMinIpk();
        System.out.println("mahasiswa dengan ipk terkecil : " + ipkTerkecil.nama + " dengan ipk " + ipkTerkecil.ipk);
         System.out.println();
        bst.tampilMahasiswaIPKdiAtas(3.4);

        /* Tree



          3.57
         /    \
      3.21     3.85
         \     /
         3.54 3.72
        /
     3.37
        \
        3.46



         */
        
    }
}