/*La operacion de multiplicacion de a por b usando sumas */

fun main() {
    println("Ingrese el valor de a:")
    val a = readln().toInt()
    println("Ingrese el valor de b:")
    val b = readln().toInt()
    var resultado = 0
    var contador = 0
    while (contador < b) {
        resultado += a
        contador++
    }
    println("El resultado de $a x $b = $resultado")
}