package com.example.lab8_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab8_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //啟用ViewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}