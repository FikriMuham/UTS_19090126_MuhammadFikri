package com.example.smartphone.models

import com.example.smartphone.R

object SmartphoneData {

    private val hpName = arrayOf(
        "Redmi 10",
        "Redmi Note 10",
        "Redmi Note 10s",
        "Redmi Note 10 Pro",
        "Redmi 9T",

    )

    private val hpDesc = arrayOf(
        "Redmi 10 memiliki layar berukuran 6.5 inci yang sudah mampu menampilkan kualitas beresolusi FHD+ dengan refresh rate 90Hz dan teknologi AdaptiveSync, serta fitur Reading Mode 3.0 untuk melindungi mata.\n" +
                "Untuk ukuran hp terbaru 2021 di kelas entry, spesifikasi yang dibawa Redmi 10 cukup mengesankan. Salah satunya keberadaan quad kamera dengan kamera utama sebesar 50 MP yang didukung oleh kamera ultrawide dengan sudut 120 derajat, serta kamera makro 2 MP dan depth 2 MP.\n" +
                "Harga resmi di indonesia dimulai dari  1.999.000 untuk varian 4 GB/64 GB dan Rp 2.399.000 untuk varian 6 GB/128 GB.\n" +
                "\n" +
                "Deskripsi \n" +
                "Tahun rilis 2021\n" +
                "Mediatek Helio G88\n" +
                "Varian RAM/ROM 4/64 dan 6/128\n" +
                "Baterai 5000 mAh dengan pengisian daya 28W\n",
        "Salah satu fitur unggulan Redmi Note 10 sudah dibekali dengan layar berjenis Super AMOLED berukuran 6.43 inci beresolusi 1080 x 2400 piksel. Layar ini pun sudah dilapisi pelindung Corning Gorilla Glass 3. Ada empat kamera dibagian belakang yang terdiri dari kamera wide 48 MP, kamera ultrawide 8 MP, lalu kamera macro dan depth beresolusi 2 MP, dan kamera selfie yang memiliki resolusi 13 MP.\n" +
                "Harganya mulai dari yang 4/64 adalah 2.350.000 dan yang 6/128 adalah 4.442.359 di situs https://iprice.co.id/harga/xiaomi-redmi-note-10/\n" +
                "Deskripsi :\n" +
                "Tahun rilis 2021\n" +
                "Prosesor Snapdragon 678\n" +
                "Varian RAM/ROM 4/64 dan 6/128\n" +
                "Baterai besar berkapasitas 5000 mAh yang sudah mendukung fast charging 33W.\n",
        "Hp Xiaomi terbaru rilisan Mei 2021 ini  dibekali empat kamera belakang yang terdiri dari kamera utama 64 MP, kamera ultra-wide 8 MP (118 derajat), kamera macro 2 MP dan depth sensor 2 MP. Layarnya berukuran 6,43 inci berjenis Super AMOLED DotDisplay dengan tingkat resolusi FHD+.\n" +
                "Versi teranyar dari Redmi Note 10s dengan konfigurasi 6/128 GB itu dijual dengan harga Rp 2.999.000.\n" +
                "\n" +
                "Deskripsi :\n" +
                "Tahun rilis 2021\n" +
                "Prosesor Helio G95\n" +
                "Varian RAM/ROM 6/64,6/128 dan 8/128\n" +
                "Baterai 5.000 mAh dengan dukungan pengisian cepat 33W.\n",

        "Redmi Note 10 Pro  hadir dengan layar AMOLED yang memiliki resolusi 1080 x 2400 piksel dan sudah mendukung 120Hz. Layarnya sendiri berukuran 6,67 inci.\n" +
                "Untuk konfigurasi empat kamera di Redmi Note 10 Pro terdiri dari kamera wide 108 MP, kamera ultrawide 8 MP, kamera macro 5 MP, dan kamera depth 2 MP. Dimana sudah tersemat kamera depan dengan resolusi 16 MP.\n" +
                "Harga HP Redmi Note 10 Pro dibanderol hanya Rp 3.499.000 untuk versi 6/64GB. Sementara versi baru dengan memori 6/128GB dibanderol Rp 3.699.000\n" +
                "Deskripsi : \n" +
                "Tahun rilis 2021\n" +
                "Prosesor Snapdragon 732G\n" +
                "Varian RAM/ROM 6/64, 6/128 dan 8/128\n" +
                "Baterai berkapasitas 5020 mAh yang sudah mendukung fast charging 33W.\n",
        "Redmi 9T hadir dengan 4 kamera belakang dan 1 kamera depan. Kamera belakangnya terdiri dari sensor utama beresolusi 48 MP, lensa ultra wide 8 MP, lensa makro 2 MP dan sensor depth 2 MP. Sedangkan kamera depannya beresolusi 8 MP.\n" +
                "Layar juga menjadi daya tarik dari Redmi 9T, pasalnya sudah menggunakan resolusi FulHD+ 1080 x 2340p dengan bentang seluas 6,53 inci. Oiya, layar ini juga sudah diproteksi Gorilla Glass 3.\n" +
                "Harga HP Redmi 9T versi 4/64 GB dibanderol hanya Rp 1.899.000 , dan pilihan dengan memori 6/128 GB yang harganya ada di angka Rp 2.299.000\n" +
                "\n" +
                "Deskripsi : \n" +
                "Tahun rilis 2021\n" +
                "Prosesor Snapdragon 662\n" +
                "Varian RAM/ROM 4/64 dan 6/128\n" +
                "Baterainya yang kini sudah berkapasitas 6000 mAh. Baterai didukung pengisian cepat 18W dengan charger output 22W.\n"
    )
    private val hpImage = arrayOf(
        R.drawable.ten,
        R.drawable.noteten,
        R.drawable.notetenes,
        R.drawable.tenpro,
        R.drawable.nine

    )

    val listSmartphone : ArrayList<Smartphone>
        get() {
            val list = arrayListOf<Smartphone>()
            for (position in hpName.indices){
                val smartphone = Smartphone()
                smartphone.name = hpName[position]
                smartphone.desc = hpDesc[position]
                smartphone.image = hpImage[position]
                list.add(smartphone)
            }
            return list
        }
}