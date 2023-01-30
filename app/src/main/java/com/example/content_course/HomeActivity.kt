package com.example.content_course

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.homeactivity)
            val btnAndroid:Button=findViewById<Button>(R.id.btnandroid)
            val btnIOS:Button=findViewById(R.id.btnIOS)
            val btnFullstack :Button=findViewById(R.id.btnfullstack)
            btnAndroid.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {
                    Intent(this@HomeActivity,contentActivity::class.java)
                    intent.putExtra("img",R.drawable.android)
                    intent.putExtra("content",R.string.Android)
                    startActivity(intent)
                    finish()

                }
            })
            btnIOS.setOnClickListener(object :View.OnClickListener{
                override fun onClick(v: View?) {
                    Intent(this@HomeActivity,contentActivity::class.java)
                    intent.putExtra("img",R.drawable.ios)
                    intent.putExtra("content",R.string.IOS)
                    startActivity(intent)
                    finish()
                }
            })
            btnFullstack.setOnClickListener(object :View.OnClickListener{
                override fun onClick(v: View?) {
                    val intent=Intent(this@HomeActivity,contentActivity::class.java)
                    intent.putExtra("img",R.drawable.fullstack)
                    intent.putExtra("content",R.string.app_name)
                    startActivity(intent)
                    finish()
                }


            })
    }
}