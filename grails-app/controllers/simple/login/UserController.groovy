package simple.login

class UserController {

    def index() { }
    def login() {
        //render "hello"
        String username =params.username
        String password =params.password
        def c_user =UserService.getByUsernameAndPassword(username,password)
        if(c_user){
            //User.executeUpdate("update user u set u.name='mohamed' where u.username='h1mza'")
            flash.succes="Bonjour "+c_user.getFullname()+" dans votre espace personel"
            session["user"]=c_user
            redirect(uri:'/')
        }
        else{
            flash.message="email ou mot de passe incorrect"
            redirect(action:'index', controller: "user")
        }

    }
    def logout(){
        session.invalidate()
        redirect(controller: "user")
    }
}
