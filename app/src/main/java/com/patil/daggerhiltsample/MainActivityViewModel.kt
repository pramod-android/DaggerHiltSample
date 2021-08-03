package com.patil.daggerhiltsample

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Named

class MainActivityViewModel @Inject constructor(@Named("str1") str1:String) : ViewModel() {

    init {
        Log.d("ViewModule"," $str1")
    }
}