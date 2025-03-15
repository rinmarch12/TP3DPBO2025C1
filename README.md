Janji
---
Saya Ririn Marchelina dengan NIM 2303662 mengerjakan Tugas Praktikum 3 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

---
Diagram
---
![tp3 drawio](https://github.com/user-attachments/assets/bc65d57f-46dd-4cab-a2e9-3bc1b244c3f7)


---
Desain Program
---
Program terdiri dari 5 kelas utama:

1. Komponen (Superclass)
- Atribut: merk, nama.
- Metode: Setter, Getter, display().

2. Cpu (Child dari Komponen)
- Atribut: jumlahCore, kecepatanGHz.
- Metode: Setter, Getter, display().

3. Ram (Child dari Komponen)
- Atribut: kapasitasGB, ddr.
- Metode: Setter, Getter, display().

4. Harddrive (Child dari Komponen)
- Atribut: kapasitasGB, tipeDrive.
- Metode: Setter, Getter, display().

5. Memory (Child dari Ram dan Harddrive - Multiple Inheritance)
- Atribut: jenisMemory, kecepatanTransfer.
- Metode: Setter, Getter, optimize(), display().

6. Komputer (Komposisi dari CPU, RAM, Harddrive, dan Memory)
- Atribut: cpu, vector<Ram>, harddrive, memory.
- Metode: Setter, Getter, displayInfo(), getTotalRamCapacity().

---
Alur Program
---

