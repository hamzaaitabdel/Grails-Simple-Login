package simple.login

class User {
    String username
    String password
    String fullname

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
        fullname nullable: false, blank: false
    }
//    static mapping = {
//        table 'user'
//        username column: 'username'
//        password column: 'password'
//        fullname column: 'fullname'
//    }
}
