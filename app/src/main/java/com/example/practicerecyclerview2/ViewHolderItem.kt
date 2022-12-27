package com.example.practicerecyclerview2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewHolderItem(itemView: View): RecyclerView.ViewHolder(itemView) {

    val imageViewHolder: ImageView = itemView.findViewById(R.id.imageView)
    val nameTextViewHolder: TextView = itemView.findViewById(R.id.nameTextView)
    val messageTextViewHolder: TextView = itemView.findViewById(R.id.messageTextView)
    private val recyclerAdapter = RecyclerAdapter()

    init {
        itemView.setOnClickListener {
            val position: Int = adapterPosition
            val name = recyclerAdapter.items[position].name

            Toast.makeText(itemView.context, "${name}さんです", Toast.LENGTH_SHORT).show()
        }
    }
}