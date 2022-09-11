
fun main(){
    synchronousCode()
}

fun synchronousCode(){
//The for block executes synchronously, and the collection is immutable form the outside world
// while you iterate over it

    var list = listOf(1,2,3)
    
    for (number in list){
        println(number)
        list = listOf(4,5,6)
    }
    println(list)
}

