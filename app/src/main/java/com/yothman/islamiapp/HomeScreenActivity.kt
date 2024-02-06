package com.yothman.islamiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.yothman.islamiapp.databinding.HomeActivityBinding

class HomeScreenActivity :AppCompatActivity() {
    lateinit var binding: HomeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navBtns.setOnItemSelectedListener {
            if (it.itemId == R.id.quran_icon){
                startFragment(QuranFragment())
            } else  if (it.itemId == R.id.ahadeth_icon){
                startFragment(AhadethFragment())
            } else  if (it.itemId == R.id.senha_icon){
                startFragment(SebhaFragment())
            } else   if (it.itemId == R.id.radio_icon){
                startFragment(RadioFragment())
            }

            return@setOnItemSelectedListener true

        }
    }

    fun startFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.Fragment_Container,fragment)
            .commit()
    }
}