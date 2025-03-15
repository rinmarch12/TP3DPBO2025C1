import java.util.ArrayList;
import java.util.List;

public class Komputer {
    private String nama;
    private Cpu cpu;
    private List<Ram> ramList;
    private Harddrive harddrive;
    private Memory memory;
    
    // Konstruktor
    public Komputer() {
        this.nama = "";
        this.cpu = null;
        this.ramList = new ArrayList<>();
        this.harddrive = null;
        this.memory = null;
    }
    
    public Komputer(String nama, Cpu cpu, List<Ram> ramList, Harddrive harddrive) {
        this.nama = nama;
        this.cpu = cpu;
        this.ramList = ramList != null ? ramList : new ArrayList<>();
        this.harddrive = harddrive;
        this.memory = null;
    }
    
    public Komputer(String nama, Cpu cpu, List<Ram> ramList, Memory memory) {
        this.nama = nama;
        this.cpu = cpu;
        this.ramList = ramList != null ? ramList : new ArrayList<>();
        this.harddrive = null;
        this.memory = memory;
    }
    
    // Metode untuk menambahkan RAM
    public void addRam(Ram ram) {
        ramList.add(ram);
    }
    
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Cpu getCpu() {
        return cpu;
    }
    
    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    
    public List<Ram> getRamList() {
        return ramList;
    }
    
    public void setRamList(List<Ram> ramList) {
        this.ramList = ramList;
    }
    
    public Harddrive getHarddrive() {
        return harddrive;
    }
    
    public void setHarddrive(Harddrive harddrive) {
        this.harddrive = harddrive;
    }
    
    public Memory getMemory() {
        return memory;
    }
    
    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    
    // Metode untuk menghitung total kapasitas RAM
    public int getTotalRamCapacity() {
        int total = 0;
        for (Ram ram : this.ramList) {
            total += ram.getKapasitasGb();
        }
        return total;
    }
    
    // Metode untuk menampilkan informasi komputer
    public void displayInfo() {
        System.out.println("Informasi Komputer:");
        System.out.println("Nama      : " + this.nama);
        
        if (this.cpu != null) {
            System.out.println("CPU       : " + this.cpu.getMerk() + " " + this.cpu.getNama() + 
                               " (" + this.cpu.getJumlahCore() + " Core) ~" + 
                               this.cpu.getKecepatanGhz() + "GHz");
        }
        
        System.out.println("RAM List  : ");
        for (int i = 0; i < this.ramList.size(); i++) {
            Ram ram = this.ramList.get(i);
            System.out.println("  [" + (i+1) + "] " + ram.getMerk() + " " + ram.getNama() + 
                               " (" + ram.getKapasitasGb() + " GB) " + ram.getDdr());
        }
        
        if (this.harddrive != null) {
            System.out.println("Harddrive : " + this.harddrive.getTipeDrive() + " " + 
                               this.harddrive.getMerk() + " " + this.harddrive.getNama() + 
                               " (" + this.harddrive.getKapasitasGb() + " GB)");
        }
        
        if (this.memory != null) {
            System.out.println("Memory    : " + this.memory.getJenisMemory() + " " + 
                               this.memory.getMerk() + " " + this.memory.getNama() + 
                               " (" + this.memory.getKapasitasGb() + " GB) " + 
                               this.memory.getTipeDrive() + " | Kecepatan Transfer: " + 
                               this.memory.getKecepatanTransfer() + " MB/s");
        }
    }
}