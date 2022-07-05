package com.example.registrationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class ForgetActivity : AppCompatActivity() {
    lateinit var et_newpassword:TextInputEditText
    lateinit var et_conpassword:TextInputEditText
    lateinit var bt_done:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)
        et_newpassword=findViewById(R.id.et_newpassword)
        et_conpassword=findViewById(R.id.et_conpassword)
        bt_done=findViewById(R.id.bt_done)
        bt_done.setOnClickListener {
            var enteredet_newpassword=et_newpassword.text.toString()
            var enteredet_conpassword=et_conpassword.text.toString()
            if (TextUtils.isEmpty(enteredet_newpassword) || enteredet_newpassword.length<6){
                et_newpassword.error=("PASSWORD IS LESS THAN 6")
                return@setOnClickListener
            }else if (TextUtils.isEmpty(enteredet_conpassword) || !enteredet_newpassword.equals(enteredet_conpassword)){
                et_conpassword.error=("PASSWORD DOES NOT MATCH")
                return@setOnClickListener
            }
            else{

            }
        }
    }
}