package com.mad.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.mad.navigationdemo.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)

        binding.btnlogin.setOnClickListener(){
            val strUsername: String = binding.tfName.text.toString()
            val strPassword: String = binding.tfPassword.text.toString()

            if (strUsername == "123" && strPassword == "abc"){

            }else{
                Toast.makeText(context,"Invalid username or password", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }
}