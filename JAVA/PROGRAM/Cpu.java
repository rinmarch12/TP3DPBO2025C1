public class Cpu extends Komponen {
    private int jumlahCore;
    private double kecepatanGhz;
    
    // Konstruktor
    public Cpu() {
        super();
        this.jumlahCore = 0;
        this.kecepatanGhz = 0.0;
    }
    
    public Cpu(int jumlahCore, double kecepatanGhz, String merk, String nama) {
        super(merk, nama);
        this.jumlahCore = jumlahCore;
        this.kecepatanGhz = kecepatanGhz;
    }
    
    // Getter dan Setter
    public int getJumlahCore() {
        return jumlahCore;
    }
    
    public void setJumlahCore(int jumlahCore) {
        this.jumlahCore = jumlahCore;
    }
    
    public double getKecepatanGhz() {
        return kecepatanGhz;
    }
    
    public void setKecepatanGhz(double kecepatanGhz) {
        this.kecepatanGhz = kecepatanGhz;
    }
}