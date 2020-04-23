package com.maxot.myapplication.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.maxot.myapplication.R
import com.maxot.myapplication.databinding.FragmentMainBinding
import com.maxot.myapplication.databinding.FragmentSecondBinding
import com.maxot.myapplication.ui.activity.MainActivityViewModel
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_second.view.tv
import javax.inject.Inject

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

//    @Inject
//    lateinit var viewModel: SecondFragmentViewModel

    private val viewModel by viewModels<SecondFragmentViewModel> { viewModelFactory }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = ViewModelProvider(this, viewModelFactory).get(SecondFragmentViewModel::class.java)
        tv.text = viewModel.getRepository().getWords()
    }
    override fun getLayoutId(): Int {
        return R.layout.fragment_second
    }
}