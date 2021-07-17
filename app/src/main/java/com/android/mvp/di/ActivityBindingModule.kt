package com.android.mvp.di

import com.android.mvp.di.scopes.ActivityScoped
import com.android.mvp.scenes.example.LoginActivity
import com.android.mvp.scenes.example.LoginModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun contributeLoginActivity(): LoginActivity
}
