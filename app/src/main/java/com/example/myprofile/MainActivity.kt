package com.example.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var photo: ImageView? =null
    var eduButton: Button? = null
    var workButton: Button? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        photo=findViewById(R.id.profilephoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,ProfilePhoto::class.java)
            startActivity(clickIntent)

         eduButton=findViewById(R.id.educa)
            eduButton?.setOnClickListener({
                var clickIntentedu =Intent(this@MainActivity,Education::class.java)
                startActivity(clickIntentedu)
            })

            workButton=findViewById(R.id.work)
            workButton?.setOnClickListener({
                var clickInternwor =Intent(this@MainActivity,WorkExpierence::class.java)
                startActivity(clickInternwor)
            })
        })
    }
}
