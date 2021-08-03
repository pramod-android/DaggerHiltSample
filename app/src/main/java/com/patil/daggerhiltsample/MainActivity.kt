package com.patil.daggerhiltsample

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    @Named("str")
    lateinit var testString: String

    @Inject
    @Named("str1")
    lateinit var testString1: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate: $testString")
        Log.d("MainActivity", "onCreate: $testString1")
        val viewModel: MainActivityViewModel by viewModels()// {  } = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel

    }
}