package com.maxot.myapplication.di.component

import android.content.Context
import com.maxot.myapplication.MyApplication
import com.maxot.myapplication.di.module.ActivityModule
import com.maxot.myapplication.di.module.AppModule
import com.maxot.myapplication.di.module.RoomModule
import com.maxot.myapplication.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
//Old version
//@Singleton
//@Component(modules = [AppSubcomponents::class])
//interface AppComponent {
//
//    @Component.Factory
//        interface Factory {
//            fun create(@BindsInstance context: Context) : AppComponent
//    }
//
//    fun mainComponent() : MainComponent.Factory
//
//}

@Singleton
@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class, ActivityModule::class, ViewModelModule::class, RoomModule::class])
interface AppComponent : AndroidInjector<MyApplication>{

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}