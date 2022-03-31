package com.example.class05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text

class DetailsFragment : Fragment() {
    private lateinit var fNameTV: TextView
    private lateinit var lNameTV: TextView
    private lateinit var emailTV: TextView
    private lateinit var phoneTV: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fNameTV = view.findViewById(R.id.fNameTV)
        lNameTV = view.findViewById(R.id.lNameTV)
        emailTV = view.findViewById(R.id.emailTV)
        phoneTV = view.findViewById(R.id.phoneTV)
        val fName = arguments?.getString("first_name")
        val lName = arguments?.getString("last_name")
        val email = arguments?.getString("email")
        val phone = arguments?.getString("phone")

        fNameTV.text = fName.toString()
        lNameTV.text = lName.toString()
        emailTV.text = email.toString()
        phoneTV.text = phone.toString()
    }
}