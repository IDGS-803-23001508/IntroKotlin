/*La distancia entro dos puntos*/
import kotlin.math.*

fun main() {
    println("Ingrese la coordenada x del primer punto:")
    val x1 = readln().toDouble()
    println("Ingrese la coordenada y del primer punto:")
    val y1 = readln().toDouble()
    println("Ingrese la coordenada x del segundo punto:")
    val x2 = readln().toDouble()
    println("Ingrese la coordenada y del segundo punto:")
    val y2 = readln().toDouble()

    val distancia = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("La distancia entre ($x1, $y1) y ($x2, $y2) es: $distancia")
}
