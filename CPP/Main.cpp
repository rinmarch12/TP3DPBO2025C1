#include <bits/stdc++.h>
#include "Cpu.cpp"
#include "Ram.cpp"
#include "Harddrive.cpp"
#include "Memory.cpp"
#include "Komputer.cpp"

using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie();

    // Buat komponen-komponen
    Cpu cpu(8, 3.4, "Intel", "Core i7");
    Ram ram1(16, "DDR5", "Corsair", "Vengeance");
    Ram ram2(8, "DDR4", "Corsair", "Vengeance");
    Ram ram3(16, "DDR5", "Kingston", "FURY");
    Harddrive harddrive(1024, "SSD", "Samsung", "Evo");
    
    // Buat memory dengan multiple inheritance
    Memory memory(32, "DDR5", 2048, "NVME", "Crucial", "P5 Plus", "Integrated", 7000);

    // Buat komputer dengan harddrive
    Komputer komputer1("PC Abdul", cpu, {ram1, ram2}, harddrive);
    komputer1.addRam(ram3);
    
    // Buat komputer dengan memory
    Komputer komputer2("PC Budi", cpu, {ram1, ram3}, memory);
    
    // Tampilkan info komputer pertama
    komputer1.displayInfo();
    
    cout << "\nTotal RAM Capacity: " << komputer1.getTotalRamCapacity() << " GB" << endl;
    
    cout << "\n----------------------------------\n" << endl;
    
    // Tampilkan info komputer kedua
    komputer2.displayInfo();
    
    cout << "\nOptimizing Memory:" << endl;
    komputer2.getMemory().optimize();
    
    return 0;
}