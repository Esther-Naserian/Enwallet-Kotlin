package com.example.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val names = listOf("Ann","Naserian","Caro","Diana","Esther","Samuria","Brenda","Naomi","Faith", "Mercy","Kantai","Njiru","Daisy","Teresia","Moureen","Kantai","Ivy")
        binding.tvnames.layoutManager= LinearLayoutManager(this)

    }
}
