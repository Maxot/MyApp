package com.maxot.myapplication.di.module

import com.maxot.myapplication.ui.activity.MainActivity
import com.maxot.myapplication.ui.fragment.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun contributeMainActivityInjector() : MainActivity

}