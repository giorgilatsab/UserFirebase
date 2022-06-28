package com.giorgi.userfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giorgi.userfirebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtRegister.setOnClickListener{
            val intentReg = Intent(this, Register::class.java)
            startActivity(intentReg)
        }
        binding.BtLogIn.setOnClickListener{
            val intentLogIn = Intent(this, LogIn::class.java)
            startActivity(intentLogIn)
        }
    }
}