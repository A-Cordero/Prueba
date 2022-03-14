package com.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prueba.databinding.FragmentMainBinding


class fragmentMain : Fragment(),OnBackListener {

    private var _binding : FragmentMainBinding ?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnViewTransactions.setOnClickListener {
            val fragmentTransaction =(context as MainActivity).supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragment_container, fragmentViewTransaction()).addToBackStack(null)
            fragmentTransaction.commit()
        }

        binding.btnSendMoney.setOnClickListener {
            val fragmentTransaction =(context as MainActivity).supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragment_container, fragmentChooseRecipient()).addToBackStack(null)
            fragmentTransaction.commit()
        }

        binding.btnViewBalance.setOnClickListener {
            val fragmentTransaction =(context as MainActivity).supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragment_container, fragmentViewBalance()).addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    override fun backpressed(): Boolean {
        return true
    }


}