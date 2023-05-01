package com.example.gt_6m_3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var counter = 0;
    val mCounter = MutableLiveData<Int>()
    private var history = ArrayList<String>()
    val mHistory = MutableLiveData<ArrayList<String>>()

    fun onIncrementClick(){
        counter++
        mCounter.value = counter
        history.add("+")
        mHistory.value = history
    }
    fun onDecrementClick(){
        counter--
        mCounter.value = counter
        history.add("-")
        mHistory.value = history
    }
}