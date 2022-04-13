package com.ncr.hiltmulti

import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ncr.hiltmulti.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.dfm.setLaunchActivityClickListener("com.ncr.dynamicfeature.DfmMainActivity")

    }


    private fun TextView.setLaunchActivityClickListener(className: String) {
        setOnClickListener {
            val intent = Intent().also {
                it.component = ComponentName(packageName, className)
            }
            startActivity(intent)
        }
    }
}