package com.example.content_course

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class contentActivity: AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
               setContentView(R.layout.contentactivity)
         var ImageView:ImageView=findViewById(R.id.img)
         ImageView.setImageDrawable(getDrawable(intent.getIntExtra("img",-1)))
         var TextView:TextView=findViewById(R.id.content)
         TextView.setText(intent.getIntExtra("content",-1))


}}