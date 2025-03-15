from Cpu import Cpu
from Ram import Ram
from Harddrive import Harddrive
from Memory import Memory
from Komputer import Komputer

if __name__ == "__main__":
    # Buat komponen komputer
    cpu = Cpu(8, 3.4, "Intel", "Core i7")
    ram1 = Ram(16, "DDR5", "Corsair", "Vengeance")
    ram2 = Ram(8, "DDR4", "Corsair", "Vengeance")
    ram3 = Ram(16, "DDR5", "Kingston", "FURY")
    harddrive = Harddrive(1024, "SSD", "Samsung", "Evo")
    memory = Memory(32, "DDR5", 2048, "NVME", "Crucial", "P5 Plus", "Integrated", 7000)
    
    # Buat komputer pertama dengan CPU, RAM, dan Harddrive
    komputer1 = Komputer("PC Abdul", cpu, [ram1, ram2], harddrive)
    komputer1.add_ram(ram3)
    
    # Buat komputer kedua dengan CPU, RAM, dan Memory
    komputer2 = Komputer("PC Budi", cpu, [ram1, ram3], memory=memory)
    
    # Tampilkan informasi
    komputer1.display_info()
    print("\nTotal RAM Capacity:", komputer1.get_total_ram_capacity(), "GB")
    print("\n----------------------------------\n")
    komputer2.display_info()
    print("\nOptimizing Memory:")
    komputer2.get_memory().optimize()