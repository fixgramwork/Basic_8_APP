package com.haeyul.bts_picture_app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image_1)
        val image2 = findViewById<ImageView>(R.id.image_2)
        val image3 = findViewById<ImageView>(R.id.image_3)
        val image4 = findViewById<ImageView>(R.id.image_4)
        val image5 = findViewById<ImageView>(R.id.image_5)
        val image6 = findViewById<ImageView>(R.id.image_6)
        val image7 = findViewById<ImageView>(R.id.image_7)
        val image8 = findViewById<ImageView>(R.id.image_8)
        val image9 = findViewById<ImageView>(R.id.image_9)

        image1.setOnClickListener {
            var intent = Intent(this, Yena1Activity::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener {
            var intent = Intent(this, Yena2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            var intent = Intent(this, Yena3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            var intent = Intent(this, Yena4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            var intent = Intent(this, Yena5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            var intent = Intent(this, Yena6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            var intent = Intent(this, Yena7Activity::class.java)
            startActivity(intent)
        }

        image8.setOnClickListener {
            var intent = Intent(this, Yena8Activity::class.java)
            startActivity(intent)
        }

        image9.setOnClickListener {
            var intent = Intent(this, Yena9Activity::class.java)
            startActivity(intent)
        }
    }
}