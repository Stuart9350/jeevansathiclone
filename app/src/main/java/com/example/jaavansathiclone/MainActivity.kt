package com.example.jaavansathiclone

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var userLoginBtn: LinearLayout
    private lateinit var adminLoginBtn: LinearLayout
    private lateinit var registerBtn: CardView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        userLoginBtn = findViewById(R.id.LinearLoginAsUser)
        adminLoginBtn = findViewById(R.id.LinearLoginAsAdmin)
        registerBtn = findViewById(R.id.registerUserCard)

        userLoginBtn.setOnClickListener {
            startActivity(Intent(this, UserLoginPage::class.java))
        }

        adminLoginBtn.setOnClickListener {
            startActivity(Intent(this, AdminLoginPage::class.java))
        }

        userLoginBtn.setOnClickListener {
            startActivity(Intent(this, PersonalDetails::class.java))
        }
    }
}