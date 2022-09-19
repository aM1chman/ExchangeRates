package com.arlitin.retrofit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.arlitin.retrofit.screens.second.SecondFragment
import com.arlitin.retrofit.screens.start.StartFragment

class ViewPagerAdapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> StartFragment()
            else -> SecondFragment()
        }
    }
}