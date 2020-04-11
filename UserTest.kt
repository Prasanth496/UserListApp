package com.example.userlist.model

import com.example.model.User
import org.junit.Assert
import org.junit.Test

class UserTest {
    @Test
    // function for null check
    fun givenUserOneAndNull_WhenEquals_ShouldNotBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9432567834")
        val userTwo = null
        Assert.assertFalse(UserOne == UserTwo)

    }

    @Test
    // function for reference check
    fun givenSameUser_WhenEquals_ShouldBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9432567834")
        Assert.assertTrue(userOne.equals(userOne))

    }
}