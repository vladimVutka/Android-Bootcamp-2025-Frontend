package ru.sicampus.bootcamp2025.data.list

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
class UserDto (
    @SerialName("id")
    val id: String?,
    @SerialName("firstName")
    val firlstName: String?,
    @SerialName("SecondName")
    val secondName: String?,
    @SerialName("LastName")
    val lastName: String?,
    @SerialName("email")
    val email: String?,
    @SerialName("photoUrl")
    val photoUrl: String?,)
{


}
