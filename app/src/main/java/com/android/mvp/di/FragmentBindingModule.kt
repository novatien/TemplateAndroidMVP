package com.android.mvp.di

import com.android.mvp.di.scopes.FragmentScoped
import com.android.mvp.scenes.example.main.MainLoginFragment
import com.android.mvp.scenes.example.main.MainLoginModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBindingModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = [MainLoginModule::class])
    abstract fun contributeMainLoginFragment(): MainLoginFragment
}
