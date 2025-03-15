public class Ram extends Komponen {
    private int kapasitasGb;
    private String ddr;
    
    // Konstruktor
    public Ram() {
        super();
        this.kapasitasGb = 0;
        this.ddr = "";
    }
    
    public Ram(int kapasitasGb, String ddr, String merk, String nama) {
        super(merk, nama);
        this.kapasitasGb = kapasitasGb;
        this.ddr = ddr;
    }
    
    // Getter dan Setter
    public int getKapasitasGb() {
        return kapasitasGb;
    }
    
    public void setKapasitasGb(int kapasitasGb) {
        this.kapasitasGb = kapasitasGb;
    }
    
    public String getDdr() {
        return ddr;
    }
    
    public void setDdr(String ddr) {
        this.ddr = ddr;
    }
}