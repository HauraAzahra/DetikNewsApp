package com.haura.detiknewsapp

//Ini modelnya
// data class = getter setter
// Fungsi data class buat nyimpen dan manggil data
data class news(
        var title: String,
        var desc: String,
        var photo: Int)

//object = data class ini data nya di isi disini
//inisialisasi data
//pengisian data ke model
// dia kayak bikin suatu objek baru
object NewsModel {
    val newslists = listOf<news>(
        news("Fakta-fakta Munculnya Tugu Logam Misterius di Penjuru Dunia",
            "detikNews | 1 Jam Yang Lalu",
            R.drawable.img_news1),

        news("Ini Alasan Pandemi Jadi Momen Tepat Punya Asuransi Unit Link",
            "detikNews | 1 Jam Yang Lalu",
            R.drawable.img_news2),

        news("Ditanya soal Pengikut Habib Rizieq Tewas di Tol, Ini Kata Moeldoko",
            "detikNews | 2 Jam Yang Lalu",
            R.drawable.img_news3),

        news("Distribusi Logistik ke 3 Dusun Ini Harus Memutar 60 Km Lewat Daerah Lain",
            "detikNews | 3 Jam Yang Lalu",
            R.drawable.img_news4),

        news("Polri Buka Kemungkinan Jemput Paksa Habib Rizieq Jika Tak Penuhi Panggilan",
            "detikNews | 4 Jam Yang Lalu",
            R.drawable.img_news5),

        news("Kemensetneg Pastikan Sertifikat Monas Atas Nama Pemerintah Pusat",
            "detikNews | 5 Jam Yang Lalu",
            R.drawable.img_news6),

        news("FPI Hendak ke RS Polri, Jemput Jenazah 6 Pengikut Habib Rizieq",
            "detikNews | 6 Jam Yang Lalu",
            R.drawable.img_news7),

        news("Sebut Tewasnya 6 Pengikut HRS Pelanggaran HAM, FPI Minta DPR Bentuk TPF",
            "detikNews | 7 Jam Yang Lalu",
            R.drawable.img_news8),

        news("Milenial Kulit Hitam Dominasi Pembelian Rumah di AS",
            "detikNews | Senin, 7 Desember 2020 12.53 WIB",
            R.drawable.img_news9)

    )
}
