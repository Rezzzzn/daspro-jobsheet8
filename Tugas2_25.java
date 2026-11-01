
import java.util.Scanner;

public class Tugas2_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3!");
        } else {
            int jumlahSeluruh = 0;

            for (int i = 1; i <= n ; i++){
                for ( int j = 1 ; j<= n ; j++) {
                    int hasilPerkalian = i * j;
                    System.out.printf("%4d" , hasilPerkalian);
                    jumlahSeluruh += hasilPerkalian;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka : " + jumlahSeluruh);
        }
    }
}
