package com.example.spiner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.forEach
import com.example.spiner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        var d =""
        val datos = listOf<String>("nombre", "edad", "sexo", "telefono")
        val mapa = mutableMapOf<String,String>()


        b.btnEnviar.setOnClickListener {
            val myintent = Intent(this, ResultActivity::class.java)
            startActivity(myintent)





        }

        val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(
            this, R.array.opciones, android.R.layout.simple_spinner_item
        )

        b.spinner.adapter = adaptador
        b.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    this@MainActivity, "seleccion: ".plus(position.toString()),
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "sin seleccion", Toast.LENGTH_SHORT).show()

            }
        }

        b.btnPut.setOnClickListener {
            datos.forEach{
                mapa.put(it,b.txEnviar.toString())


            }




            }

        }





    }

