// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    protected String jenis; //Jenis tiket
    protected double harga; //Harga tiket

    // Konstruktor untuk inisialisasi jenis dan harga tiket
    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    // Metode abstrak untuk menghitung total harga tiket berdasarkan jumlah
    public abstract double hitungHarga(int jumlah);
}