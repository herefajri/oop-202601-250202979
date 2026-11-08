# Catatan Minggu 5: Abstraction

## Yang saya kerjakan
Penerapan abstraksi pada `Aset.java` dan juga pengembalian atau return `bisaDipinjam()` = true dengan syarat: status = TERSEDIA dan kondisi != RUSAK_BERAT. Penetapan `aset.hitungDenda(hariTerlambat)` sesuai dengan perintah di komentar pada `DendaFlat.java`. Penulisan rumus untuk `DendaProgresif.java` untuk dengan sistem setiap ada pertambahan hari keterlambatan, naik 10% untuk konsentrasi dendanya. Lalu yang terakhir adalah pencatatan pada `asumsi.md` terkait rumus denda progresif yang telah dituliskan pada kode.

## Keputusan desain
- Penyesuaian aturan desain pada `DendaFlat.java` dimana hanya bisa dipinjam bila status TERSEDIA dan kondisi TIDAK RUSAK_BERAT, menyesuaikan perintah pada komentar di file.java terkait.
- Desain rumus untuk aturan denda progresif dengan sistem rumus `DendaFlat * ( 1 + 0.1 * hariTerlambat)`. Saya menggunakan rumus ini karena sesuai dengan kaidah pada `minggu-05.md` dan juga sesuai dengan kata progresif atau berproses.  

## Kendala
- Kesulitan:
    - Memahami penulisan syntax baru, karena ada konsep abstraksi yang belum saya pelajari.
    - Menentukan rumus yang cocok dengan sistem Aset-Pinjam.
- Solusi yang saya terima:
    - Memberikan AI perintah untuk memberikan clue sekaligus pengetahuan umum untuk memudahkan saya memahami dan merangkai catatan.
    - Menjadikan AI sebagai mentor dan validator kode, catatan, dan sebagainya untuk mengoreksi kesalahan saya.

## Penggunaan AI
- **Alat yang dipakai:** GLM, Claude, dan ChatGPT
- **Bagian yang dibantu AI:** 
    - Contoh syntax dengan konteks yang berbeda untuk memahami penulisan code yang benar bagaimana.
    - Mencari rumus yang cocok dengan tidak hanya menerima tapi juga menguji langsung dengan cara memperhitungkan secara tulis tangan.
    - Pengecekkan apakah `asumsi.md` sudah sesuai kaidah pengerjaan atau belum.
    - Pengecekkan code dan juga penilaian.
- **Prompt utama:**
    - Bisa berikan clue edukatif untuk pengerjaan minggu05 dan pengetahuan umumnya.
    - Bisa bimbing saya untuk memahami pengetahuan umum yang ada disini, dan bimbing saya untuk melengkapi isinya? ajarkan saya juga logikanya dan juga fungsi2 yang mana belum dibahas di minggu-minggu sebelumnya.
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:**
    Saya melakukan penolakan pada penawaran pengubahan kode secara langsung dan juga penawaran penyelesaian isi catatan, saya memilih menggunakan sistem recall terbimbing dengan AI demi memahami ulang apa saja yang saya buat. 
- **Satu hal yang saya pahami lebih baik sekarang:** 
Abstract class itu layaknya class paada umumnya, punya method, field, kosntruktor, inheritance, dan lainya. Namun Asbtract class tidak bisa membuat objek nyata dari sebuah class atau tidak boleh menginstansiasi langsung, misal `new Aset(..)` itu tidak dibisa. Class ini berfokus pada fungsi dan juga apa yang di produksi tanpa perlu pengguna mengetahui bagaimana proses atau cara kerjanya. 