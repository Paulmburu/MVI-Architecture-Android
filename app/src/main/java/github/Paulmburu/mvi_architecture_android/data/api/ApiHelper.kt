package github.Paulmburu.mvi_architecture_android.data.api

import github.Paulmburu.mvi_architecture_android.data.model.User

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
interface ApiHelper {
    suspend fun getUsers(): List<User>
}