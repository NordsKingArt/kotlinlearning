open class Material(var title: String, var author: Int, var views: Int, var description: String){

}



class Mod (title: String, author: Int, views: Int, description: String, var downloads:Int): Material(title, author, views, description){
    override fun toString(): String {
        return "$title, $author, $description"
    }
}


fun main(){

    val mod = Mod("Mo' Bends",11,115, "This is a Mo' Bends mod",56);

    println(mod)


}