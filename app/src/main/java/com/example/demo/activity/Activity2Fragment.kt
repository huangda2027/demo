package com.example.demo.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.R
import com.example.demo.fragment.mFragment

class Activity2Fragment : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activcity_2_fragment)
    var text = findViewById<TextView>(R.id.text)
    var supportFragmentManager = supportFragmentManager
    var fragmentTransaction = supportFragmentManager.beginTransaction()
    val fragment:mFragment

    savedInstanceState?.putString("msg","this is msg")
//    fragment.arguments = savedInstanceState;
  }
}