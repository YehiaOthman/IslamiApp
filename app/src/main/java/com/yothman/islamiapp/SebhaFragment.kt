package com.yothman.islamiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.yothman.islamiapp.databinding.FragmentSebhaBinding

class SebhaFragment: Fragment() {

    lateinit var binding : FragmentSebhaBinding
    var counter = 0
    var currentZekr = 0
    lateinit var zekrList : MutableList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSebhaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        zekrList = resources.getStringArray(R.array.zekrList).toMutableList()
        binding.zekrTv.text = zekrList[currentZekr]
        TasbehClick()

    }

    private fun TasbehClick(){
        binding.sebhaIv.setOnClickListener {
            binding.sebhaIv.rotation +=30F
            if (counter<33){
                counter++
            }else{
                counter = 0
                currentZekr = if(currentZekr < zekrList.size - 1) ++currentZekr else 0
                binding.zekrTv.text = zekrList[currentZekr]
            }
            binding.zekrCounterTv.text = counter.toString()
        }
    }




}