package com.crycetruly.alc40

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("ALC Phase1")

        to_about.setOnClickListener { view-> startActivity( Intent(this,AboutALCActivity::class.java) )}
        profilebtn.setOnClickListener { view->startActivity(Intent(this,ProfileActivity::class.java)) }
    }
}
