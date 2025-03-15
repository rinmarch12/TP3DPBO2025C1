class Komputer:
    def __init__(self, nama="", cpu=None, ram_list=None, harddrive=None, memory=None):
        self.__nama = nama
        self.__cpu = cpu 
        self.__ram_list = ram_list if ram_list is not None else []
        self.__harddrive = harddrive
        self.__memory = memory

    def add_ram(self, ram):
        """Menambahkan RAM ke dalam komputer."""
        self.__ram_list.append(ram)

    def get_nama(self):
        return self.__nama

    def get_cpu(self):
        return self.__cpu

    def get_ram_list(self):
        return self.__ram_list

    def get_harddrive(self):
        return self.__harddrive
    
    def get_memory(self):
        return self.__memory
    
    def get_total_ram_capacity(self):
        """Menghitung total kapasitas RAM yang terpasang."""
        total = 0
        for ram in self.__ram_list:
            total += ram.get_kapasitas_gb()
        return total
    
    def getTotalRamCapacity(self):
        """Menghitung total kapasitas RAM yang terpasang (metode alternatif)."""
        total = 0
        for ram in self.__ram_list:
            total += ram.get_kapasitas_gb()
        return total

    def display_info(self):
        print("Informasi Komputer:")
        print(f"Nama      : {self.__nama}")
        
        if self.__cpu:
            print(f"CPU       : {self.__cpu.get_merk()} {self.__cpu.get_nama()} "
                  f"({self.__cpu.get_jumlah_core()} Core) ~{self.__cpu.get_kecepatan_ghz()}GHz")
        
        print("RAM List  : ")
        for i, ram in enumerate(self.__ram_list):
            print(f"  [{i+1}] {ram.get_merk()} {ram.get_nama()} "
                  f"({ram.get_kapasitas_gb()} GB) {ram.get_ddr()}")
        
        if self.__harddrive:
            print(f"Harddrive : {self.__harddrive.get_tipe_drive()} {self.__harddrive.get_merk()} "
                  f"{self.__harddrive.get_nama()} ({self.__harddrive.get_kapasitas_gb()} GB)")
        
        if self.__memory:
            print(f"Memory    : {self.__memory.get_jenis_memory()} {self.__memory.get_merk()} "
                  f"{self.__memory.get_nama()} ({self.__memory.get_kapasitas_gb()} GB) "
                  f"{self.__memory.get_tipe_drive()} | Kecepatan Transfer: "
                  f"{self.__memory.get_kecepatan_transfer()} MB/s")