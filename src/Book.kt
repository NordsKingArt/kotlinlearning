interface BookInfoProvider {
    fun giveInfo(): String
}



class Book(var bookTitle:String = "Jeff",val ISBN:String = "B123124456"): BookInfoProvider{
    var pages:String? = null

    override fun giveInfo(): String{
        return "$bookTitle $ISBN $pages"
    }
}


fun main(){
    val book: Book = Book()
    println(book.giveInfo())

}