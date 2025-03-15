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
1. Inisialisasi Data
- Membuat objek CPU, RAM, Harddrive, dan Memory.
- Membuat objek Komputer dengan komponen tersebut.

2. Menampilkan Data Awal
- Menampilkan informasi spesifikasi komputer.

3. Input Pengguna untuk Menambahkan RAM
- Pengguna memasukkan detail RAM baru, lalu RAM ditambahkan ke vector<Ram>.

4. Menampilkan Data Setelah Penambahan
- Program menghitung ulang kapasitas total RAM dan menampilkan spesifikasi terbaru.

5. Optimasi Memory (Jika Ada)
- Jika Komputer memiliki objek Memory, metode optimize() dijalankan untuk meningkatkan kecepatan transfer.

---
Dokumentasi
---
![Dokumentasi](https://github.com/user-attachments/assets/50cac919-9c0a-4361-8081-6ce76e940c38)



