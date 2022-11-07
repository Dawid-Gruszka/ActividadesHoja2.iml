fun main () {
    procesos(preguntarArray())

}

fun preguntarArray ():IntArray {
    println("Introduce el tamaño del array")
    val respuesta = readln().toInt()
    val numeros = IntArray(respuesta) {0}
    return numeros
}

fun procesos (preguntarArray:IntArray) {
    for (i in preguntarArray.indices) {
        println("Introduce un numero para almacenar")
        val numero = readln().toInt()
        preguntarArray[i] = numero
    }
    var mayor = 0
    for (i in preguntarArray.indices){
        if (preguntarArray[i] > mayor){
            mayor = preguntarArray[i]
        }
    }
    println("El numero mayor es $mayor")
}
