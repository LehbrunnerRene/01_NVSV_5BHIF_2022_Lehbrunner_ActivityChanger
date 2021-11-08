package com.example.at01_nvsv_5bhif_2022_lehbrunner_activitychanger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn: Button = findViewById(R.id.btn2)
        val textview: TextView = findViewById(R.id.result)
        val resultNumber = intent.getStringExtra("result")
        textview.text = resultNumber

        btn.setOnClickListener {
            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}