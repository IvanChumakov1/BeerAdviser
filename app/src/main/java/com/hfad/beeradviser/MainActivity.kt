package com.hfad.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var findbeer = findViewById<Button>(R.id.find_beer)
        findbeer.setOnClickListener {
            val beerColor = findViewById<Spinner>(R.id.color)
            val color = beerColor.selectedItem
            val brands = findViewById<TextView>(R.id.brands)
            brands.text = "Beer color is $color" + "\n" + GetBeers(color.toString())
        }
    }
    fun GetBeers(color: String): List<String>{
        return when (color){
            "Light" -> listOf("Jail Pale Ale", "Lager Lite")
            "Amber" -> listOf("Jack Amber", "Red Moose")
            "Brown" -> listOf("Brown Ber Beer", "Bock Brownie")
            else -> listOf("Gout Stout", "Dark Daniel")
        }
    }
}