package com.example.lcoworkout

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.lcoworkout.model.Excercise
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class RandomActivity : AppCompatActivity() {

    lateinit var models: ArrayList<Excercise>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        parseJson()
    }

    fun parseJson() {
        val jsonfile = resources.openRawResource(R.raw.data)
            .bufferedReader().use { it.readText() }
        val gson = Gson()
        val groupListType: Type = object : TypeToken<ArrayList<Excercise?>?>() {}.type
        models = gson.fromJson<ArrayList<Excercise>>(jsonfile, groupListType)
        for (model in models) {
            Log.d("JSONFILE", model.name)
        }
    }
}