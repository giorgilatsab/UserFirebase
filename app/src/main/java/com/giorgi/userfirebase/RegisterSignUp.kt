package com.giorgi.userfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.giorgi.userfirebase.databinding.ActivityRegisterBinding
import com.giorgi.userfirebase.databinding.ActivityRegisterSignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class RegisterSignUp : AppCompatActivity() {

    lateinit var binding: ActivityRegisterSignUpBinding

    private lateinit var auth: FirebaseAuth;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterSignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        binding.EditSet.setText(email)

        binding.signUp.setOnClickListener{


        }
    }


}