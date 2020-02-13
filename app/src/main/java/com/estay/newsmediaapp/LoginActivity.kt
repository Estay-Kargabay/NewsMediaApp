package com.estay.newsmediaapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (userpassword.text.toString() =="123"){
                Toast.makeText(this, "okey", Toast.LENGTH_LONG).show()
            val sharedPrefs=getSharedPreferences("production", Context.MODE_PRIVATE)
            with(sharedPrefs.edit()){
                putBoolean("is_signed_in",true)
                commit()
            }
            startActivity(Intent(this,MainActivity::class.java))

        }else {
            Toast.makeText(this,"no ",Toast.LENGTH_LONG).show()
           }}
    }
