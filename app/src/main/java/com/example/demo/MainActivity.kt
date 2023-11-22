package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.adapter.NewsAdapter
import com.example.demo.entity.News
import com.example.demo.fragment.RightFragment

class MainActivity : AppCompatActivity() {

  var list  = ArrayList<News>()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.item_news)
    initDate()
    var recyclerView=findViewById<RecyclerView>(R.id.recycler)
    recyclerView.layoutManager = LinearLayoutManager(this)
    val adapter = NewsAdapter(list)
    adapter.setOnItemClick(object : NewsAdapter.OnItemClickListener {
      override fun OnItemClick(view: View, position: Int) {
        replaceFragment(RightFragment(list[position]))
      }
    })

  }

  private fun initDate(){
    for (num in 1 ..10)
      list.add(News("新闻$num", "震惊$num"))
  }

  private  fun replaceFragment( fragment: Fragment) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.right_layout, fragment)
    transaction.commit()
  }
}