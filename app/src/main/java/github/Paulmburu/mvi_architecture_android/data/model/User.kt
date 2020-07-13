package github.Paulmburu.mvi_architecture_android.data.model

import com.squareup.moshi.Json

/*  
 *  Created by Paul Mburu on 7/13/20.
 */
data class User(
    @Json(name = "id")
    val id: Int = 0,

    @Json(name = "name")
    val name: String = "",

    @Json(name = "email")
    val email: String = "",

    @Json(name = "avatar")
    val avatar: String = ""
)