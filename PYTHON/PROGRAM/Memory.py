from Ram import Ram
from Harddrive import Harddrive

class Memory(Ram, Harddrive):
    def __init__(self, kapasitas_ram=0, ddr="", kapasitas_storage=0, tipe_drive="", 
                 merk="", nama="", jenis_memory="", kecepatan_transfer=0):
        # Memanggil constructor dari kedua parent class
        Ram.__init__(self, kapasitas_ram, ddr, merk, nama)
        Harddrive.__init__(self, kapasitas_storage, tipe_drive, merk, nama)
        self.__jenis_memory = jenis_memory
        self.__kecepatan_transfer = kecepatan_transfer
    
    #Setter
    def set_jenis_memory(self, jenis):
        self.__jenis_memory = jenis
    
    def set_kecepatan_transfer(self, kecepatan):
        self.__kecepatan_transfer = kecepatan
    
    #Getter
    def get_jenis_memory(self):
        return self.__jenis_memory
    
    def get_kecepatan_transfer(self):
        return self.__kecepatan_transfer
    
    # Method tambahan
    def optimize(self):
        print(f"Mengoptimalkan kinerja memory {self.get_merk()} {self.get_nama()}")
        print(f"Meningkatkan kecepatan transfer dari {self.__kecepatan_transfer} "
              f"MB/s menjadi {self.__kecepatan_transfer * 1.2} MB/s")