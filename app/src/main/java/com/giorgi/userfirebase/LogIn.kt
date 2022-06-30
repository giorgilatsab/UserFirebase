package com.giorgi.userfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.giorgi.userfirebase.databinding.ActivityLogInBinding
import com.giorgi.userfirebase.databinding.ActivityRegisterSignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LogIn : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.btLogBack.setOnClickListener{
            val intentBack = Intent(this, MainActivity::class.java)
            startActivity(intentBack)
        }


        binding.BtLogn.setOnClickListener {

            val email = binding.EdPasswor.text.toString()
            val password = binding.EdlogI.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "გთხოვთ ჩაწეროთ მონაცემები", Toast.LENGTH_SHORT).show()
            } else {

                         auth.signInWithEmailAndPassword(email, password)
                          .addOnCompleteListener{
                        if (it.isSuccessful) {

                            Toast.makeText(this,
                                "თქვენ წარმატებით გაიარეთ ავტორიზაცია",
                                Toast.LENGTH_SHORT
                            ).show()

                        } else {


                            Toast.makeText(
                                this, "კიდევ სცადეთ",
                                Toast.LENGTH_SHORT
                            ).show()

                        }
                    }


            }
        }
    }
    public override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        if(currentUser != null){
            Toast.makeText(
                this, "ავტორიზაცია გავლილია",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}