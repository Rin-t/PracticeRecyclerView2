package com.example.practicerecyclerview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewItem(name: String, message: String) {
    val name = name
    val message = message
}

class RecyclerAdapter: RecyclerView.Adapter<ViewHolderItem>() {

    val items = listOf<RecyclerViewItem>(
        RecyclerViewItem("たなか","こんにちは"),
        RecyclerViewItem("すずき","こんばんは"),
        RecyclerViewItem("さとう","おはよう"),
        RecyclerViewItem("たかはし","おやすみ")
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val item = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolderItem(item)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.nameTextViewHolder.text = items[position].name
        holder.messageTextViewHolder.text = items[position].message
        if (position % 2 == 0) {
            holder.imageViewHolder.setImageResource(R.drawable.android)
        } else {
            holder.imageViewHolder.setImageResource(R.drawable.android2)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}