package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataManager
import org.junit.Assert
import org.junit.Test

class UserDataManagerTest {
    @Test
    // function test for create user
    fun ShouldBeableToCreateOneUser() {
        val userDatamanager = UserDataManager()
        val user = User("Pavan",mobileNumber = "9543216423")
        userDatamanager.create(user)
    }

    @Test
    // function test for add user
    fun ShouldBeableToAddOneUser() {
        val userDatamanager = UserDataManager()
        val user = User("Pavan",mobileNumber = "9543216423")
        userDatamanager.add(user)
    }

    @Test
    // function test for delete user
    fun ShouldBeAbleToDeleteUser() {
        val userDatamanager = UserDataManager()
        val user = User("Pavan",mobileNumber = "9543216423")
        userDatamanager.delete(user)
    }

    @Test
    // function test for display user
    fun ShouldBeAbleToDisplayUser() {
        val userDatamanager = UserDataManager()
        val user = User("Pavan",mobileNumber = "9543216423")
        userDatamanager.display(user)
    }
}