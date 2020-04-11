package com.example.userlist.model

import com.example.model.User
import com.example.model.UserDataManager
import org.junit.Test

class UserDataManagerTest {
    @Test
    fun ShouldBeableToCreateOneUser() {
        val userDatamanager = UserDataManager()
        val user = User("Pavan",mobileNumber = "9543216423")
        userDatamanager.create(user)
    }

}