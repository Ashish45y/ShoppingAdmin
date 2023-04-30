package dev.ashish.shoppingadmin.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.ashish.shoppingadmin.R
import dev.ashish.shoppingadmin.activity.AllOrderActivity
import dev.ashish.shoppingadmin.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_categoryFragment2)
        }
        binding.button2.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_productFragment)
        }
        binding.button3.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_sliderFragment)
        }
        binding.button4.setOnClickListener{
           startActivity(Intent(requireContext(),AllOrderActivity::class.java))
        }
        return binding.root
    }
}