import java.util.Scanner;

public class LaundryDel {

    static final double HARGA_KILOAN = 7000;
    static final double HARGA_SATUAN = 10000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== SISTEM LAUNDRY DEL =====");
            System.out.println("1. Input Transaksi Laundry");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                prosesTransaksi(input);
            }

        } while (pilihan != 2);

        System.out.println("Terima kasih telah menggunakan sistem Laundry Del.");
        input.close();
    }

    public static void prosesTransaksi(Scanner input) {

        System.out.println("\n--- Input Data Pelanggan ---");
        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();

        System.out.print("No HP: ");
        String noHP = input.nextLine();

        System.out.println("\nPilih Jenis Layanan:");
        System.out.println("1. Cuci Kiloan (Rp 7000/kg)");
        System.out.println("2. Cuci Satuan (Rp 10000/item)");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();

        double jumlah;
        double total = 0;

        if (jenis == 1) {
            System.out.print("Masukkan Berat (kg): ");
            jumlah = input.nextDouble();
            total = jumlah * HARGA_KILOAN;
        } else if (jenis == 2) {
            System.out.print("Masukkan Jumlah Item: ");
            jumlah = input.nextDouble();
            total = jumlah * HARGA_SATUAN;
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        input.nextLine();

        System.out.print("Metode Pembayaran (Cash/Transfer): ");
        String metode = input.nextLine();

        System.out.println("\n===== STRUK LAUNDRY DEL =====");
        System.out.println("Nama          : " + nama);
        System.out.println("No HP         : " + noHP);
        System.out.println("Total Bayar   : Rp " + total);
        System.out.println("Pembayaran    : " + metode);
        System.out.println("Status        : Diproses");
        System.out.println("==============================");
    }
}
