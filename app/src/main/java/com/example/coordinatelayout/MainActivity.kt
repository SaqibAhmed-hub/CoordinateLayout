package com.example.coordinatelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_layout.setOnClickListener {
            startActivity(Intent(this,LayoutActivity::class.java))
        }

        btn_scrolling.setOnClickListener {
            startActivity(Intent(this,ScrollingActivity::class.java))
        }

    }
}