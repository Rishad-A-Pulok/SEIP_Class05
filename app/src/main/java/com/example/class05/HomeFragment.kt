package com.example.class05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {
    private lateinit var fNmaeET: EditText
    private lateinit var lNameET: EditText
    private lateinit var emailET: EditText
    private lateinit var phoneET: EditText
    private lateinit var regBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fNmaeET = view.findViewById(R.id.fNameET)
        lNameET = view.findViewById(R.id.lNameET)
        emailET = view.findViewById(R.id.emailET)
        phoneET = view.findViewById(R.id.phoneET)
        regBtn = view.findViewById(R.id.regBtn)
        regBtn.setOnClickListener {
            val fName = fNmaeET.text.toString()
            val lName = lNameET.text.toString()
            val email = emailET.text.toString()
            val phone = phoneET.text.toString()

            val bundle = Bundle().apply {
                putString("first_name",fName)
                putString("last_name",lName)
                putString("email",email)
                putString("phone",phone)
            }
            findNavController().navigate(R.id.action_homeFragment2_to_detailsFragment2,bundle)

        }
    }
}