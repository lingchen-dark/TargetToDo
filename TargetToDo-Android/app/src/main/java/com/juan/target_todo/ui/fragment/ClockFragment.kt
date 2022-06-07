package com.juan.target_todo.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juan.target_todo.R
import com.juan.target_todo.viewmodel.ClockViewModel

class ClockFragment : Fragment() {

    companion object {
        fun newInstance() = ClockFragment()
    }

    private lateinit var viewModel: ClockViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.clock_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClockViewModel::class.java)
        // TODO: Use the ViewModel
    }

}