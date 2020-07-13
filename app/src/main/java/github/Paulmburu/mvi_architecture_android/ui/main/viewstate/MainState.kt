package github.Paulmburu.mvi_architecture_android.ui.main.viewstate

import github.Paulmburu.mvi_architecture_android.data.model.User

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Users( val user: List<User>) : MainState()
    data class Error( val error: String) : MainState()
}