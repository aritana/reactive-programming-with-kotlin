import java.util.Scanner
import kotlin.math.pow


fun main(args: Array<String>) {

    simpleSum()

}

fun areaOfCircle() {

    println("Enter the radius")
    val reader = Scanner(System.`in`)
    val pi = 3.14159
    val radius:Double = reader.nextDouble()

    val area = radius.pow(2.0) * pi
    val A = String.format("%.4f",area)
    print("A=$A")
    println()

}

fun simpleSum(){
    val reader = Scanner(System.`in`)
    val A:Int = reader.nextInt()
    val B:Int = reader.nextInt()
    val SOMA = A + B
    print("SOMA = $SOMA")
    println()
}