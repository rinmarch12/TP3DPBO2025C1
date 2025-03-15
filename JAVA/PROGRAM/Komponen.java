public class Komponen {
    private String merk;
    private String nama;
    
    // Konstruktor
    public Komponen() {
        this.merk = "";
        this.nama = "";
    }
    
    public Komponen(String merk, String nama) {
        this.merk = merk;
        this.nama = nama;
    }
    
    // Getter dan Setter
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
}