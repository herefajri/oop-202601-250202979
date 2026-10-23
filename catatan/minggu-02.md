# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan
- Pengerjaan dilakukan di `core\src\main\java\id\ac\upb\asetpinjam` dengan dilakukannya pengubahan kode didalamnya. 
- Mengerjakan field private; kode, nama, status, dan kondisi dan pemberian nilai awal khusus pada status (`StatusAset.TERSEDIA`) dan kondisi (`Kondisi.BAIK`).
- Mengerjakan bagian `public Aset` pada bagian konstruktor dan mencoba memahami menggunaan `if` sebagai validator input, dan penggunaan `throw new IllegalArgumentException` sebagai penghenti method jika input tidak valid.
- Menggunakan standar penulisan OOP dengan contoh `this.nama` dan juga pemahaman akan **getter** dan **setter** secara sekilas.
- Menggunakan `this.` yang diikuti nama field untuk menyimpan nilai parameter. 
- Melengkapi setter pada `setNama()`, `setStatus()`, dan `setKondisi()` dengan menetapkan ketiadaan `setKode()` karena kode adalah identitas aset yang tidak boleh dirubah.

## Keputusan desain
- `kode` tidak diberi setter karena `kode` sendiri merupakan identitas aset layaknya identitas dan seharusnya diisi di konstruktor untuk tetap menjaga kode.
- `trim()` hanya digunakan sebagai validasi apakah suatu objek memiliki value. 
- Saya tidak menggunakan `toUpperCase()` terutama pada `kode` untuk menjaga keaslian identitas.
- Dalam setter; `this.nama = nama`, `this.status = status`, dan `this.kondisi = kondisi` baru dijalankan setelah input lolos. Andaikata input tidak sesuai dengan aturan yang dibangun oleh konstruktor `if` atau bisa dikatakan input salah, maka lempar exception denngan `throw` menghentikan method sebelum baris penyimpanan (`this.`). Kalau input sesuai maka value baru menimpa value lama. 


## Kendala
- Kendala: Memahami letak error dengan banyak percobaan dan sulitnya memahami apa maksud dari komen, docs/minggu-02, dan juga arahan AI.
- Solusi: Menggunakan AI sebagai instruktor atau dosen pengajar dengan metode belajar sembari praktik.

## Penggunaan AI
- **Alat yang dipakai:** ChatGPT & DeepSeek 

- **Bagian yang dibantu AI:**
1. Penjelasan Error.
2. Penjelasan akan syntax yang benar dengan contoh yang berbeda.
3. Memahami fungsi `getter` dan `setter`.


- **Prompt utama:**
    - Saya mau anda memberikan perumpamaan yang cocok dan mengajarkan syntax dan logika yang cocok, namun bukan dengan tujuan menyelesaikan tugas saya, tapi seperti memberikan penjelasan layaknya dosen yang membimbing mahasiswa saat maju (karena maju bukan karena dia bisa tapi karena agar dia bisa).
    - Coba buatkan layaknya sebuah buku atau halaman yang membahas apa aja yang sebenarnya dibahas di minggu02, dari minggu-02.md dan Aset.java.

- **Yang saya ubah atau tolak dari saran AI, dan alasannya:**
Saran output pada bagian `IllegalArgumentException` dengan alasan output yang saya gunakan lebih simpel dan sederhana, tidak memerlukan kalimat yang cukup panjang.

- **Satu hal yang saya pahami lebih baik sekarang:**
Penggunaan `throw new IllegalArgumentException` dengan cara kerjanya menggunakan kondisi if sebagai validator dan akan menjalankan kode diatas tadi jika input salah.

## Keputusan Normalisasi Kode
**Apakah kode dinormalisasi (trim, huruf besar)? Catat di asumsi bila ya.** Jawab: Tidak, saya tidak menormalisasi kode. `trim` digunakan untu memeriksa value atau nilai yang disimpan apakah kosong, hanya berisi spasi, atau mempunyai nilai didalamnya. Huruf juga tidak menggunakan huruf besar atau *UpperCase* (`.toUpperCase()`) dengan asalan bahwa `kode` seharusnya berisi nilai asli dan sebaiknya dipertahankan layaknya nilai input awal pada awalnya.

