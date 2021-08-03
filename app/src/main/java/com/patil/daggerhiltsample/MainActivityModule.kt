package com.patil.daggerhiltsample

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainActivityModule {

    @ActivityScoped
    @Provides
    @Named("str1")
    fun provideTestString1(@ApplicationContext context:Context,@Named("str") str:String)= "${context.getString(R.string.string_to_inject)} - $str"
}