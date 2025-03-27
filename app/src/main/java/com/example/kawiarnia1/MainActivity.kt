package com.example.kawiarnia1

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.SeekBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val checkBoxMleko = findViewById<CheckBox>(R.id.checkBoxMleko)
        val checkBoxCukier = findViewById<CheckBox>(R.id.checkBoxCukier)
        val seekBar = findViewById<SeekBar>(R.id.ilosc)
        val button = findViewById<Button>(R.id.ZlozZamowienie)
        val imageView = findViewById<ImageView>(R.id.Obrazek)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioEspresso -> imageView.setImageResource(R.drawable.espresso)
                R.id.radioCappuccino -> imageView.setImageResource(R.drawable.capuccino)
                R.id.radioLatte -> imageView.setImageResource(R.drawable.latte)
                else -> {}
            }
        }
    }
}