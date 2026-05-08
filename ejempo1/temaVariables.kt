fun main(){
    val saludo: String = "Hola"
    val nombre: String = "Kotlin"
    println("$saludo $nombre")
    
    //lectura de datos por consola
    println("Ingresa primer numero")
    val num1 = readln().toInt()
    println("Ingresa primer numero")
    val num2 = readln().toInt()

    var res = num1 + num2
    println("La suma es: $res")
}