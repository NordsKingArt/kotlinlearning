class Kingdom (val defenders: Int, val name: String)

fun main(args: Array<String>){
    val swadia = Kingdom(450,"Swadia")
    println("${swadia.name} has ${swadia.defenders} defenders")
}