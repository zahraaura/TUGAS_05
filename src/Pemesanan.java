// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    // Konstruktor untuk inisialisasi informasi pemesanan
    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    // Metode untuk mencetak nota pemesanan
    public void cetakNota() {
        double totalHarga = tiket.hitungHarga(jumlah);
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket.jenis);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}