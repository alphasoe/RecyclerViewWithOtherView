package com.myanmaritc.recyclerviewwithotherview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.myanmaritc.recyclerviewwithotherview.R
import com.myanmaritc.recyclerviewwithotherview.model.Jack
import kotlinx.android.synthetic.main.recycler_item.view.*

class JackAdapter(var jackList: ArrayList<Jack>) :
    RecyclerView.Adapter<JackAdapter.JackViewHolder>() {
    class JackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jack: Jack) {
            itemView.imgView.setImageResource(jack.image)
            itemView.txtView.text = jack.type
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JackAdapter.JackViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return JackViewHolder(view)
    }

    override fun getItemCount(): Int = jackList.size

    override fun onBindViewHolder(holder: JackAdapter.JackViewHolder, position: Int) {
        holder.bind(jackList[position])
    }

}