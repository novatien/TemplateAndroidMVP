package com.android.mvp.data.source.remote

import com.android.mvp.data.source.local.sharedprf.SharedPrefsApi
import com.android.mvp.data.source.remote.api.middleware.InterceptorImpl
import com.android.mvp.data.source.remote.service.RestfulApi
import com.android.mvp.repositories.TokenRepository
import com.android.mvp.repositories.TokenRepositoryImpl
import com.android.mvp.repositories.UserRepository
import com.android.mvp.repositories.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [RepositoryModule.RepositoryAbstractModule::class])
class RepositoryModule {

    @Provides
    fun provideTokenRepository(sharedPrf: SharedPrefsApi, api: RestfulApi): TokenRepository {
        val tokenRepository = TokenRepositoryImpl(sharedPrf, api)
        InterceptorImpl.instance.setTokenRepository(tokenRepository)
        return tokenRepository
    }

    @Module
    interface RepositoryAbstractModule {
        @Binds
        fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository
    }
}
