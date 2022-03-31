package com.example.class05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.class05.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.regBtn.setOnClickListener {
            val fName = binding.fNameET.text.toString()
            val lName = binding.lNameET.text.toString()
            val email = binding.emailET.text.toString()
            val phone = binding.phoneET.text.toString()

            val bundle = Bundle().apply {
                putString("first_name",fName)
                putString("last_name",lName)
                putString("email",email)
                putString("phone",phone)
            }
            findNavController().navigate(R.id.action_homeFragment2_to_detailsFragment2,bundle)
        }
        return binding.root
    }
}