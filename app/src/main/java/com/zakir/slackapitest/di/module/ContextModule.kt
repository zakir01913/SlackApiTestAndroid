package com.zakir.slackapitest.di.module

import android.content.Context
import com.zakir.slackapitest.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(_context: Context) {

    private val context: Context = _context.applicationContext

    @Provides
    @Singleton
    @ApplicationContext
    fun context() = context
}