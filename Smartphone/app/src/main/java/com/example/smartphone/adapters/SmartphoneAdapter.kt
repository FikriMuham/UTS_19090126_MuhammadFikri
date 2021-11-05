package com.example.smartphone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smartphone.databinding.ListHpBinding
import com.example.smartphone.models.Smartphone

class SmartphoneAdapter(private val listHp : ArrayList<Smartphone>,
                        private val listener : SmartphoneAdapter.onSmartphoneClick): RecyclerView.Adapter<SmartphoneAdapter.SmartphoneViewholder>() {

    inner class SmartphoneViewholder(val binding: ListHpBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartphoneViewholder {
        return SmartphoneViewholder(ListHpBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SmartphoneViewholder, position: Int) {
        holder.binding.apply {
            Glide.with(holder.itemView.context)
                .load(listHp[position].image)
                .into(holder.binding.Tumbnail)

            Title.text = listHp[position].name
        }
        holder.itemView.setOnClickListener {
            listener.onItemCick(listHp[position])
        }
    }

    override fun getItemCount(): Int {
        return listHp.size
    }

    interface onSmartphoneClick{
        fun onItemCick(smartphone: Smartphone)
    }
}