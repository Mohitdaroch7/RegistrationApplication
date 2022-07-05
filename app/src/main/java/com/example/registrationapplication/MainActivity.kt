package com.example.registrationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
     lateinit var til_name:TextInputLayout
     lateinit var til_email:TextInputLayout
     lateinit var et_name:TextInputEditText
    lateinit var et_number:TextInputEditText
    lateinit var et_email:TextInputEditText
    lateinit var et_password:TextInputEditText
    lateinit var btn_register:MaterialButton
    lateinit var et_for:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        til_name=findViewById(R.id.til_name)
        til_email=findViewById(R.id.til_email)
        et_name=findViewById(R.id.et_name)
        et_number=findViewById(R.id.et_number)
        et_email=findViewById(R.id.et_email)
        et_password=findViewById(R.id.et_password)
        btn_register=findViewById(R.id.bt_register)
        et_for=findViewById(R.id.et_for)
        et_for.setOnClickListener {
            var intent=Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
        btn_register.setOnClickListener {
            var enteredet_name=et_name.text.toString()
            var enteredet_number=et_number.text.toString()
            var enteredet_email=et_email.text.toString()
            var enteredet_password=et_password.text.toString()
            if (enteredet_name.isEmpty() || enteredet_name.length<3){
                et_name.setError("ENTER YOUR NAME CORRECTLY")
                return@setOnClickListener
                }
            else if(enteredet_number.isEmpty() || enteredet_number.length<10 ){
                et_number.setError("ENTER YOUR NUMBER CORRECTLY")
                return@setOnClickListener
            }else if(enteredet_email.isEmpty() || !enteredet_email.contains("@") ){
                et_email.setError("ENTER YOUR EMAIL CORRECTLY")
                return@setOnClickListener
            }else if(enteredet_password.isEmpty() || enteredet_password.length<6 ){
                et_email.setError("PASSWORD MUST BE MORE THAN 6 DIGITS")
                return@setOnClickListener
            }
            else{
                var  intent=Intent(this, OtpActivity::class.java)
                startActivity(intent)
            }


        }

    }
}


