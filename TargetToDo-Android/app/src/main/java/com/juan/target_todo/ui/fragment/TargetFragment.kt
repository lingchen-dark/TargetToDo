package com.juan.target_todo.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juan.target_todo.R
import com.juan.target_todo.viewmodel.TargetViewModel

class TargetFragment : Fragment() {

    companion object {
        fun newInstance() = TargetFragment()
    }

    private lateinit var viewModel: TargetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.target_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TargetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}