# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Saya melengkapi 4 method seperti: `bentrok()`, `semuaUrutMulai()`, `perAset()`, dan `hapus()`, yang ada di class `JadwalPeminjaman`. Saya juga menulis batas waktu dengan mekanisme tidak bentrok dengan detail ada di `docs/asumsi.md`.

## Keputusan desain
Menggunakan batas waktu tidak bentrok atau setengah-terbuka pada method `bentrok()` dengan detail ada pada `docs/asumsi.md`. Selebihnya saya menggunakan sistem salin list -> sort -> List.Copyof pada method `semuaUrutMulai` agar data internal tidak ikut terurut dan hasil tidak bisa diubah oleh pemanggil.

## Kendala
- **Kendala yang saya hadapi:** Error disaat menuliskan objeck terutama pada saat menuliskan untuk `semuaUrutMulai`, terjadi kesalahan penulisan. Ketidaktahuan untuk menggunakan pasangan yang tepat seperti `getKode`, `getAset`, dan semacamnya.
- **Solusi yang saya terapkan:** Menggunakan extension Error Lens untuk mendeteksi ketidaktepatan dan menggunakan AI sebagai korektor kode.


## Penggunaan AI
- **Alat yang dipakai:** DeepSeek
- **Bagian yang dibantu AI:**
    - Penulisan syntax dan juga recall terkait method di `JadwalPeminjaman` di keempat method.
    - Penjelasan terkait pengetahuan umum yang ada. 
- **Prompt utama:**
    - "Penjelasan menggunakan 3 metode, penjelasan secara formal, sederhana, analogi. Nanti misalkan list itu bagimana, pakai analogi, dan contoh kodenya dalam konteks analogi. Setelah menjelaskan anda perintah saya mengerjakan bagian mana dlu sesuai minggu-07.md di docs, lalu nanti anda cek dan koreksi kode saya."
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:**
Penggunaan "Kartu As" saya mendesain supaya AI bisa memberikan rincian kode yang lengkap dalam 1 method namun saya tidak menggunakannya sampai akhir dan lebih memilih menggunakan clue sebagai sarana belajar dan mencoba.
- **Satu hal yang saya pahami lebih baik sekarang:**
Pengetahuan akan sistem irisan setengah-terbuka dengan sistem `baru.getMulai().isBefore(lama.getSelesai()) && lama.getMulai.isBefore(baru.getSelesai()).

## Struktur data internal 
- **List saja, atau tambah Map/Set?:**
Struktur data internal menyimpan di `List<Peminjaman>` dengan operasi menambah, meniterasi, mengurutkan, dan menghapus. Struktur data internal juga menggunakan Map, namun tidak disimpan sebagai field. Digunakan oleh method `perAset()` untuk membuat LinkedHashMap
baru setiap dipanggil untuk mengelompokkan kode aset. 