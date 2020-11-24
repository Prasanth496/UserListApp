package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataManagerImpl
import org.junit.Assert
import org.junit.Test

class UserDataManagerTest {
    // function test for create user
    @Test
    fun ShouldBeableToInsertOneUser() {
        val userDatamanager: UserDataManagerImpl = UserDataManagerImpl()
        val user = User("Pavan", mobileNumber = "9543216423")
        val userListSizeBeforeAdd = userDatamanager.readUsers().size
        Assert.assertTrue(userListSizeBeforeAdd + 1, userDatamanager.readUsers().size)

    }
    @Test
    fun ShouldBeableToInsertTwoUsers() {
        val userDatamanager: UserDataManagerImpl = UserDataManagerImpl()
        val userOne = User("Pavan", mobileNumber = "9543216423")
        val userTwo = User("Ravi", mobileNumber = "9645432532")
        val userListSizeBeforeAdd = userDatamanager.readUsers().size
        userDatamanager.insertUser(userOne)
        userDatamanager.insertUser(userTwo)
        Assert.assertEquals(userListSizeBeforeAdd + 2, userDatamanager.readUsers().size)

    }
}