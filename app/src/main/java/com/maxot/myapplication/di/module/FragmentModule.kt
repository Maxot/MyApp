package com.maxot.myapplication.di.module

import com.maxot.myapplication.ui.fragment.MainFragment
import com.maxot.myapplication.ui.fragment.SecondFragment
import com.maxot.myapplication.ui.newword.NewWordFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector()
    abstract fun contributeMainFragmentInjector() : MainFragment

    @ContributesAndroidInjector()
    abstract fun contributeSecondFragmentInjector() : SecondFragment

    @ContributesAndroidInjector()
    abstract fun contributeNewWordFragmentInjector() : NewWordFragment
}