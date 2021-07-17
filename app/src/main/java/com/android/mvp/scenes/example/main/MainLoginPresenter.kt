package com.android.mvp.scenes.example.main

import javax.inject.Inject

/**
 * Listens to user actions from the UI ({@link MainLoginFragment}), retrieves the data and updates
 * the UI as required.
 */
class MainLoginPresenterImpl @Inject constructor(
    private var view: MainLoginView?
) : MainLoginPresenter {


    override fun onStart() {
        // No-op
    }

    override fun onStop() {
        // No-op
    }

    override fun onDestroy() {
        view = null
    }
}
