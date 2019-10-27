package com.ashraf.ktdemo

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class brandviewmodel : ViewModel() {
    var brands = MutableLiveData<List<Brands>>()

    fun getbrands(): LiveData<List<Brands>> {
        if (brands == null) {
            loadBRands()
        }
        return brands
    }

    private fun loadBRands() {

        var Retro =
            Retrofit.Builder().baseUrl("http://13.233.166.2/api/").addConverterFactory(GsonConverterFactory.create())
                .build()
        var api = Retro.create(BrandApi::class.java)


        var res = api.getBrands(27, 1, 20)
        res.enqueue(object : Callback<List<Brands>> {
            override fun onFailure(call: Call<List<Brands>>, t: Throwable) {
                Log.d("error", t.message)
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<List<Brands>>, response: Response<List<Brands>>) {
                response.body()
                brands.value = response.body()
                Log.d("reposne", response.message())
            }

        })
    }


}