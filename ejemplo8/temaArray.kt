fun main(parametro: Array<String>){
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elementos por teclado
    for(i in 0..4){
        print("Ingrese el sueldo:")
        sueldos[i] = readln().toInt()
    }
    //Impresion de sus elementos
    for(i in 0..4){
        println(sueldos[i])
    }

}