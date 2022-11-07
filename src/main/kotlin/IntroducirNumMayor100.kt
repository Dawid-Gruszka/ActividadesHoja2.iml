fun main () {
    pedirNumero()
}
fun pedirNumero () {

    do {
    println("Introduzca un numero mayor a 100")
    val numero = readln().toInt()
        println("El numero introducido es $numero")
    } while (numero <= 100)

}
