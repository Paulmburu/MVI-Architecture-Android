package github.Paulmburu.mvi_architecture_android.data.api

import github.Paulmburu.mvi_architecture_android.data.model.User
import retrofit2.http.GET

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}