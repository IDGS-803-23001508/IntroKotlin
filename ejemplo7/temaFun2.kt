fun mostrarPerimetro(lado: Int){
    val perimetro = lado * 4
    println("El perímetro es $perimetro")
}

fun mostrarSuperficie(lado: Int){
    val superficie = lado * lado
    println("La superficie es $superficie")
}

fun main(){
    print("Ingresa el valor del lado del cuadrado:")
    val la = readln().toInt()
    print("Quiere calcular el perímetro o la superficie[Ingresar texto: perimetro/superficie]:")
    var respuesta = readln()
    when(respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    }

}