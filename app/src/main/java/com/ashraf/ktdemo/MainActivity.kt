package com.ashraf.ktdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var layout = LinearLayoutManager(this)

        var brmodel = ViewModelProviders.of(this).get(brandviewmodel::class.java)
        brmodel.getbrands().observe(this, Observer<List<Brands>>
        {
            var adapter = brandAdapter(this, it)
            Log.d("ttt", it.toString())
            recview.adapter = adapter
            recview.layoutManager = layout
            recview.setHasFixedSize(true)

        })
    }

}

