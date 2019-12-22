package com.example.tempatwisatadilombok;
import java.util.ArrayList;

public class DataDestinasi {
    private static String[] Nama = {
            "Kuta Mandalika",
            "Pantai Mawun",
            "Tanjung Aan",
            "Bukit Merese",
            "Gili Trawangan",
            "Gili Meno",
            "Pantai Senggigi",
            "Gunung Rinjani",
            "Bukit Pergasingan",
            "Pantai Pink"
    };

    private static String[] Lokasi = {
            "Lombok Tengah",
            "Lombok Tengah",
            "Lombok Tengah",
            "Lombok Tengah",
            "Lombok Barat",
            "Lombok Barat",
            "Lombok barat",
            "Lombok Utara",
            "Lombok Utara",
            "Lombok Timur"
    };

    private static int[] Foto = {
            R.drawable.kuta_mandalika,
            R.drawable.pantai_mawun,
            R.drawable.tanjung_aan,
            R.drawable.bukit_merese,
            R.drawable.gili_trawangan,
            R.drawable.gili_meno,
            R.drawable.pantai_senggigi,
            R.drawable.gunung_rinjani,
            R.drawable.bukit_pergasingan,
            R.drawable.pantai_pink
    };

    private static String[] Deskripsi = {
            "Mandalika yang luasnya lebih dari 1.000 hektare ini juga menyimpan banyak pesona lain. Coba perhatikan, tak jauh dari pusat kawasan Mandalika, terdapat Desa Adat Sade dan Desa Adat Ende. Desa ini merupakan desa khas masyarakat Sasak. Di sana, Anda bisa mengenal lebih jauh keberagaman cara hidup penghuni asli Pulau Lombok.",
            "Pantai Mawun sebenarnya memiliki pesona yang cukup memadai untuk menjadi tempat wisata pantai. Pantai di Pulau Lombok ini merupakan bagian dari teluk. Garis pantainya berbentuk seperti tapal kuda, dengan dua bukit yang berada di sebelah Timur dan Barat. Pantainya juga berpasir putih, serta bertekstur lembut di pantai bagian tengah. Sedangkan di bagian sisi Barat, pasirnya bertekstur lebih kasar dan bercampur dengan pecahan karang.",
            "Pantai Tanjung Aan hanya berjarak sekitar satu jam perjalanan dengan kendaraan bermotor dari Bandara Internasional Lombok. Saran saya, segeralah datang ke sini sebelum diramaikan turis, karena Mandalika baru saja diresmikan jadi Kawasan Ekonomi Khusus (KEK) oleh pemerintahan Presiden Joko Widodo.",
            "Bukit Merese atau warga setempat menyebutnya Merisik yang artinya bukit gundul. Disebut gundul karena tidak ditemui pepohonan di atasnya, hanya satu buah pohon di ujung barat bukit yang oleh para pengunjung sering disebut Pohon Galau. Menaiki bukit ini cukup mudah, dari tempat parkir kendaraan kamu tinggal jalan kaki sekitar sepuluh menit untuk sampai ke atas. Bagian atas bukit sangat luas dan terbagi-bagi menjadi beberapa bagian. Masing-masing bagian menawarkan view yang berbeda-beda.",
            "Gili Trawangan adalah yang terbesar dari ketiga pulau kecil atau gili yang terdapat di sebelah barat laut Lombok. Trawangan juga satu-satunya gili yang ketinggiannya di atas permukaan laut cukup signifikan. Dengan panjang 3 km dan lebar 2 km, Trawangan berpopulasi sekitar 800 jiwa. Di antara ketiga gili tersebut, Trawangan memiliki fasilitas untuk wisatawan yang paling beragam; kedai \"Tîr na Nôg\" mengklaim bahwa Trawangan adalah pulau terkecil di dunia yang ada bar Irlandia-nya. Bagian paling padat penduduk adalah sebelah timur pulau ini.",
            "Gili Meno adalah salah satu dari tiga pulau kecil, selain Gili Trawangan dan Gili Air, yang menjadi kawasan wisata bahari. Tempat ini dapat dicapai dari Kota Mataram sekitar 45 menit berkendaraan darat dengan perjalanan melewati Pantai Senggigi yang berlatarkan pemandangan pantai yang menakjubkan serta hutan lindung. Di sini terdapat taman burung yang mempunyai koleksi burung-burung langka dari Indonesia dan mancanegara. Pasirnya putih dan masih alami. Di Gili Meno kendaraan bermotor sangat dibatasi, demikian pula penggunaan listrik. Alternatif kendaraan hanya terdapat sepeda dan Cimodo.",
            "Lokasi Pantai Senggigi strategis dan termasuk dalam spot wisata yang paling ramai di Lombok. Oleh sebab itu, daerah sekitar Pantai Senggigi mendapatkan perhatian khusus dari pemerintah setempat, khususnya dalam bidang pembangunan. Terdapat beberapa hotel dan penginapan dengan pilihan harga yang dapat disesuaikan dengan budget. Ada juga beberapa fasilitas lainnya seperti tempat olahraga, berbelanja, kuliner dan hang out dan lain sebagainya.",
            "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 m dpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur.",
            "Bukit Pergasingan Lombok dikelilingi megahnya Gunung Rinjani. Pemandangannya masih sangat hijau ditambah dengan petak-petak sawah warga Desa Sembalun yang terlihat berwarna-warni jika dilihat dari atas ketinggian. Alamnya yang masih hijau dan asri tentu memiliki udara yang sejuk khas pegunungan.",
            "Pantai Pink merupakan pantai dengan pasir putih yang berwarna kemerah-merahan karena perpaduan antara warna putih dengan warna merah sehingga pasir di pantai Pink mirip dengan warna merah muda (Pink), sebab itulah pantai ini dinamakan pantai Pink. Pantai Pink berlokasi di Desa Sekaroh, Kecamatan Jerowaru, Kabupaten Lombok Timur, berjarak 85,7 km dari Ibu Kota Propinsi atau sekitar 2 jam 14 menit jika menggunakan kendaraan roda empat."
    };

    public static ArrayList<Destinasi> getListData()
    {
        ArrayList<Destinasi> list = new ArrayList<>();
        for (int i=0;i<Nama.length;i++){
            Destinasi destinasi = new Destinasi();
            destinasi.setNama(Nama[i]);
            destinasi.setLokasi(Lokasi[i]);
            destinasi.setDeskripsi(Deskripsi[i]);
            destinasi.setFoto(Foto[i]);
            list.add(destinasi);
        }
        return list;
    }

}
