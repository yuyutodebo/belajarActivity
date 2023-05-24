package com.example.tugasactivity

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasactivity.databinding.ActivityMain2Binding
import com.example.tugasactivity.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        val name = intent.getStringExtra("nama")
        binding.Nama.text = name.toString()
        val email = intent.getStringExtra("email")
        binding.email.text = email.toString()
        val alamat = intent.getStringExtra("alamat")
        binding.alamat.text = alamat.toString()
        val noHp = intent.getStringExtra("hp")
        binding.noHP.text = noHp.toString()

        setContentView(binding.root)
    }
}