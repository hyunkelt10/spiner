package com.example.spiner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spiner.databinding.ActivityMainBinding
import com.example.spiner.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var b: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityResultBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnVolver.setOnClickListener {
            onBackPressed()
        }








    }
}