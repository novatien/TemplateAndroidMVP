package com.android.mvp.scenes.example.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.mvp.R
import com.android.mvp.utils.Validator
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * MainLogin Screen.
 */
class MainLoginFragment : DaggerFragment(), MainLoginView {

    @Inject
    internal lateinit var mPresenter: MainLoginPresenter

    @Inject
    internal lateinit var mNavigator: MainLoginNavigator

    @Inject
    internal lateinit var mValidator: Validator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_login, container, false)
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
