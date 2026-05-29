package oop_111394_KevinAlif.Week14

data class User(val name: String, val email: String, val age: int)

class UserManager {
    fun validateUser(user: User): Boolean{
    return user.email.contains("@") && user.age >= 18
    }

    fun saveUserToDatabase(user: User){
        println("INSERT INTO users VALUES ('${user.name}', '${user.email}')")
    }
    fun sendWelcomeEmail(user: User) {
        println("Sending Email to ${user.email}")
    }
    }
}