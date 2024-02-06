package com.yothman.islamiapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yothman.islamiapp.databinding.FragmentAhadethBinding

class AhadethFragment :Fragment() {
    lateinit var binding : FragmentAhadethBinding
    lateinit var ahadethAdapter :AhadethRvAdapte

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAhadethBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initRv()
    }

    private fun initRv(){
        ahadethAdapter = AhadethRvAdapte(ahadethName )
        binding.ahadethRv.adapter = ahadethAdapter
    }

    val ahadethName = listOf("الحديث رقم 1","الحديث رقم 2","الحديث رقم3","الحديث رقم 4","الحديث رقم 5","الحديث رقم 6","الحديث رقم 7","الحديث رقم 8","الحديث رقم 9","الحديث رقم 10","الحديث رقم 11")
}