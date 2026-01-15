package com.haeyul.val_log

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "testLog") // 오류
        Log.w("MainActivity", "testLog") // 경고
        Log.i("MainActivity", "testLog") // 정보
        Log.d("MainActivity", "testLog") // 디버그
        Log.v("MainActivity", "testLog") // 상세

    }
}