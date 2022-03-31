package com.example.class05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.class05.databinding.FragmentDetailsBinding
import com.example.class05.databinding.FragmentHomeBinding
import org.w3c.dom.Text

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater,container,false)
        val fName = arguments?.getString("first_name")
        val lName = arguments?.getString("last_name")
        val email = arguments?.getString("email")
        val phone = arguments?.getString("phone")
        binding.fNameTV.text = fName.toString()
        binding.lNameTV.text = lName.toString()
        binding.emailTV.text = email.toString()
        binding.phoneTV.text = phone.toString()
        return binding.root
    }
}