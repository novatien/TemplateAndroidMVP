package com.android.mvp.scenes.example

import android.os.Bundle
import com.android.mvp.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Login Scene
 */
class LoginActivity : DaggerAppCompatActivity(), LoginView {

    @Inject
    internal lateinit var mPresenter: LoginPresenter
    @Inject
    internal lateinit var mNavigator: LoginNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val s= "wfhwf"
        s.substring(0..5)
    }

    override fun onStart() {
        super.onStart()
        mPresenter.onStart()
    }

    override fun onStop() {
        mPresenter.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        mPresenter.onDestroy()
        super.onDestroy()
    }
}
