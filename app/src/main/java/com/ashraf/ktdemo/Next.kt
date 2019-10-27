package com.ashraf.ktdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_next.*

class Next : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        var layout = LinearLayoutManager(this)
        var use = ArrayList<User>()
        var user = User("as", "hko9udhyy")
        use.add(user)
        use.add(User("nidy", "hwqdhshh"))

        use.add(User("hwduie", "hhAshh"))

        use.add(User("hew77b", "hhwqdwshh"))

        use.add(User("hwg7b", "hhswqdhh"))

        use.add(User("hwd3w3bb", "hhshhpooqp"))
        var adp = adapt(this, use)
        rec.layoutManager = layout
        rec.setHasFixedSize(true)
        rec.adapter = adp
        var first: Fragment = First()
        var second: Fragment = Second()
        var namees = intent.getStringExtra("val").toString()
        textView2.text = namees
        button4.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()

            ft.replace(R.id.fml, first)
            ft.commit()

        }
        button5.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft.replace(R.id.fml, second)
            ft.commit()

        }
    }


}

