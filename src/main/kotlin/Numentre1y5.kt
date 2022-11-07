fun main () {
    numEntre()
}

fun numEntre () {

    do {
        println("Introduzca un numero entre 1 y 5: ")
        val numero = readln().toInt()
        println(numero)
    } while (numero < 1 || numero > 5)


}
