package simple.login

class RegisterController {

    def index() { }
    def register(){
        def username = params.username
        def fullname = params.fullname
        def password = params.password
        print(username +" "+fullname+" "+password)
        def user = new User(username: username, password: password, fullname: fullname)
        user.save()
        //render(user.getUsername())
        redirect(controller: "user")
    }
}
