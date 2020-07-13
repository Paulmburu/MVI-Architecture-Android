package github.Paulmburu.mvi_architecture_android.data.repository

import github.Paulmburu.mvi_architecture_android.data.api.ApiHelper

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}