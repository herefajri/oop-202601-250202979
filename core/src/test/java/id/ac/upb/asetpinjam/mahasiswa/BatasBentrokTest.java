package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.peminjam;
import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static id.ac.upb.asetpinjam.TestSupport.ruang;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import org.junit.jupiter.api.Tag;;

/**
 * FOLDER INI MILIK ANDA. Tulis tes Anda sendiri di sini (minggu 7 dan seterusnya).
 *
 * <p>Tes dosen sengaja tidak menentukan: apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama
 * bentrok? Putuskan, catat alasannya di docs/asumsi.md, lalu tuliskan tesnya di sini.
 * Hapus @Disabled setelah Anda mengisinya.
 *
 * <p>Syarat minggu 10: folder ini memuat minimal 8 tes (tidak termasuk contoh bawaan ini).
 */
@Tag("week7")
class BatasBentrokTest {

    @Test //("Isi dengan keputusan Anda tentang batas waktu bentrok")
    void selesaiSamaDenganMulai() {
        // TODO: buat dua peminjaman pada aset yang sama, satu selesai tepat saat yang lain mulai,
        // lalu nyatakan hasil yang Anda putuskan dengan assertThat(...).
        JadwalPeminjaman jadwal = new JadwalPeminjaman(1);
        var p = peminjam("P1");
        jadwal.tambah(pinjam("1", p, ruang("R-1"), 9, 11));
        var baru = pinjam("2", p, ruang("R-1"), 11, 13);
        boolean hasil = jadwal.bentrok(baru);

        assertThat(hasil).isFalse();
        
    }
}
