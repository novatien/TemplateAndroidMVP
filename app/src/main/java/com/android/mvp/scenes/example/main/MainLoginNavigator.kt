package com.android.mvp.scenes.example.main

import javax.inject.Inject

interface MainLoginNavigator

class MainLoginNavigatorImpl @Inject constructor(fragment: MainLoginFragment) : MainLoginNavigator
