package ru.sicampus.bootcamp2025.domain

import android.provider.ContactsContract.CommonDataKinds.Email

data class UserEntity (
    val id: String,
    val firstName: String,
    val secondName: String,
    val lastName: String,
    val email: String,
    val photoUrl: String,
)
