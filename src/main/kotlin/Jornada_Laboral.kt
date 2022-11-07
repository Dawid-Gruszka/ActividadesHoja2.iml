const val TARIFA_DIURNA = 20
const val TARIFA_NOCTURNA = 35
const val TARIFA_ESPECIAL_DIRUNA = 10
const val TARIFA_ESPECIAL_NOCTURNA = 15

fun main () {
    var turno = ""
    var horas = 0
    var dia = ""
    dia = pregunar_dia()
    turno = pregunar_turno()
    horas = pregunar_horas()
    println(calcular_salario(dia,turno,horas))


}

fun calcular_salario(dia: String,turno: String,horas: Int): Double {
    var salario = 0.0
    when (turno) {
        "diurno" -> {
            when (dia) {
                "domingo" -> salario = horas * (TARIFA_DIURNA + TARIFA_ESPECIAL_DIRUNA).toDouble()
                else -> salario = horas * (TARIFA_DIURNA).toDouble()
            }
        }
        "nocturno" -> {
            when (dia) {
                "domingo" -> salario = horas * (TARIFA_NOCTURNA + TARIFA_ESPECIAL_NOCTURNA).toDouble()
                else -> salario = horas * (TARIFA_NOCTURNA).toDouble()
            }
        }
    }
return salario
}


fun pregunar_turno(): String {
    var turno = ""
    do {
        println("Ingrese el turno: ")
        turno = readln()
        if (turno != "diurno" && turno != "nocturno") {
            println("Introduce un turno correcto")
        }
    } while (turno != "diurno" && turno != "nocturno")
    return turno
}

fun pregunar_horas(): Int {
    var horas = 0
    do {
        println("¿Cuantas horas has realizado?")
        horas = readln().toInt()
        if (horas < 0) {
            println("Intruduzca un numero válido")
        }
    } while (horas < 0)
    return horas
}

fun pregunar_dia(): String {
    var dia = ""
    do {
        println("Ingrese el dia: ")
        dia = readln()
        if (dia !="lunes" && dia !="martes" && dia !="miercoles" && dia !="jueves" && dia !="viernes" && dia !="sabado" && dia !="domingo")
            println("Introduzca correctamente el dia")
    } while (dia !="lunes" && dia !="martes" && dia !="miercoles" && dia !="jueves" && dia !="viernes" && dia !="sabado" && dia !="domingo")
return dia
}