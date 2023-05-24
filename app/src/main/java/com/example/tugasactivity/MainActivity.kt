package com.example.tugasactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.tugasactivity.databinding.ActivityMain2Binding
import com.example.tugasactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button.setOnClickListener(){
            sendMessage()
        }
        setContentView(binding.root)
    }
    fun sendMessage (){
        val nama = binding.etNama.text.toString()
        val email = binding.etMail.text.toString()
        val alamat = binding.etAlamat.text.toString()
        val noHp = binding.etHp.text.toString()

        val inten = Intent(this,MainActivity2::class.java)
        inten.putExtra("nama", nama)
        inten.putExtra("email" , email)
        inten.putExtra("alamat" , alamat)
        inten.putExtra("hp" , noHp)

        startActivity(inten)
    }
}