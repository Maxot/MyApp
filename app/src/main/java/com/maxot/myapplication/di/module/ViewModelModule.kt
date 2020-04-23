package com.maxot.myapplication.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.maxot.myapplication.di.ViewModelFactory
import com.maxot.myapplication.ui.activity.MainActivityViewModel
import com.maxot.myapplication.ui.fragment.MainFragmentViewModel
import com.maxot.myapplication.ui.fragment.SecondFragmentViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    internal abstract fun bindMainActivityViewModel(viewModel: MainActivityViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    internal abstract fun bindMainFragmentViewModel(viewModel: MainFragmentViewModel) : ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SecondFragmentViewModel::class)
    internal abstract fun bindSecondFragmentViewModel(viewModel: SecondFragmentViewModel) : ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}