public class Harddrive extends Komponen {
    private int kapasitasGb;
    private String tipeDrive;
    
    // Konstruktor
    public Harddrive() {
        super();
        this.kapasitasGb = 0;
        this.tipeDrive = "";
    }
    
    public Harddrive(int kapasitasGb, String tipeDrive, String merk, String nama) {
        super(merk, nama);
        this.kapasitasGb = kapasitasGb;
        this.tipeDrive = tipeDrive;
    }
    
    // Getter dan Setter
    public int getKapasitasGb() {
        return kapasitasGb;
    }
    
    public void setKapasitasGb(int kapasitasGb) {
        this.kapasitasGb = kapasitasGb;
    }
    
    public String getTipeDrive() {
        return tipeDrive;
    }
    
    public void setTipeDrive(String tipeDrive) {
        this.tipeDrive = tipeDrive;
    }
}