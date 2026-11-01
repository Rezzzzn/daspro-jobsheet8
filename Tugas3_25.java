import java.util.Scanner;

public class Tugas3_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukan jumlah toko :");
        int jumlahToko  = sc.nextInt();

        if (jumlahToko < 1){
            System.out.println("Jumlah toko minimal 1!");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarang = -1;
            int tokoTerbanyak = 0;

            for ( int i = 1 ; i <= jumlahToko ; i++) {
                System.out.println("Toko" + i);

                System.out.print("Masukan jumlah pelanggan : ");
                int jumlahPelanggan = sc.nextInt();

                while (jumlahPelanggan < 0) {
                    System.out.print ("Jumlah pelanggan tidak boleh negatif. Masukan kembali : ");
                    jumlahPelanggan = sc.nextInt();
                }
                int totalBarangTokoIni = 0;

                for (int j = 1 ; j <= jumlahPelanggan ; j++) {
                    System.out.print ("Jumlah barang dibeli pelanggan : " +  j + ":");
                    int jumlahBarang = sc.nextInt();

                    while (jumlahBarang < 0) {
                        System.out.print("Jumlah barang tidak boleh negatif. Masukan kembali :");
                        jumlahBarang = sc.nextInt(); 
                    }
                    totalBarangTokoIni += jumlahBarang;
                }
                System.out.println("Toko" + i + "-> Pelanggan :" + jumlahPelanggan + "Total barang :" + totalBarangTokoIni);
                totalBarangSeluruhToko += totalBarangTokoIni;

                if (totalBarangTokoIni > maxBarang) {
                    maxBarang = totalBarangTokoIni;
                    tokoTerbanyak = i;
                }
            }
            System.out.println("=======================");
            System.out.println("Total barang seluruh toko : " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
            System.out.println("=======================");
        }
    }
}
