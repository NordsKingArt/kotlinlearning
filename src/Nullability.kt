fun main(){

    var name : String? = "Erik Redhead"

//    First method
    var length = 0
    if (name != null){
        length = name.length
    } else{
        length = -1
    }
    println(length)

//    Second method
    var l = if (name==null) -1 else name.length
    println(l)

//    Third method
    println(name?.length)

//    Fourth method - Elvis Operator
    var len = name?.length ?: -1

//    Fifth method - Force unwrapping. Only do it if you 100% sure that the variable is not null
    var _len = name!!.length



}