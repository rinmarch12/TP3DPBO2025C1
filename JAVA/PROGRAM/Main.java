import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Buat komponen komputer
        Cpu cpu = new Cpu(8, 3.4, "Intel", "Core i7");
        Ram ram1 = new Ram(16, "DDR5", "Corsair", "Vengeance");
        Ram ram2 = new Ram(8, "DDR4", "Corsair", "Vengeance");
        Ram ram3 = new Ram(16, "DDR5", "Kingston", "FURY");
        Harddrive harddrive = new Harddrive(1024, "SSD", "Samsung", "Evo");
        Memory memory = new Memory(32, "DDR5", 2048, "NVME", "Crucial", "P5 Plus", "Integrated", 7000);
        
        // Buat list RAM untuk komputer pertama
        List<Ram> ram1List = new ArrayList<>();
        ram1List.add(ram1);
        ram1List.add(ram2);
        
        // Buat list RAM untuk komputer kedua
        List<Ram> ram2List = new ArrayList<>();
        ram2List.add(ram1);
        ram2List.add(ram3);
        
        // Buat komputer pertama dengan CPU, RAM, dan Harddrive
        Komputer komputer1 = new Komputer("PC Abdul", cpu, ram1List, harddrive);
        komputer1.addRam(ram3);
        
        // Buat komputer kedua dengan CPU, RAM, dan Memory
        Komputer komputer2 = new Komputer("PC Budi", cpu, ram2List, memory);
        
        // Tampilkan informasi
        komputer1.displayInfo();
        System.out.println("\nTotal RAM Capacity: " + komputer1.getTotalRamCapacity() + " GB");
        System.out.println("\n----------------------------------\n");
        komputer2.displayInfo();
        System.out.println("\nOptimizing Memory:");
        komputer2.getMemory().optimize();
    }
}