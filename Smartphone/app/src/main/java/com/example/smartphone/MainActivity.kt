package com.example.smartphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.smartphone.adapters.SmartphoneAdapter
import com.example.smartphone.databinding.ActivityMainBinding
import com.example.smartphone.models.Smartphone
import com.example.smartphone.models.SmartphoneData

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var smartphoneAdapter: SmartphoneAdapter
    private var listSmartphone : ArrayList<Smartphone> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showSmartphoneRv()
        supportActionBar?.hide()
    }

    fun showSmartphoneRv(){
        listSmartphone.addAll(SmartphoneData.listSmartphone)
        smartphoneAdapter = SmartphoneAdapter(listSmartphone, object : SmartphoneAdapter.onSmartphoneClick{
            override fun onItemCick(smartphone: Smartphone) {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("namaHp", smartphone.name)
                    putExtra("gambarHp", smartphone.image)
                    putExtra("descHp", smartphone.desc)
                })
            }
        })
        binding.RVHP.apply {
            val lm = GridLayoutManager(this@MainActivity, 2)
            layoutManager = lm
            adapter = smartphoneAdapter
        }
    }
}