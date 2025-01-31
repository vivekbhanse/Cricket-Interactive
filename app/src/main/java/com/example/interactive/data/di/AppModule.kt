package com.example.interactive.data.di

import com.example.interactive.data.remote.ApiService

import com.example.interactive.data.remote.repository.MatchRepositoryImpl
import com.example.interactive.domain.repository.MatchRepository
import com.example.interactive.domain.usecases.GetMatchDetailsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiService(okHttpClient: OkHttpClient): ApiService {
        return Retrofit.Builder().baseUrl("https://demo.sportz.io/").client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create()).build().create()

    }

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY // Set desired logging level
        }
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient {
        return OkHttpClient.Builder().addInterceptor(loggingInterceptor)
//            .addInterceptor(RetryInterceptor(maxRetries = 3))
            .build()
    }

    @Provides
    @Singleton
    fun provideMatchRepository(apiService: ApiService): MatchRepository =
        MatchRepositoryImpl(apiService)

    @Provides
    @Singleton
    fun provideGetMatchDetailsUseCase(matchRepository: MatchRepository): GetMatchDetailsUseCase =
        GetMatchDetailsUseCase(matchRepository)
}