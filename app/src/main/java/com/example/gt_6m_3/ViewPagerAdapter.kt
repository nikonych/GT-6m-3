package com.example.gt_6m_3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gt_6m_3.view.ButtonsFragment
import com.example.gt_6m_3.view.HistoryFragment
import com.example.gt_6m_3.view.ValueFragment

class ViewPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount() = NUM_TABS

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return ButtonsFragment()
            1 -> return ValueFragment()
            2 -> return HistoryFragment()
        }
        return ButtonsFragment()
    }

    companion object{
        private const val NUM_TABS = 3
    }

}