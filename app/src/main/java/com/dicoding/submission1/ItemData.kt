package com.dicoding.submission1

object ItemData {
    private val names = arrayOf(
        "Berkemah",
        "Nonton Bioskop",
        "Makan",
        "Rekreasi",
        "Meditasi",
        "Membaca",
        "Santai",
        "Renang",
        "Jalan-jalan",
        "Nonton Film"
    )

    private val details = arrayOf(
        """Berkemah adalah sebuah kegiatan rekreasi di luar ruangan. Kegiatan ini umumnya dilakukan untuk beristirahat dari ramainya perkotaan, atau dari keramaian secara umum, untuk menikmati keindahan alam. Berkemah biasanya dilakukan dengan menginap di lokasi perkemahan, dengan menggunakan tenda, di bangunan primitif, atau tanpa atap sama sekali.

Menurut Kamus Besar Bahasa Indonesia, kemah (kata benda) adalah tempat tinggal darurat, biasanya berupa tenda yang ujungnya hampir menyentuh tanah dibuat dari kain terpal dan sebagainya. perkemahan (kata benda) 1 hal berkemah; 2 himpunan kemah (pramuka, pasukan, dsb); tempat berkemah.

Berkemah sebagai aktivitas rekreasi mulai populer pada awal abad ke-20. Kegiatan ini juga umumnya disertai dengan kegiatan rekreasi luar ruangan lainnya, seperti mendaki gunung, berenang, memancing, dan bersepeda gunung.""".trimIndent(),
        "Bioskop (Belanda: bioscoop dari bahasa Yunani βιος, bios (yang artinya hidup) dan σκοπος, skopos (yang artinya \"melihat\") adalah tempat untuk menonton pertunjukan film dengan menggunakan layar lebar. Gambar film diproyeksikan ke layar menggunakan proyektor. Padanan kata dari bioskop yaitu gambar hidup.",
        "Makan adalah kegiatan konsumsi makanan biasanya untuk menyediakan energi bagi organisme heterotrof dan memungkinkan pertumbuhan. Hewan dan heterotrof lainnya harus makan untuk bertahan hidup karnivora memakan hewan lain, herbivora memakan tumbuhan, omnivora mengonsumsi keduanya baik tumbuhan, dan hewan, dan detritivora memakan detritus.",
        """Rekreasi (bahasa Latin, re-creare) secara harfiah berarti 'membuat ulang', adalah kegiatan yang dilakukan untuk penyegaran kembali jasmani dan rohani seseorang. Hal ini adalah sebuah aktivitas yang dilakukan seseorang di samping bekerja. Kegiatan yang umum dilakukan untuk rekreasi adalah pariwisata, olahraga, bermain, dan hobi. Kegiatan rekreasi umumnya dilakukan pada akhir pekan.
        
Rekreasi merupakan aktivitas yang dilakukan oleh orang-orang secara sengaja sebagai kesenangan atau untuk kepuasan, umumnya dalam waktu senggang. Rekreasi memiliki banyak bentuk aktivitas di mana pun tergantung pada pilihan individual. Beberapa rekreasi bersifat pasif seperti menonton televisi atau aktif seperti olahraga.

Sejak tahun 1940-an, rekreasi telah menjadi unsur penting dalam kehidupan modern. Pendapatan, kondisi pekerjaan dan perkembangan transportasi yang semakin baik telah memberi orang lebih banyak uang, waktu dan pergerakan yang lebih tinggi untuk melakukan rekreasi. Pada saat ini, rekreasi telah menjadi industri besar. Rekreasi umumnya berdampak pada rasa senang tingkat kesehatan fisik dan mental manusia. Rumah sakit pun sering mengadakan aktivitas rekreasi terapi untuk pasien.""".trimIndent(),
        """Semadi atau meditasi adalah praktik relaksasi yang melibatkan pelepasan pikiran dari semua hal yang menarik, membebani, maupun mencemaskan dalam hidup kita sehari-hari. Makna harfiah meditasi adalah kegiatan mengunyah-unyah atau membolak-balik dalam pikiran, memikirkan, merenungkan. Arti definisinya, meditasi adalah kegiatan mental terstruktur, dilakukan selama jangka waktu tertentu, untuk menganalisis, menarik kesimpulan, dan mengambil langkah-langkah lebih lanjut untuk menyikapi, menentukan tindakan atau penyelesaian masalah pribadi, hidup, dan perilaku.
        
Dengan kata lain, meditasi melepaskan kita dari penderitaan pemikiran baik dan buruk yang sangat subjektif yang secara proporsional berhubungan langsung dengan kelekatan kita terhadap pikiran dan penilaian tertentu. Kita mulai paham bahwa hidup merupakan serangkaian pemikiran, penilaian, dan pelepasan subjektif yang tiada habisnya yang secara intuitif mulai kita lepaskan. Dalam keadaan pikiran yang bebas dari aktivitas berpikir, ternyata manusia tidak mati, tidak juga pingsan, dan tetap sadar.

Guru terbaik untuk meditasi adalah pengalaman. Tidak ada guru, seminar, atau buku-buku meditasi yang dapat mengajarkan secara pasti bagaimana seharusnya kita melakukan hidup bermeditasi.""".trimIndent(),
        """Membaca merupakan kegiatan melihat tulisan bacaan dan proses memahami isi teks dengan bersuara atau dalam hati. Membaca adalah mengungkapkan suatu imajinasi terhadap suatu pembaca yang disukai khalayak ramai dan juga dimengerti oleh seseorang yang dicintai. Kegiatan membaca meliputi membaca nyaring dan membaca dalam hati. Membaca nyaring adalah kegiatan membaca yang dilakukan dengan cara membaca keras di depan umum. Sedangkan kegiatan membaca dalam hati adalah kegiatan membaca dengan seksama yang dilakukan untuk mengerti dan memahami maksud atau tujuan penulis dalam media tertulis.
        
Membaca menjadi salah satu jenis kemampuan berbahasa melalui tulisan yang bersifat reseptif karena dengan membaca seseorang akan memperoleh informasi, ilmu pengetahuan, dan pengalaman-pengalaman baru yang belum pernah diketahui sebelumnya. Semua yang diperoleh melalui bacaan itu akan membuat orang tersebut mampu mempertinggi daya pikirannya, mempertajam pandangannya, dan memperluas wawasannya. Hal tersebut berdampak pada kemampuan dalam menyelesaikan sekolah dan menjalani hidup lebih mudah.

Membaca dapat diartikan juga sebagai proses individu memperoleh makna dari cetakan. Kegiatan membaca bukan sekedar aktivitas yang bersifat pasif dan respektif saja, melainkan menghendaki pembaca untuk aktif berpikir ketika sedang melihat kata-kata yang terdapat di dalam buku. Di dalam konteks belajar-mengajar seperti di sekolah ataupun di kampus, membaca dipandang sebagai proses menuju pemahaman sebagai produk yang dapat diukur. Ada banyak cara yang distandarkan untuk mengukur kemampuan membaca individu. Sejumlah teknik pengukuran kemampuan membaca yang sering dipergunakan antara lain adalah dengan mempergunakan bentuk benar-salah, melengkapi kalimat, pilihan ganda, pembuatan ringkasan atau rangkuman, test,test-C, dan lain-lain.""".trimIndent(),
        """Santai atau senggang sering ditakrifkan sebagai kualiti pengalaman atau sebagai masa lapang. Masa lapang ialah masa yang dihabiskan bukan untuk perniagaan, kerja, mencari pekerjaan, kerja rumah, dan pendidikan, serta aktiviti yang diperlukan seperti makan dan tidur. Dari perspektif penyelidikan, pendekatan ini mempunyai kelebihan yang boleh diukur dan setanding dari masa ke masa dan tempat.
        
Santai sebagai pengalaman biasanya menekankan dimensi kebebasan dan pilihan yang dirasakan. Ia dilakukan untuk "kepentingan sendiri", untuk kualiti pengalaman dan penglibatannya. Definisi klasik lain termasuk Thorsten Veblen (1899) "penggunaan masa yang tidak produktif." Disiplin yang berbeza mempunyai definisi yang mencerminkan isu-isu biasa mereka: contohnya, sosiologi mengenai kekuatan sosial dan konteks dan psikologi keadaan mental dan emosi.""".trimIndent(),
        """Renang adalah gerakan berpindah tempat secara teratur di air dengan cepat menggunakan tangan dan kaki. Gaya renang yang diperlombakan adalah gaya bebas, gaya kupu-kupu, gaya punggung dan gaya dada. Perenang yang memenangkan lomba renang adalah perenang yang menyelesaikan jarak lintasan tercepat. Pemenang babak penyisihan maju ke babak semifinal, dan pemenang semifinal maju ke babak final.
        
Bersama-sama dengan loncat indah, renang indah, renang perairan terbuka, dan polo air, peraturan perlombaan berenang ditetapkan oleh badan dunia bernama Federasi Renang Internasional (FINA). Persatuan Renang Seluruh Indonesia (PRSI) adalah induk organisasi cabang olahraga renang di Indonesia.""".trimIndent(),
        "Perjalanan adalah pergerakan orang antar lokasi geografi yang jauh. Perjalanan dapat dilakukan dengan kaki, sepeda, mobil, kereta, perahu, bus, pesawat, kapal atau alat lainnya, dengan atau tanpa bagasi. Perjalanan juga dapat meliputi persinggahan yang relatif singkat antar pergerakan berkelanjutan.",
        """Film, juga dikenal sebagai movie, gambar hidup, film teater atau foto bergerak, merupakan serangkaian gambar diam, yang ketika ditampilkan pada layar akan menciptakan ilusi gambar bergerak karena efek fenomena phi. Ilusi optik ini memaksa penonton untuk melihat gerakan berkelanjutan antar objek yang berbeda secara cepat dan berturut-turut. Proses pembuatan film merupakan gabungan dari seni dan industri. Sebuah film dapat dibuat dengan memotret adegan sungguhan dengan kamera film; memotret gambar atau model "miniatur" menggunakan teknik animasi tradisional; dengan CGI dan animasi komputer; atau dengan kombinasi beberapa teknik yang ada dan efek visual lainnya.
        
Kata "sinema", yang merupakan kependekan dari sinematografi, sering digunakan untuk merujuk pada industri film, pembuatan film dan seni pembuatan film. Definisi sinema zaman sekarang merupakan seni dalam (simulasi) pengalaman untuk mengkomunikasikan ide, cerita, tampilan, sudut pandang, rasa, keindahan atau suasana dengan cara direkam dan gambar bergerak yang diprogram bersamaan dengan penggerak sensorik lainnya.""".trimIndent()
    )

    private val images = intArrayOf(
        R.drawable.camping,
        R.drawable.cinema,
        R.drawable.eating,
        R.drawable.holidays,
        R.drawable.meditation,
        R.drawable.read_book,
        R.drawable.relax,
        R.drawable.swim,
        R.drawable.travel,
        R.drawable.watching_a_movie
    )

    val listData: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in names.indices) {
                val item = Item()
                item.name = names[position]
                item.detail = details[position]
                item.photo = images[position]
                list.add(item)
            }
            return list
        }
}