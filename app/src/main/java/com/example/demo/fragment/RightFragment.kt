package com.example.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.demo.R
import com.example.demo.entity.News


class RightFragment(val news : News) : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
    var view = inflater.inflate(R.layout.rightfragment,container,false)
    var title = view.findViewById<TextView>(R.id.tv_title)
    var content = view.findViewById<TextView>(R.id.tv_content)
    title.text = news.title
    content.text = news.content
    return view
  }
}