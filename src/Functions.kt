fun greet(vararg people:String): Unit{
    print("Hello")
    people.forEach { person ->
        print(" $person")
    }
    println("!")
}

fun main(){
    greet("Jaker","Amir","Aking","Sparrow","John","Erik","Jarban")
}