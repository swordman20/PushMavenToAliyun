package com.example.pushmaventoaliyun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mylog.LogUtils


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iv = findViewById<ImageView>(R.id.imageView)
        iv.setBackgroundResource(com.example.mylog.R.drawable.login_logo)
        LogUtils.e("哈哈哈")
    }
}