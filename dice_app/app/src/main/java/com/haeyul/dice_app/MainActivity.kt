package com.haeyul.dice_app

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.haeyul.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_SHORT).show()

            val number1 = Random.nextInt(1, 7)
            val number2 = Random.nextInt(1, 7)

            val image1Id = resources.getIdentifier("dice_$number1", "drawable", packageName)
            val image2Id = resources.getIdentifier("dice_$number2", "drawable", packageName)

            binding.dice1.setImageResource(image1Id)
            binding.dice2.setImageResource(image2Id)
        }
    }
}