package com.example.userlist.model

import com.example.model.User
import org.junit.Assert
import org.junit.Test

class UserTest {
    @Test
    fun givenUserOneAndNull_WhenEquals_ShouldNotBeEqual() {
        val UserOne = User(name = "Pavan",mobileNumber = "9432567834")
        val UserTwo = null
        Assert.assertFalse(UserOne == UserTwo)

    }
}