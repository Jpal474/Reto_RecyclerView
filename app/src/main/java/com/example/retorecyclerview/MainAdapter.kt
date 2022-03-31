package com.example.retorecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retorecyclerview.databinding.ItemShopBinding
import org.json.JSONObject

class MainAdapter(private val item: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemShopBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(item[position])
    }

    override fun getItemCount(): Int = item.size

    class MainHolder(val binding : ItemShopBinding): RecyclerView.ViewHolder(binding.root){
        fun render(items: JSONObject) {
            binding.productName.setText(items.getString("name"))
            binding.precio.setText(items.getString("precio"))
            binding.ranking.setText(items.getString("ranking"))
            binding.ventas.setText(items.getString("ventas"))
            binding.store.setImageResource(R.drawable.store)
            binding.product.setImageResource(R.drawable.shopping_item)

                   }
        }
}