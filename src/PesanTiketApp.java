import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Meminta nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        // Memilih tahap pembelian
        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();

        // Memilih jenis tiket
        Tiket tiket = null;
        if (tahapPembelian == 1) {
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int jenisTiket = scanner.nextInt();
            System.out.println();

            if (jenisTiket == 1) {
                tiket = new VIP(150 * 0.8); // Harga presale VIP
            } else if (jenisTiket == 2) {
                tiket = new VVIP(200 * 0.8); // Harga presale VVIP
            } else {
                System.out.println("Input tidak valid!");
                return;
            }
        } else if (tahapPembelian == 2) {
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();
            System.out.println();

            if (jenisTiket == 1) {
                tiket = new Festival();
            } else if (jenisTiket == 2) {
                tiket = new VIP(150);
            } else if (jenisTiket == 3) {
                tiket = new VVIP(200);
            } else {
                System.out.println("Input tidak valid!");
                return;
            }
        } else {
            System.out.println("Input tidak valid!");
            return;
        }

        // Memasukkan jumlah tiket
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        // Membuat objek pemesanan
        Pemesanan pesanan = new Pemesanan(nama, tahapPembelian == 1 ? "Presale" : "Reguler", tiket, jumlahTiket);

        // Mencetak nota pemesanan
        pesanan.cetakNota();
    }
}