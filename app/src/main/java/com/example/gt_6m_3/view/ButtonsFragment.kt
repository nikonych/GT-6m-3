package com.example.gt_6m_3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.gt_6m_3.MainViewModel
import com.example.gt_6m_3.R
import com.example.gt_6m_3.databinding.FragmentButtonsBinding


class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }
        binding.btnMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }

    }
}

