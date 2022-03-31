package com.example.retorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retorecyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val objects: Array<JSONObject> = arrayOf(

            JSONObject("{\"name\": \"Item\", \"precio\": \"$200\",\"ranking\": \"4.7\",\"ventas\": \"200 vendidos\"}"),
            JSONObject("{\"name\": \"Item2\", \"precio\": \"$150\",\"ranking\": \"3.7\",\"ventas\": \"100 vendidos\"}"),
            JSONObject("{\"name\": \"Item3\", \"precio\": \"$300\",  \"ranking\": \"4.8\",\"ventas\": \"20 vendidos\"}"),
            JSONObject("{\"name\": \"Item4\", \"precio\": \"$175\",  \"ranking\": \"4.0\",\"ventas\": \"150 vendidos\"}"),
        )
        binding.shopEntries.adapter=MainAdapter(objects)





    }
}