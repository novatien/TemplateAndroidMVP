package com.android.mvp.scenes.example

import com.android.mvp.scenes.BaseNavigator
import javax.inject.Inject

interface LoginNavigator

class LoginNavigatorImpl @Inject constructor(activity: LoginActivity) : BaseNavigator(activity),
    LoginNavigator
