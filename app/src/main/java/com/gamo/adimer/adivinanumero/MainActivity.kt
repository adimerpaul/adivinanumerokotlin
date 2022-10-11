package com.gamo.adimer.adivinanumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var intento=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1= findViewById<EditText>(R.id.et1)
        val button= findViewById<Button>(R.id.button)
        val numero=(Math.random()*100).toInt()
        button.setOnClickListener {
            if(numero==et1.text.toString().toInt()){
                Toast.makeText(this,"ganaste adivinaste el numero!!!! era ${numero} en ${intento} intentos",Toast.LENGTH_SHORT).show()
            }else if(et1.text.toString().toInt()<numero){
                Toast.makeText(this,"Muy bajo!",Toast.LENGTH_SHORT).show()
                intento++
            }else{
                Toast.makeText(this,"Muy alto! ",Toast.LENGTH_SHORT).show()
                intento++
            }
        }
    }
}