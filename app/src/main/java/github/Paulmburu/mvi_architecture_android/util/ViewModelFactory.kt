package github.Paulmburu.mvi_architecture_android.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import github.Paulmburu.mvi_architecture_android.data.api.ApiHelper
import github.Paulmburu.mvi_architecture_android.data.repository.MainRepository
import github.Paulmburu.mvi_architecture_android.ui.main.viewmodel.MainViewModel

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}