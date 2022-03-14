package com.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prueba.databinding.FragmentChooseRecipientBinding
import com.prueba.databinding.FragmentViewTransactionBinding


class fragmentViewTransaction : Fragment() ,OnBackListener{

    private var _binding : FragmentViewTransactionBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewTransactionBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun backpressed(): Boolean {
        return true
    }

}