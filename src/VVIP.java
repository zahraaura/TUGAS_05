// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Konstruktor untuk tiket VVIP dengan harga variabel
    public VVIP(double harga) {
        super("VVIP", harga);
    }

    // Mengimplementasikan metode hitungHarga
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}