package com.android.mvp.repositories

import com.android.mvp.data.model.Token
import com.android.mvp.data.source.remote.service.RestfulApi
import io.reactivex.Single
import javax.inject.Inject

interface UserRepository {
    fun login(email: String, password: String): Single<Token>
}

class UserRepositoryImpl @Inject constructor(
    private val api: RestfulApi
) : UserRepository {
    override fun login(email: String, password: String): Single<Token> {
        return api.loginWithEmailAndPassword(email, password)
    }
}
