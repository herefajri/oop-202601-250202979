# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Saya mengerjakan tiga gaya pengkodean, seperti; Prosedural, OOP, dan Functional. Ketiganya memiliki karakteristik dan tindakan yang berbeda dalam mengambil objek atau suatu variabel. Di minggu-01, Saya belajar mengenai perbedaan dalam kode mengenai metode penulisan kode Prosedural, OOP, dan Functional.

## Keputusan desain
Saya memutuskan sapaan berbentuk Hello Aset-Pinjam, saya <nama> (<nim>) karena penulisan yang sederhana dan sudah memuat 3 hal wajib (Aset-Pinjam, nama, nim). Bentuk ini juga berhasil lolos pengujian di ```/scripts/uji.ps1```. Terkhusus OOP dan Fungsional, Saya menyimpan nama dan nim di private field untuk OOP dan mengunci nim di dalam lambda untuk Functional supaya bisa dipakai berulang untuk nama yang berbeda atau bahasa sederhananya; nama boleh berbeda tapi nim harus dikunci 1 nilai. 

## Kendala
- Kendala: Adaptasi terkait syntax baru dikarenakan sebelumnya lebih terbiasa menggunakan Python dan belum pernah menggunakan Java. Pemahaman atas instalisasi maven dan mencari tahu mana yang seharusnya dikerjakan juga menjadi bagian kendala awal Saya.
- Solusi: Saya menggunakan AI seperti Muse Spark untuk melatih Saya langsung membiasakan diri dengan OOP Java dengan membandingkannya dengan syntax Python yang lebih familiar bagi Saya. Serta saya menggunakan ChatGPT sebagai sarana alat tutorial instalasi maven dan juga memberitahukan apa yang harus saya kerjakan dan diubah. 

## Penggunaan AI
- **Alat yang dipakai:** ChatGPT dan Muse Spark
- **Bagian yang dibantu AI:**
1. Pemahaman terkait Paradigma prosedural, OOP, dan functional.
2. Pemahaman atas pengerjaan yang perlu dilakukan untuk Minggu-01
3. Pemahaman atas terjadinya error pada penulisan dan output di VSCode. 
4. Pemahaman syntax dan penulisan serta rekomendasi web belajar. 
**Disclaimer :** Penulisan code di dalam file (.java) untuk ```/minggu01/``` bukan hasil generate, melainkan hasil penulisan mandiri yang terinspirasi dari hasil latihan bersama AI. 

- **Prompt utama:**
1. Bisa bantu saya memahami apa isi dari yang sudah tersedia (code) dengan penjelasan sederhana dan perbandingan dengan kode Python dan sebenarnya adakah kode yang seharusnya dihapus serta adakan link dari W3Schools yang bisa membantu saya menyelesaikan permasalahan ini.
2. Bagaimana cara menginstall maven?

- **Yang saya ubah atau tolak dari saran AI, dan alasannya:**
Yang saya tolak dari AI adalah tawarannya untuk menyelesaikan permasalahan kode yang saya alami sebelumnya, dengan alasan mengurangi ketergantungan pada AI dan memaksimalkan pemahaman lewat error dan mengetik secara manual. 

- **Satu hal yang saya pahami lebih baik sekarang:**
Pemahaman lebih baik mengenai gaya peng-kodean Prosedural, OOP, dan Functional dan mengenali juga bahwa syntax bisa berbeda namun logika tetap sama, bahkan dengan Python sekalipun. 

## Kelebihan dan satu keterbatasan tiap gaya untuk sistem peminjaman aset.
**1. Prosedural**
- Kelebihan: Secara penulisan sederhana dan mudah dipahami.
- Kekurangan: Tidak cocok untuk sistem kompleks, besar, dan sulitnya diperbaiki/dirawat bila ada error.

**2. OOP (Object Oriented Programming)**
- Kelebihan: Memodelkan object ke dalam class dan mengisinya dengan atribute dan method, sehingga bisa langsung dipanggil tanpa perlu menulis semua kode nya 1 per 1 dan bisa digunakan jika objectnya diganti nama sekalipun. 
- Kekurangan: Bisa terlalu rumit bila semua hal ditumpuk dalam satu class, dan perlunya membangun class, object, atribute, dan method yang cukup memakan waktu diawal.

**3. Functional**
- Kelebihan: Kode ringkas dan mudah di debug, sangat cocok untuk sistem pemrosesan data.
- Kekurangan: Memerlukan pemahaman tingkat lanjut untuk memahami tipe data dan syntax yang lebih jauh.