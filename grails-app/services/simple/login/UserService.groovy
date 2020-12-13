package simple.login

import grails.gorm.transactions.Transactional

@Transactional
class UserService {
    static User getByUsernameAndPassword(String username,String password){
        return User.findByUsernameAndPassword(username,password)
    }
    Long count(){
        return User.count()
    }

    def serviceMethod() {

    }
}
