var aprobados = 0
var suspensos = 0
var suficiente = 0
var bien = 0
var notable = 0
var sobresaliente = 0

fun main() {
    pedirNotas()
}
fun pedirNotas (): Int {
    var nota = 0
    do{
    println("Introduzca la nota: ")
    nota = readln().toIntOrNull()?:-1
    comprobarAprOSus(nota)
    } while (repetir())
    println("Hay $aprobados aprobados")
    println("Hay $suspensos suspensos")
    println("Hay $suficiente suficiente")
    println("Hay $bien bien")
    println("Hay $notable notable")
    println("Hay $sobresaliente sobresaliente")
    return nota
}
fun comprobarAprOSus (pedirNotas: Int) {
    if (pedirNotas >= 5){
        aprobados++
    } else {
        suspensos++
    }
    when (pedirNotas) {
        5-> suficiente += 1
        6-> bien += 1
        7-> notable += 1
        8-> notable += 1
        9-> sobresaliente += 1
        10-> sobresaliente += 1
    }
}