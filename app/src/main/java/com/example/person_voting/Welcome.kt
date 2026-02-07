package com.example.person_voting

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.person_voting.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.candiBtn.setOnClickListener {
            Toast.makeText(this, "begin button clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@Welcome, MainActivity::class.java))
        }

        binding.loginBtn.setOnClickListener {
            Toast.makeText(this, "begin button clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@Welcome, MainActivity::class.java))
        }



    }
    }
