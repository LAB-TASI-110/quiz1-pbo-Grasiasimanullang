import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input jumlah total data
        int N = sc.nextInt();

        int[] nilai = new int[N];

        // 2. Input deret nilai
        for (int i = 0; i < N; i++) {
            nilai[i] = sc.nextInt();
        }

        // 3. Input kode kelompok (1 atau 2)
        int kodeKelompok = sc.nextInt();

        int total = 0;

        for (int i = 0; i < N; i++) {

            // Pola sesuai gambar (zig-zag / selang-seling)
            if (kodeKelompok == 1 && i % 2 == 0) {
                total += nilai[i];
            } 
            else if (kodeKelompok == 2 && i % 2 != 0) {
                total += nilai[i];
            }
        }

        System.out.println(total);

        sc.close();
    }
}
