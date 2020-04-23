package com.maxot.myapplication.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.maxot.myapplication.MyApplication
import com.maxot.myapplication.R
import com.maxot.myapplication.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity: BaseActivity<ActivityMainBinding>() {
//    @Inject
//    lateinit var androidInjector: DispatchingAndroidInjector<Any>
//    lateinit var mainCompnent: MainComponent

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<MainActivityViewModel> { viewModelFactory }


    lateinit var navController: NavController
//    @Inject
//    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
//        (application as MyApplication).appComponent.inject(this)
//        mainCompnent = (application as MyApplication).appComponent.mainComponent().create()
//        mainCompnent.inject(this)
//        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)

//        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)


        navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(navController.graph, drawer)
        toolbar.setupWithNavController(navController, appBarConfiguration)
        nav_view.setupWithNavController(navController)

    }

//    override fun androidInjector(): AndroidInjector<Any> {
//        return androidInjector
//    }
}