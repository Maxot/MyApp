package com.maxot.myapplication.ui.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.maxot.myapplication.MyApplication
import com.maxot.myapplication.R
import com.maxot.myapplication.databinding.FragmentMainBinding
import com.maxot.myapplication.ui.activity.MainActivity
import com.maxot.myapplication.ui.activity.MainActivityViewModel
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

class MainFragment : BaseFragment<FragmentMainBinding>() {

    private val viewModel by viewModels<MainFragmentViewModel> { viewModelFactory }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel = ViewModelProvider(this, viewModelFactory).get(MainFragmentViewModel::class.java)
        button_one.text = viewModel.getRepository().getWords()
        button_one.setOnClickListener {
            onButtonClick(it)
        }
        btn_new_word.setOnClickListener {
            onNewWordButtonClick()
        }
    }

    private fun onButtonClick(view: View) {
        findNavController(this as Fragment).navigate(R.id.action_fragment_main_to_fragment_second)
    }

    private fun onNewWordButtonClick(){
        findNavController(this as Fragment).navigate(R.id.action_fragment_main_to_fragment_new_word)
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_main
    }
}