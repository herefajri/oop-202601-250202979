# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya menulis method untuk menghitung denda  pada `hitungDenda`  (Overriding) terkait `hariTerlambat` pada `Ruang.java`, `Laptop.java`, dan `AlatLab.java`. Perhitungan dilakukan dengan sistem `hariTerlambat` dikali dengan multiplier denda dikali `varian.aktif(). dendaPerHari` yang terkait dengan aturan bisnis (denda) sesuai nomor terakhir NIM. Pengerjaan pencarian asset dengan 2 cara, yaitu; menggunakan `kata` dan juga `jenis` (Overloading), dengan sistem kata tidak membedakan huruf besar atau kecil, karena  pada akhirnya akan di ubah menjadi kecil dengan `.toLowerCase()`.

## Keputusan desain
Desain syntax yang saya gunakan pada KatalogAset.java pada enkapsulasi
```
if (aset.getNama().toLowerCase().contains(kata.toLowerCase()) && aset.getJenis() == jenis) {
    hasil.add(aset);
}
```
Walau bisa disederhanakan, namun saya tetap menuliskannya demikian karena lebih mudah dimengerti. 


## Kendala
- Kendala: Bagaimana cara menulis syntax yang tepat untuk KatalogAset.java dan juga beberapa bagian yang dioverride yang mana secara penulisan berbeda dari override yang ada di `minggu03`.
- Solusi yang diterapkan: Saya menggunakan AI sebagai partner saya dalam memproyeksikan kode yang memiliki tingkat kemiripan sekitar 80% dan juga dengan konteks berbeda, menjadikannya panduan untuk bertanya dan juga menginspirasi penulisan syntax yang benar.

## Penggunaan AI
- **Alat yang dipakai:** Claude
- **Bagian yang dibantu AI:**
    - Penjelasan kode dan cara kerja kode dengan konteks yang berbeda atau bahasa lainnya permisalan.
    - Mengoreksi kode saya, namun hanya mencontohkan kembali dengan analogi lain. 
- **Prompt utama:**
    - Oke cukup paham, jadi gambaraan detailnya buat minggu ini apa, baik dari sisi ruang, laptop, asetlab, hingga katalogaset?
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:**
    - Tidak ada, AI hanya membantu saya mengoreksi bagian mana yang kurang benar atau bahkan salah, mengonfirmasi pernyataan saya, dan juga membantu menerangkan kode namun dengan konteks yang berbeda. 
- **Satu hal yang saya pahami lebih baik sekarang:**
Overriding itu method yang ada di subclass dan bertujuan untuk menimpa versi milik class, sedangkan overloading itu beberapa method dengan nama sama dengan daftar parameter yang berbeda (parameter disini yang layaknya `cari(kata, dan jenis)`).
