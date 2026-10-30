import java.util.Scanner;
public class Tugas222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        int total = 0;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int hasil = i * j;

                System.out.print(hasil + "\t");

                total += hasil;
                j++;
                
            }
            
            System.out.println();
            i++;
        }

        System.out.println("Jumlah seluruh angka: " +total);
        
        sc.close();

    }
    
}
