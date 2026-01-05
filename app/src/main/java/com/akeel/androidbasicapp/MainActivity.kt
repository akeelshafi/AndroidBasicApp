package com.akeel.androidbasicapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFE CYCLE", "onCreate")
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textView = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        textView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("username", "This is the text from main screen")
            startActivity(intent)
        }
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com")
            startActivity(intent)

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFE CYCLE", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFE CYCLE", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFE CYCLE", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFE CYCLE", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFE CYCLE", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFE CYCLE", "onDestroy")
    }

}