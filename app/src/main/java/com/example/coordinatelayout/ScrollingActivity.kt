package com.example.coordinatelayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_scrolling.*

class ScrollingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        fab.setOnClickListener {
         Snackbar.make(it, "This is a scrollView coordinate layout", Snackbar.LENGTH_SHORT)
                .setAction("UNDO"){
                    Toast.makeText(this,"Hello",Toast.LENGTH_SHORT).show()
                }.setActionTextColor(Color.RED).show()
        }
    }
}