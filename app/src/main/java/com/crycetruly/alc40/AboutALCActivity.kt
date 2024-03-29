package com.crycetruly.alc40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutALCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        supportActionBar?.setTitle("About ALC")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        aboutwebview.settings.javaScriptEnabled=true
        aboutwebview.loadUrl("https://andela.com/alc/")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
