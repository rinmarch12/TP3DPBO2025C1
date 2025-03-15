#pragma once
#include <iostream>
#include <string>
#include "Ram.cpp"
#include "Harddrive.cpp"

using namespace std;

class Memory : public Ram, public Harddrive 
{
private:
    string jenisMemory;
    int kecepatanTransfer;

public:
    // Constructor kosong
    Memory()
    {
    }

    // Constructor dengan parameter
    Memory(int ramSize, string ddr, 
           int storageSize, string type, 
           string merk, string nama, 
           string jenis, int kecepatan)
        : Ram(ramSize, ddr, merk, nama), 
          Harddrive(storageSize, type, merk, nama)
    {
        this->jenisMemory = jenis;
        this->kecepatanTransfer = kecepatan;
    }

    void setJenisMemory(string jenis) 
    { 
        this->jenisMemory = jenis; 
    }
    
    void setKecepatanTransfer(int kecepatan) 
    { 
        this->kecepatanTransfer = kecepatan; 
    }
    
    string getJenisMemory() 
    { 
        return this->jenisMemory; 
    }
    
    int getKecepatanTransfer() 
    { 
        return this->kecepatanTransfer; 
    }

    string getMerk() 
    {
        return Ram::getMerk();
    }
    
    string getNama() 
    {
        return Ram::getNama();
    }

    // Method tambahan
    void optimize() 
    {
        cout << "Mengoptimalkan kinerja memory " << getMerk() << " " << getNama() << endl;
        cout << "Meningkatkan kecepatan transfer dari " << kecepatanTransfer 
             << " MB/s menjadi " << (kecepatanTransfer * 1.2) << " MB/s" << endl;
    }

    // Destructor
    ~Memory()
    {
    }
};