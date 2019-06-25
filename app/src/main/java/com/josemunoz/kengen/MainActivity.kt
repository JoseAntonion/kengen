package com.josemunoz.kengen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //el primero kotlin
        var firstTextView = findViewById<TextView>(R.id.firstText)
        var mensaje = "holanda que talca"
        firstTextView.setText(mensaje)
        Toast.makeText(this,mensaje,LENGTH_SHORT).show()
    }
}
