package com.ashraf.ktdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class vadp(var fm:FragmentManager,var noodfrags:Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
         when (position) {
            0 -> return First()
            1 -> return Second()
        }

        return First()
    }

    override fun getCount(): Int {
    return noodfrags
    }
}