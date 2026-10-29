# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya membuat melengkapi subclass `Ruang`, `Laptop`, dan `AlatLab` yang mewarisi Aset. Adanya penambahan super di dalam konstruktor dan penambahan field baru didalam subclass lalu memvalidasi field miliknya sendiri didalam kontraktor dengan penambahan kondisi. Setiap subclass juga meng-override getJenis().

## Keputusan desain
- Beberapa field saya terapkan di subclass seperti `kapasitas` di subclass `Ruang` sebagai pelengkap subclass dengan kata kunci `Ruang` karena secara logika, Ruang mempunyai kapasitas, namun apakah `kapasitas` dibutuhkan di dalam `AlatLab`? Jawabannya tidak. Maka penerapannya Hanya ada di `Ruang`, begitu juga dengan yang lain, contohnya lagi Ruang tidak memiliki tingkatRisiko.
- Penerapan desain seperti field tadi itu memiliki logika, kapan kita harus pakai subclass atau field, logikanya gini; Apakah X adalah Y atau X mempunyai Y. Contoh: Ruang adalah Aset (extends), Ruang mempunyai kapasitas (field). Logika adalah atau mempunyai inilah yang menjadikan indikasi bahwa "adalah" merujuk pada subclass/anak dari induk, sedangkan "mempunyai" adalah field yang dibutuhkan di dalam subclass untuk melengkapi karakteristiknya. 
- Desain Override digunakan untuk mengganti output yang disediakan induk dan dapat membentuknya (di subclass) dengan lebih spesifik sesuai nama subclass.

## Kendala
- Kesulitan yang daya hadapi adalah bagaimana getJenis() itu diperlakukan, ketidaktahuan akan apa yang akan dioverride menjadi masalah yang paling membingungkan bagi saya.
- Solusi yang saya terapkan adalah Saya bertanya kepada Claude dengan prompt yang tersedia pada bagian `Prompt utama` lalu menemukan Claude menuliskan kode yang membahas konsep-konsep yang mana diterapkan pada minggu03 namun dengan perumpamaan class Hewan.

## Penggunaan AI
- **Alat yang dipakai:** Claude
<br>
- **Bagian yang dibantu AI:** Pemahaman kembali dan penjelasan konsep terkait Inheritance dan pemahaman terkait setter, penanganan field spesial pada bagian `TingkatRisiko` konstruktor, getter/setter, extends, super, override, komposisi dan koreksi error.
<br>
- **Prompt utama:** 
    - Saya menemukan bahwa ada override getJenis() padahal saya tidak melihat ada constructor Jenis dan bahkan setelah get jenis apa yang akan saya return?.
    - Parameter dan field TingkatRisiko, ini perlu dibahas juga karena gambaran saya adalah seperti Kondisi kondisi = Kondisi.BAIK; tapi value baik di TingkatRisiko tidak ditentukan, nah bagaimana cara saya menanggapinya dan sebenarnya gimana sih kita masukkan ke persamaan if & get nya?.
<br>
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Tidak ada, karena tidak ada penawaran dari AI ataupun tindakan dari AI yang mengambil alih tindakan Saya, untuk menulis kode secara manual dan pemahaman yang tidak langsung menyelesaikan masalah, namun dibungkus dengan perumpamaan lain.

<br>

- **Satu hal yang saya pahami lebih baik sekarang:** Override adalah bentuk tindakan subclass untuk mengganti perilaku yang sudah diterapkan di method induk. 

## Penugasan Tambahan
- **Mana yang seharusnya field di induk dan mana di subclass.**
Jika semua subclass mempunyai field X, maka seharusnya diletakkan di Induk, berbeda dengan field di subclass, mereka berdiri sendiri di subclass masing-masing dan tidak dibutuhkan di subclass lain.
- **Satu contoh di sistem ini di mana inheritance kurang tepat dibanding komposisi.**
Jikalau `tingkatRisiko` dibuat sebagai subclass/ `extends`, maka secara logika hasilnya akan seperti `AlatLab extends TingkatRisiko`. Namun penulisan tersebut salah karena `TingkatRisiko` termasuk enum yang mana tidak logis dijadikan sebagai extends dan lebih cocok dijadikan field/komposisi (`private TingkatRisiko tingkatRisiko`). 