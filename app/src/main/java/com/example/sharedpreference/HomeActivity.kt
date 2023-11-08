package com.example.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvDisplay = findViewById<TextView>(R.id.tv_display)

        val sharePreference = getSharedPreferences("PREF", Context.MODE_PRIVATE)

        val username = sharePreference.getString("USERNAME", "").toString()
        tvDisplay.text = "$username"
    }
}