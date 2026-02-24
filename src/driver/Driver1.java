import java.util.Scanner;

public class solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String kode;
        int porsi;
        int harga = 0;
        int total = 0;
        int subtotal;

        while (true) {

            kode = sc.nextLine();

            if (kode.equals("END")) {
                break;
            }

            porsi = Integer.parseInt(sc.nextLine());

            switch (kode) {
                case "NGS": harga = 15000; break;
                case "AP": harga = 20000; break;
                case "SA": harga = 25000; break;
                case "BU": harga = 18000; break;
                case "MAP": harga = 15000; break;
                case "GG": harga = 15000; break;
                case "ST": harga = 17000; break;
                case "RD": harga = 25000; break;
                case "IB": harga = 35000; break;
                case "NUK": harga = 20000; break;
                default:
                    continue;
            }

            subtotal = harga * porsi;
            total += subtotal;
        }

        // Menentukan kupon & diskon
        double diskon = 0;
        String kupon = "Tidak Ada";

        if (total >= 200000) {
            kupon = "Kuning";
            diskon = 0.10;
        } 
        else if (total >= 100000) {
            kupon = "Biru";
            diskon = 0.05;
        }

        double potongan = total * diskon;
        double totalBayar = total - potongan;

        // Output Struk
        System.out.println("===== STRUK PEMBELIAN =====");
        System.out.println("Total Belanja : Rp " + total);
        System.out.println("Kupon         : " + kupon);
        System.out.println("Diskon        : Rp " + (int)potongan);
        System.out.println("Total Bayar   : Rp " + (int)totalBayar);
        System.out.println("===========================");
    }
}
