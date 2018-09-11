package com.zakir.slackapitest.di.module

import com.google.gson.Gson
import com.zakir.slackapitest.HeaderInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [ContextModule::class])
class NetworkModule {

    @Singleton
    @Provides
    fun provideGson() : Gson  = Gson()

    @Singleton
    @Provides
    fun provideOkHttpClient(headerInterceptor: HeaderInterceptor) : OkHttpClient = OkHttpClient.Builder().addInterceptor(headerInterceptor).build()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson) : Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://slack.com/api/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson)).build()
    }

}