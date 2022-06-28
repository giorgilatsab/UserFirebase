package com.giorgi.userfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giorgi.userfirebase.databinding.ActivityRegisterBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtNext.setOnClickListener{
          val intentNext = Intent(this, RegisterSignUp::class.java).apply {
              putExtra("email",binding.EdEmail.text.toString())
              putExtra("password",binding.EdPassword.text.toString())
          }
            startActivity(intentNext)
            val database = Firebase.database
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")
        }
    }

}