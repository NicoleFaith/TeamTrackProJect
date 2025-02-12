package com.example.ttanader.LogSign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttanader.R

class OpeningPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        enableEdgeToEdge()
        setContentView(R.layout.activity_opening_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val LoginBtnSelection = findViewById<Button>(R.id.LoginBtnSelection)
        val SignUpBtnSelection = findViewById<Button>(R.id.SignUpBtnSelection)

        LoginBtnSelection.setOnClickListener {
            val intent = Intent(this,LoginPage::class.java)
            startActivity(intent)
        }

        SignUpBtnSelection.setOnClickListener {
            val intent = Intent(this,SignUpPage::class.java)
            startActivity(intent)
        }

    }
}