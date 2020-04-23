package com.maxot.myapplication.ui.newword

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.maxot.myapplication.R
import com.maxot.myapplication.databinding.FragmentNewWordBinding
import com.maxot.myapplication.ui.fragment.BaseFragment
import com.maxot.myapplication.ui.fragment.MainFragmentViewModel
import kotlinx.android.synthetic.main.fragment_new_word.*

class NewWordFragment : BaseFragment<FragmentNewWordBinding>() {
    private val viewModel by viewModels<MainFragmentViewModel> { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_save.setOnClickListener {
            onSaveClick(et_word.text.toString(), et_translate.text.toString())
            et_word.text.clear()
            et_translate.text.clear()
        }
        val text = StringBuilder()
        viewModel.allWords.observe(this.viewLifecycleOwner, Observer {
            text.clear()
            for (item in it){
                text.append("${item.name} : ${item.translate} \n")
            }

            tv_all_words.text = text.toString()
        })

    }

    fun onSaveClick(name: String, translate: String){
        viewModel.addWord(name, translate)
    }


    override fun getLayoutId(): Int {
        return R.layout.fragment_new_word
    }
}