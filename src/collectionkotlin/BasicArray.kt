package collectionkotlin

fun main(args: Array<String>) {
    var myArray:IntArray= intArrayOf(23,3,4,43,23,2,4,7,8,0,5)
    println(myArray.last())
    println(".................")
    for (element in myArray){
        println(element)
    }
}