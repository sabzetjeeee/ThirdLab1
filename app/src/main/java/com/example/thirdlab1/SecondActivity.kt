package com.example.thirdlab1

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thirdlab1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val color = intent.getStringExtra("color")

        if (color.equals("magenta")) binding.clMain.setBackgroundColor(Color.MAGENTA)
        else if (color.equals("gray")) binding.clMain.setBackgroundColor(Color.GRAY)
        else if (color.equals("cyan")) binding.clMain.setBackgroundColor(Color.CYAN)
        else if (color.equals("green")) binding.clMain.setBackgroundColor(Color.GREEN)
        else if (color.equals("white")) binding.clMain.setBackgroundColor(Color.WHITE)
        else if (color.equals("blue")) binding.clMain.setBackgroundColor(Color.BLUE)
        else if (color.equals("red")) binding.clMain.setBackgroundColor(Color.RED)
    }
}