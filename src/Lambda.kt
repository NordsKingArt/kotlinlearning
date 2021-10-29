fun main(){

//    Lambda Function
    val printMessage = { message: String -> println(message)}
    printMessage("Hey Dude")



//    Lambda Function as a parameter
    fun downloadStuff(url : String, onComplete : () -> Unit){
//        Download stuff from url
        onComplete()
    }
    fun createKingdom(soldiers: Int, name: String, onCreate : (Kingdom) -> Unit){
        var kingdom = Kingdom(soldiers, name)
        onCreate(kingdom)
    }

    createKingdom(600, "Nord", onCreate = { kingdom -> println("Kingdom of $kingdom is created")})
    createKingdom(600, "Nord"){ kingdom -> println("Kingdom of $kingdom is created")} // Alternative





}