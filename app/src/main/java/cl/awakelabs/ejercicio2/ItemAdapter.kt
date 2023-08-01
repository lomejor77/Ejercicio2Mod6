package cl.awakelabs.ejercicio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import cl.awakelabs.ejercicio2.data.local.Item
import cl.awakelabs.ejercicio2.databinding.ItemBinding

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    lateinit var binding: ItemBinding
    private val listItem = mutableListOf<Item>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ItemViewHolder(binding)
    }

    fun setData(item: List<Item>) {
        this.listItem.clear()
        this.listItem.addAll(listItem)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listItem[position]
        holder.render(item)

    }

    class ItemViewHolder(val v: ItemBinding) : RecyclerView.ViewHolder(v.root) {

        fun render(item: Item){
            v.txName.text = item.name.toString()
            v.txPrice.text = item.price.toString()
            v.txQty.text = item.qty.toString()
            v.txTotal.text = (item.price * item.qty).toString()
        }

    }

}