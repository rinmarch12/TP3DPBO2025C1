public class Memory extends Ram {
    private int kapasitasStorage;
    private String tipeDrive;
    private String jenisMemory;
    private int kecepatanTransfer;
    
    // Konstruktor
    public Memory() {
        super();
        this.kapasitasStorage = 0;
        this.tipeDrive = "";
        this.jenisMemory = "";
        this.kecepatanTransfer = 0;
    }
    
    public Memory(int kapasitasRam, String ddr, int kapasitasStorage, String tipeDrive, 
                  String merk, String nama, String jenisMemory, int kecepatanTransfer) {
        super(kapasitasRam, ddr, merk, nama);
        this.kapasitasStorage = kapasitasStorage;
        this.tipeDrive = tipeDrive;
        this.jenisMemory = jenisMemory;
        this.kecepatanTransfer = kecepatanTransfer;
    }
    
    // Getter dan Setter untuk attributes tambahan
    public int getKapasitasStorage() {
        return kapasitasStorage;
    }
    
    public void setKapasitasStorage(int kapasitasStorage) {
        this.kapasitasStorage = kapasitasStorage;
    }
    
    public String getTipeDrive() {
        return tipeDrive;
    }
    
    public void setTipeDrive(String tipeDrive) {
        this.tipeDrive = tipeDrive;
    }
    
    public String getJenisMemory() {
        return jenisMemory;
    }
    
    public void setJenisMemory(String jenisMemory) {
        this.jenisMemory = jenisMemory;
    }
    
    public int getKecepatanTransfer() {
        return kecepatanTransfer;
    }
    
    public void setKecepatanTransfer(int kecepatanTransfer) {
        this.kecepatanTransfer = kecepatanTransfer;
    }
    
    // Method tambahan
    public void optimize() {
        System.out.println("Mengoptimalkan kinerja memory " + this.getMerk() + " " + this.getNama());
        System.out.println("Meningkatkan kecepatan transfer dari " + this.kecepatanTransfer + 
                           " MB/s menjadi " + (this.kecepatanTransfer * 1.2) + " MB/s");
    }
}