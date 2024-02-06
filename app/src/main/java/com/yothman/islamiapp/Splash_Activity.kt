package com.yothman.islamiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.yothman.islamiapp.databinding.SplashActivityBinding

class Splash_Activity : AppCompatActivity() {

    lateinit var binding : SplashActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler(Looper.getMainLooper()).postDelayed({
            var intint = Intent(this,HomeScreenActivity::class.java)
            startActivity(intint)
            finish()
        },2000)








    }
}