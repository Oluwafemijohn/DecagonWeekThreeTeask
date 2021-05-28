package com.example.uidesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        To remove the task bar from the view
        supportActionBar?.hide()
        

//      To switch the theme between light and dark mode
        var darkModeSwitch = findViewById<Switch>(R.id.darkModeSwitch)
        darkModeSwitch.setOnClickListener {
            if (darkModeSwitch.isChecked ) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }


    }

}