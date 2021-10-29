fun sayHello(items: List<String>){
    for (item in items){
        println("Hello $item")
    }
}


fun main(){

//    Arrays
    val arr = arrayOf("Kotlin", "Java", "Pyhon");

    arr.forEachIndexed{index, language ->
        println("$language is at $index")
    }

//    List
    val list = listOf("Kotlin", "Java", "Pyhon")
    list.forEach{ language ->
        println(language)
    }

//    Map (Dict in python, JSON in JS)
    val map = mapOf("log" to "wood", "clay" to "brick", "sand" to "glass")
    map.forEach{ (product, outcome) ->
        println("$outcome is made of $product")
    }

//    Mutable map
    var kingdoms = mutableMapOf("nords" to "vikings", "swadians" to "english","khergits" to "mongolians")
    kingdoms["vegirs"] = "sweden";
    kingdoms.put("vegirs","sweden") // As a n alternative
//    kingdoms.remove("vegirs")
//    kingdoms.clear()
//    kingdoms.isEmpty()
    println(kingdoms)

//    Mutable lists
    val games = mutableListOf("Witcher 3","Mount and Blade")
    games.add("Miecraft")

    sayHello(list)



}