package com.example.registrationapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RegistrationActivity : AppCompatActivity() {
    lateinit var til_email:TextInputLayout
    lateinit var et_email:TextInputEditText
    lateinit var et_password:TextInputEditText
    lateinit var et_forpassword:TextInputEditText
    lateinit var bt_login:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        til_email=findViewById(R.id.til_email)
        et_email=findViewById(R.id.et_email)
        et_password=findViewById(R.id.et_password)
        et_forpassword=findViewById(R.id.et_forpassword)
        et_forpassword.setOnClickListener {
            var intent=Intent(this,ForgetActivity::class.java)
            startActivity(intent)
        }
        bt_login=findViewById(R.id.bt_login)

        bt_login.setOnClickListener {
            var enteredet_email=et_email.text.toString()
            var enteredet_password=et_password.text.toString()
            if (TextUtils.isEmpty(enteredet_email) || !enteredet_email.contains("@")){
                et_email.error=("EMAIL IS INVALID")
                return@setOnClickListener
            }
            else if (TextUtils.isEmpty(enteredet_password) || enteredet_password.length<6){
                et_password.error=("PASSWORD MUST BE MORE THAN 6 DIGITS")
                return@setOnClickListener
            }
        }

    }
}