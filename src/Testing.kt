fun main(){

    val str = "Hey dude hor r u"

    println(str == "Hey dude hor r u")
    println(str.contains("hey", true))

    println(str.subSequence(0,2))

    val sample = SampleClass(lectures = 2134, hours = 12)


    val gpa: Float = 4.5F
    when(gpa){
        2F -> println("Thats shit gpa")
        3F -> println("Not bad")
        4F -> println("Thats ok")
        4.5F -> println("Great")
    }


}