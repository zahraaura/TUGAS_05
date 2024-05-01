// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
    // Mengimplementasikan metode hitungHarga dari kelas induk
    public VIP(double harga) {
        super("VIP", harga);
    }

    // Mengimplementasikan metode hitungHarga
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}