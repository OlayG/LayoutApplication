package com.olayg.layoutapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.olayg.layoutapplication.databinding.ActivityTestKotlinBinding

class TestActivityKt : AppCompatActivity() {

    private val binding : ActivityTestKotlinBinding by lazy {
        ActivityTestKotlinBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvMessage.text = intent.getStringExtra(Constant.EXTRA_USERNAME)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
}