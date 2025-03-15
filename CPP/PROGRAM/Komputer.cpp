#include <iostream>
#include <string>
#include <vector>
#include "Cpu.cpp"
#include "Ram.cpp"
#include "Harddrive.cpp"
#include "Memory.cpp"

using namespace std;

class Komputer
{

private:
    string nama;
    Cpu cpu;
    vector<Ram> ramList;
    Harddrive harddrive;
    Memory memory;

public:
    Komputer()
    {

    }

    Komputer(string nama, Cpu cpu, vector<Ram> ramList, Harddrive harddrive)
    {
        this->nama = nama;
        this->cpu = cpu;
        this->ramList = ramList;
        this->harddrive = harddrive;
    }

    Komputer(string nama, Cpu cpu, vector<Ram> ramList, Memory memory)
    {
        this->nama = nama;
        this->cpu = cpu;
        this->ramList = ramList;
        this->memory = memory;
        this->harddrive = Harddrive(memory.Harddrive::getKapasitasGB(), memory.getTipeDrive(), memory.getMerk(), memory.getNama());
    }

    void setNama(string nama)
    {
        this->nama = nama;
    }

    void setCpu(Cpu cpu)
    {
        this->cpu = cpu;
    }    

    void setRam(vector<Ram> ramList)
    {
        this->ramList = ramList;
    }    

    void addRam(Ram ram)
    {
        this->ramList.push_back(ram);
    }

    void setHarddrive(Harddrive harddrive)
    {
        this->harddrive = harddrive;
    }

    void setMemory(Memory memory)
    {
        this->memory = memory;
        // Update harddrive when memory is updated
        this->harddrive = Harddrive(memory.Harddrive::getKapasitasGB(), memory.getTipeDrive(), memory.getMerk(), memory.getNama());
    }

    string getNama()
    {
        return this->nama;
    }

    Cpu getCpu()
    {
        return this->cpu;
    }

    vector<Ram> getRamList() // return vector
    {
        return this->ramList;
    }

    Harddrive getHarddrive()
    {
        return this->harddrive;
    }

    Memory getMemory()
    {
        return this->memory;
    }

    int getTotalRamCapacity()
    {
        int total = 0;
        for (Ram ram : this->ramList)
        {
            total += ram.getKapasitasGB();
        }
        return total;
    }
    
    void displayInfo()
    {
        cout << "Informasi Komputer:" << endl;
        cout << "Nama      : " << this->nama << endl;
        cout << "Cpu       : " << this->cpu.getMerk() << ' ' << this->cpu.getNama() 
             << " (" << this->cpu.getJumlahCore() << " Core) " 
             << "~" << this->cpu.getKecepatanGHz() << "GHz" << endl;
        
        cout << "Ram List  : " << endl;
        for (int i = 0; i < this->ramList.size(); i++)
        {
            cout << "  [" << i+1 << "] " << this->ramList[i].getMerk() << ' ' 
                 << this->ramList[i].getNama() << " (" 
                 << this->ramList[i].getKapasitasGB() << " GB) " 
                 << this->ramList[i].getDdr() << endl;
        }
        
        cout << "Harddrive : " << this->harddrive.getTipeDrive() << ' ' 
             << this->harddrive.getMerk() << ' ' << this->harddrive.getNama() 
             << " (" << this->harddrive.getKapasitasGB() << " GB) " << endl;
        
        if (this->memory.getJenisMemory() != "")
        {
            cout << "Memory    : " << this->memory.getJenisMemory() << " " 
                 << this->memory.getMerk() << " " << this->memory.getNama()
                 << " (" << this->memory.Harddrive::getKapasitasGB() << " GB) "
                 << this->memory.getTipeDrive() << " | Kecepatan Transfer: " 
                 << this->memory.getKecepatanTransfer() << " MB/s" << endl;
        }
    }

    ~Komputer()
    {

    }
};