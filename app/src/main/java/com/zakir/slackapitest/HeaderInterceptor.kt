package com.zakir.slackapitest

import android.content.Context
import com.zakir.slackapitest.di.ApplicationContext
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HeaderInterceptor @Inject constructor(@ApplicationContext private val context: Context) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        var accessToken = context.getString(R.string.access_token)
        var httpUrl = request.url().newBuilder().addQueryParameter("token", accessToken).build()
        return chain.proceed(request.newBuilder().url(httpUrl).build())
    }
}