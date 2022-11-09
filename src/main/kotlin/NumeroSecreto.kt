fun main () {
 acertar(numeroAleatorio())
}

fun numeroAleatorio(): Int {
    val numMin = 1
    val numMax = 100
    return (numMin .. numMax).random()
}

fun preguntarIntentos(): Int {
    println("¿Cuantos Intentos quieres?")
    return readln().toInt()
}

fun acertar (numeroAleatorio: Int) {
    do {
    var intentos = 0
    val intentosMax = preguntarIntentos()
    var salir = false
        do {
            intentos++

            println("¿Cual crees que es el numero?")
            var respuesta = readln().toIntOrNull()?: -1

            if (respuesta == numeroAleatorio) {
                println("¡¡Acertates!! en $intentos intentos")
                salir = true
             } else if (respuesta < numeroAleatorio) {
                println("¡¡Casi!! el numero tiene que ser mas alto")
             } else {
                println("¡¡Casi!! el numero tiene que ser mas pequeño")
             }
        } while (intentos < intentosMax && salir == false)
        println("¿Quieres volver a jugar?")
        var respuesta = readln().toBoolean()
    } while (respuesta == true)
    println("¡Gracias por jugar!")
}