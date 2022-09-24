import java.util.Scanner
import kotlin.math.pow


fun main(args: Array<String>) {

    average2()

}

fun areaOfCircle() {

    println("Enter the radius")
    val reader = Scanner(System.`in`)
    val pi = 3.14159
    val radius: Double = reader.nextDouble()

    val area = radius.pow(2.0) * pi
    val A = String.format("%.4f", area)
    print("A=$A")
    println()

}

fun simpleSum() {
    val reader = Scanner(System.`in`)
    val A: Int = reader.nextInt()
    val B: Int = reader.nextInt()
    val SOMA = A + B
    print("SOMA = $SOMA")
    println()
}

fun simpleProduct() {
    val reader = Scanner(System.`in`)
    val A: Int = reader.nextInt()
    val B: Int = reader.nextInt()
    val PROD = A * B
    print("PROD = $PROD")
    println()
}

fun average1() {
    val reader = Scanner(System.`in`)
    val A: Double = reader.nextDouble()
    val B: Double = reader.nextDouble()
    val MEDIA:Double = (A * 3.5 + B * 7.5)/(3.5 +7.5)
    print("MEDIA = ${String.format("%.5f", MEDIA)}")
    println()
}

fun average2() {
    val reader = Scanner(System.`in`)
    val A: Double = reader.nextDouble()
    val B: Double = reader.nextDouble()
    val C: Double = reader.nextDouble()
    val MEDIA: Double = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5)
    print("MEDIA = ${String.format("%.1f", MEDIA)}")
    println()
}