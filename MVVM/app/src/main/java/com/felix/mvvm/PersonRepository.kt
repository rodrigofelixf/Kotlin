package com.felix.mvvm

class PersonRepository {

    fun login(login: String, password: String):Boolean {
        return (login != "" || password != "")
    }
}