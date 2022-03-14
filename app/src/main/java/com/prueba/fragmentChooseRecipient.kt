package com.prueba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prueba.databinding.FragmentChooseRecipientBinding
import com.prueba.databinding.FragmentMainBinding

class fragmentChooseRecipient : Fragment(),OnBackListener {

    private var _binding : FragmentChooseRecipientBinding?= null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentChooseRecipientBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
            val fragmentTransaction =(context as MainActivity).supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.fragment_container, fragmentSpecifyAmount()).addToBackStack(null)
            fragmentTransaction.commit()
        }

        binding.btnCancel.setOnClickListener {
            (context as MainActivity).onBackPressed()
        }
    }

    override fun backpressed(): Boolean {
        return true
    }
}