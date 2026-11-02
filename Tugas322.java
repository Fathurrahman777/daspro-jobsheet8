import java.util.Scanner;
public class Tugas322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko harus minimal 1");
        } else {
            int pelanggan = 0;
            int totalBarang = 0;
            int totalSemua = 0;
            int tokoTerbanyak = 0;
            int barangTerbanyak = -1;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan di toko " + i + ": ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                    i--;
                    continue;
                } else {
                    int barang = 0;
                    int j = 1;
                    while (j <= pelanggan) {
                        System.out.print("Masukkan jumlah barang yang dibeli pelanggan " + j + ": ");
                        barang = sc.nextInt();
    
                        if (barang < 0) {
                            System.out.println("Jumlah barang tidak boleh negatif. Ulangi input!");                            
                        } else {
                            totalBarang += barang;
                            totalSemua += barang;
                            j++;
                        }
                    }  
                      
                    
                   
                }
            }      
        }
            
    }

}
    

