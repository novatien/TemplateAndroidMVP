package com.android.mvp.data.source.remote.service

enum class GrantType {
    REFRESH_TOKEN {
        override fun value() = "refresh_token"
    };

    abstract fun value(): String
}
