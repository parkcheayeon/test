package com.chaeyeon.modularization

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chaeyeon.modularization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
// test
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}