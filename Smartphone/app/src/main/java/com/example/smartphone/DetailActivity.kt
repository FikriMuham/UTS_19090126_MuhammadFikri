package com.example.smartphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.smartphone.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        back()
        showDetail()
    }

    fun back(){
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    fun showDetail(){
        val nama = intent.getStringExtra("namaHp")
        val desc = intent.getStringExtra("descHp")
        val gambar = intent.getIntExtra("gambarHp", 0)

        Glide.with(this)
            .load(gambar)
            .into(binding.ImageDetail)

        binding.TitleDetail.setText(nama)
        binding.ContentDetail.setText(desc)
    }
}