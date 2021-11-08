package com.example.at01_nvsv_5bhif_2022_lehbrunner_activitychanger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnSwitch)



        btn.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("result",count.toString())
            startActivity(intent)
        }
    }

    fun addOnTap(view: View){
        count++

        val textview: TextView = findViewById(R.id.inputNumber)
        textview.text = count.toString()
    }

    fun delOnTap(view: View){
        count--

        val textview: TextView = findViewById(R.id.inputNumber)
        textview.text = count.toString()
    }

}