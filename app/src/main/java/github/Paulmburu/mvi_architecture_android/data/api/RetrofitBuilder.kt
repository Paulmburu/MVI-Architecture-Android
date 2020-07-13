package github.Paulmburu.mvi_architecture_android.data.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
object RetrofitBuilder {

    private const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()


    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}