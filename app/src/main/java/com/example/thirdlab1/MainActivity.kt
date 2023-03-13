package com.example.thirdlab1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thirdlab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bttnMagenta.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "magenta")
            startActivity(intent)
        }

        binding.bttnGray.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "gray")
            startActivity(intent)
        }

        binding.bttnCyan.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "cyan")
            startActivity(intent)
        }
        binding.bttnGreen.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "green")
            startActivity(intent)
        }
        binding.bttnWhite.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "white")
            startActivity(intent)
        }
        binding.bttnBlue.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "blue")
            startActivity(intent)
        }
        binding.bttnRed.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "red")
            startActivity(intent)
        }

    }
}