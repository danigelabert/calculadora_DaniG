package com.danigelabert.calculadora_danig

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.danigelabert.calculadora_danig.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSuma.setOnClickListener {
            val REQUEST_CODE = 1
            val intent = Intent(this, calcularScreen::class.java)
            intent.putExtra("number1", binding.edtiTextNumOne.text)
            intent.putExtra("number2", binding.edtiTextNumTwo.text)
            startActivityForResult(intent, REQUEST_CODE)
        }
    }
}