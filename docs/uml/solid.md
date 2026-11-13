# Prinsip SOLID pada Aset-Pinjam

## 1. Single Responsibility Principle (SRP)
Terjadi pada kelas `KatalogAset` dan `JadwalPeminjaman`. Inti daripada SRP adalah satu kelas memiliki tanggung jawab utama namun juga memiliki satu kelompok alasan untuk berubah. `KatalogAset` bertanggungjawab mengelola koleksi dan pencarian aset (seperti daftar aset), sedangkan `JadwalPeminjaman` dirancang untuk transaksi peminjaman, pengaturan jadwal, dsb. Kedua kelas memiliki tanggung jawab dan alasan perubahan yang berbeda dan tidak harus saling memengaruhi.

## 2. Open/Closed Principle (OCP)
Inti daripada OCP adalah sistem boleh menambahkan jenis baru namun penambahan tersebut sebisa mungkin tidak mengharuskan mengubah kode yang sudah stabil. Ini terjadi pada `Aset`, `Laptop`, `Ruang`, dan `AlatLab`, dimana `Aset` menyediakan method `hitungDenda()` yang dapat dioverride, sedangkan setiap subclass memiliki implementasi masing-masing. Maka, Java memilih implementasi subclass polimorfisme dengan jenis aset baru / subclass dapat ditambahkan melalui inheritance dan overriding tanpa perlu mengubah kode klien; `KatalogAset`. 

## 3. Dependency Inversion Principle (DIP)
Inti dari DIP adalah bergantung pada abstraksi. Dengan contoh `AsetService` dirancang untuk menerima `Asetrepository` lewat konstruktor, dengan `InMemoryAsetRepository` adalah implementasinya. DIP membuat AsetService tidak tahu terkait data apakah disimpan di memori atau database. Maka untuk tes cukup memberikam sopository in-memory dan untuk produksiRancangan serupa ada di `LayanaDenda` mereima `AturanDenda` lewat konstruktor, dengan ``DendaFlat` dan `DendaProgresif` sebagai implementasi berbeda. 


## Refactor
Untuk saat ini, belum ada refactor jelas karena dari pemisahan model hingga akses data sudah cukup jelas. Refactor kecil yang bisa dilakukan seperti menjadikan `hitungDenda(int)` abstraksi di `Aset`. Implementasi hanya ada di class Induk dan cocok untuk subclass-subclass yang menerimanya seperti `Ruang`, jadi perubahan relative aman.