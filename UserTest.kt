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
        Assert.assertFalse(userOne == userTwo)

    }

   @Test
    // function for reference check
    fun givenSameUser_WhenEquals_ShouldBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9432567834")
        Assert.assertTrue(userOne.equals(userOne))
    }

    @Test
    // function for values are equal check
    fun givenUserOneAndUserTwoWithSameDetails_Whenequals_ShouldBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9432567834")
        val userTwo = User(name = "Pavan",mobileNumber = "9432567834")
        Assert.assertTrue(userOne.equals(userTwo))
    }

    @Test
    //function for value are not equal check
    fun givenUserOneAndUserTwoWithDifferentDetails_Whenequals_ShouldNotBeEqual() {
        val userOne = User(name = "Pavan",mobileNumber = "9432567834")
        val userTwo = User(name = "Ravi",mobileNumber = "9756523478")
        Assert.assertFalse(userOne.equals(userTwo))
    }
}