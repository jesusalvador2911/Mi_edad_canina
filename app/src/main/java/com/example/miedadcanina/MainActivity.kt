package com.example.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "Acivity created")

        binding.button.setOnClickListener {
            var  ageString = binding.ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                var ageInt = ageString.toInt()
                var result = ageInt * 7
                binding.resultText.text = getString(R.string.result_text, result)
            } else {
                Log.d("MainActivity", "Age is empty")
                Toast.makeText(this, getString(R.string.you_must_insert_your_age), Toast.LENGTH_SHORT).show();

            }
        }

    }
}