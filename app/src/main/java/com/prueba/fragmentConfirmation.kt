package com.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prueba.databinding.FragmentConfirmationBinding
import com.prueba.databinding.FragmentViewBalanceBinding


class fragmentConfirmation : Fragment() ,OnBackListener{

    private var _binding : FragmentConfirmationBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentConfirmationBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun backpressed(): Boolean {
        val fragmentTransaction =(context as MainActivity).supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_container, fragmentMain()).addToBackStack(null)
        fragmentTransaction.commit()
        return false
    }


}