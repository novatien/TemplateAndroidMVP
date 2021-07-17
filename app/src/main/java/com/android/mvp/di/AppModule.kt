package com.android.mvp.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.android.mvp.data.source.local.room.NameAppLocalDatabase
import com.android.mvp.data.source.local.sharedprf.SharedPrefsApi
import com.android.mvp.data.source.local.sharedprf.SharedPrefsImpl
import com.android.mvp.di.scopes.AppScoped
import com.android.mvp.utils.Validator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [AppModule.AppAbstractModule::class])
class AppModule {

    @AppScoped
    @Provides
    fun provideRoomDatabase(context: Context): NameAppLocalDatabase {
        return Room.databaseBuilder(context, NameAppLocalDatabase::class.java, NAME_APP_DB).build()
    }

    @AppScoped
    @Provides
    fun provideValidator(context: Context): Validator {
        return Validator(context)
    }

    @Module
    interface AppAbstractModule {
        @AppScoped
        @Binds
        fun bindApplicationContext(application: Application): Context

        @AppScoped
        @Binds
        fun bindSharedPreference(sharedPrefs: SharedPrefsImpl): SharedPrefsApi
    }

    companion object {
        private const val NAME_APP_DB = "nameapp.db"
    }
}
