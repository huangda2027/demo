package com.example.demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.example.demo.entity.News

class NewsAdapter(private val list:List<News>) :
  RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
  inner class NewsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var textView:TextView = itemView.findViewById(R.id.text)
  }

  interface OnItemClickListener {
    fun OnItemClick(view: View, position: Int)
  }
  private lateinit var onClick : OnItemClickListener

  fun setOnItemClick(onItemClickListener : OnItemClickListener){
      this.onClick = onItemClickListener
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =  NewsViewHolder(
    LayoutInflater.from(parent.context).inflate(
      R.layout.item_news,
      parent,
      false
    )
  )

  override fun getItemCount() = list.size

  override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
    holder.textView.text = list[position].title
  }
}