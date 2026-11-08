# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## A-02: Rumus Progresif
- Pertanyaan: Bagaimana sistem denda progresif?
- Keputusan: Denda Progresif diharuskan lebih besar daripada `dendaFlat`. Saya menggunakan rumus ( Denda Flat x ( 1 + 0.1 * hari keterlambatan)) menjadikannya denda 10%. 
- Alasan: Rumus ini cukup sederhana dan memenuhi syarat dimana semakin besar keterlambatan, denda yang dibayarkan juga semaki besar.
- Dampak ke kode: `DendaProgresif.hitung()`, ambil contoh saja laptop dengan NIM saya "9" bertarif 6000. 
    - Denda Flat = hariTerlambat * 2 * Varian.aktif().denda... (mengambil denda sesuai angka terakhir nim yaitu 6000).
    - Kita ambil hari terlambatnya adalah 1 hari, Denda Flat = 1 * 2 * 6000 => 12000.
    - Maka Denda Progresif = 12000 * (1 + 0,1) => (12000 * ( 1 + 0.1 * 1)) => 13.200 (bertambah 10%.).
Dengan demikian, berdampak ke kode dan juga output. 
- Tes yang membuktikan: Minggu05AbstraksiTest.java