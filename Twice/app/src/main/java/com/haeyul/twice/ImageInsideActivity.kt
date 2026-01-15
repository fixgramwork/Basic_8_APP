package com.haeyul.twice

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)
        val imageId = "image_$getData"

        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()


        memberImage.setImageResource(R.drawable."$imageId")


    }
}