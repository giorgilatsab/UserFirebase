package com.giorgi.userfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.giorgi.userfirebase.databinding.ActivityRegisterBinding
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener{
            val intentBack = Intent(this, MainActivity::class.java)
            startActivity(intentBack)
        }

        binding.BtNext.setOnClickListener{
            val email = binding.EdEmail.text.toString()
            val password = binding.EdPassword.text.toString()
            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "გთხოვთ ჩაწეროთ მონაცემები", Toast.LENGTH_SHORT).show()
            }
            else{
                val intentNext = Intent(this, RegisterSignUp::class.java).apply {
                    putExtra("email",email)
                    putExtra("password",password)
                }
                startActivity(intentNext)
            }


        }
    }

}