package com.android.mvp.di

import android.app.Application
import com.android.mvp.MainApplication
import com.android.mvp.di.scopes.AppScoped
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScoped
@Component(
    modules = [AppModule::class, ActivityBindingModule::class, FragmentBindingModule::class,
        AndroidSupportInjectionModule::class]

)
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
