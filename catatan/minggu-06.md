# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Merancang diagram UML dan Sequence melalui `draw.io` untuk menggambarkan struktur dan proses pada sistem `Aset-Pinjam`. Penyusunan `class-diagram` melibatkan atribut, relasi, hingga paket dan `Sequence` menggunakan 2 skenario; true dan false, denga fragment `alt`. Penyusunan `solid.md` untuk menjelaskan prinsip SRP, OCP, dan DIP serta kasus di class-nya.

## Keputusan desain
Prinsip SRP saya menggunakan `KatalogAset` dan `JadwalPeminjaman`; untuk OCP saya menggunakan `Aset` dengan tambahan `Ruang`, dan bisa juga subclass sejenisnya lewat `hitungDenda()`; untuk DIP saya menggunakan `AsetService` yang bergantyng  pada `AsetRepository`. Alasan saya memilih penerapan dengan class/subclass tersebut dikarenakan ketiganya paling terlihat di kode dan contoh class/subclass diatas adalah yang paling menonjol.

## Kendala
- **Kesulitan:** Memahami DIP dan juga OCP, struggle juga dalam pembuatan diagram karena ini pertama kali untuk saya membuat UML dan Sequence.
- **Solusi yang saya terapkan:** Saya menggunakan DeepSeek untuk membuatkan saya struktur kode, dengan ini memudahkan saya untuk membuat diagram di `draw.io`. Saya juga menggunakan ChatGPT sebagai penjelas apa itu SRP, OCP, dsb dengan cara tebak-tebakan terlebih dahulu setelah itu baru menjelaskan dengan kata yaang umum dibidangnya ditambah penjelasan tambahan dalam bentuk analogi.

## Penggunaan AI
- **Alat yang dipakai:** ChatGPT dan DeepSeek
- **Bagian yang dibantu AI:**
    - Pembuatan struktur kode yang akan diekspor ke `draw.io` terkait diagram.
    - Penjelasan terkait apa itu SOLID dan apa itu SRP, OCP, dan DIP.
- **Prompt utama:** 
    - "Tolong buatkan saya kerangka untuk UML nya dulu, lalu jelaskan kepada saya maksud maksud simbol yang tertera di dalam UML nya".
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** 
Saya menolak saran dari ChatGPT terkait pembuatan struktur kode yang bisa dikatakan kurang akurat.
- **Satu hal yang saya pahami lebih baik sekarang:** 
Inti dari SRP adalah 1 class sebaiknya memiliki 1 tanggung jawab utama dan 1 alasan untuk berubah. Ini dimaksudkan agar setiap class memiliki tanggung jawab yang jelas tanpa memengaruhi antar class.

## Kuis tanpa AI
1. **Perbedaan aggregation dan composition:**
- Aggregation itu objek bisa berdiri sendiri tanpa bergantung pada siklus hidup objek ownernya.
- Conposition itu objek bagiannyaa secara keseluruhan bergantung pada siklus objek ownernya.

2. **Mengapa OCP memudahkan pengembangan:**
Karena OCP dirancang agar sistem bisa ditambahkan jenis yang baru tanpa perlu mengubah kode lama yang sudah stabil.

3. **Mengapa DIP meningkatkan testability:**
Ketergantungan pada interface dan abstraksi membuat sebuah komponen bisa menerima berbagai implementasi melalui Dependency Injection. Hal ini yang meningkatkan testibility karena kita bisa mengganti dependency asli dengan objek pengujian.
