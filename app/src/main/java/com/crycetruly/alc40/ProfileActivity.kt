package com.crycetruly.alc40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.setTitle("My Profile")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){

            android.R.id.home-> {
                finish()
                true

            }

            else -> return super.onOptionsItemSelected(item)
        }

    }
}
