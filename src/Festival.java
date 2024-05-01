// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Konstruktor untuk tiket Festival dengan harga 100
    public Festival() {
        super("Festival", 100);
    }

    // Mengimplementasikan metode hitungHarga
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}