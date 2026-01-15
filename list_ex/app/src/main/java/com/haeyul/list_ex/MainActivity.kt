package com.haeyul.list_ex

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var testList = mutableListOf<String>()
        testList.add("a")
        testList.add("b")
        testList.add("c")
        testList.add("d")
    }
}