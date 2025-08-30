package acuario

import comidas.Comida
import comidas.Pizza
import comidas.Ensalada
import comidas.Sopa


fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.Volumen = 70
    acuario7.imprimirTamano()
    val acuario8 = Acuario(largo= 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()
    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}
fun colorPez() {
    val pezpayaso = PezPayaso(color="Dorado")
    pezpayaso.colorPez()
    pezpayaso.comer()
    val tiburon = Tiburon(color="Gris")
    tiburon.colorPez()
    tiburon.comer()
}

fun crearComidas(): List<Comida> {
    val pizza = Pizza(nombre="Pepperoni")
    pizza.mostrarNombre()
    pizza.preparar()

    val ensalada = Ensalada(nombre="Rusa")
    ensalada.mostrarNombre()
    ensalada.preparar()

    val sopa = Sopa(nombre="Pollo")
    sopa.mostrarNombre()
    sopa.preparar()

    return listOf(pizza, ensalada, sopa)
}

fun main(){
    construirAcuario()
    colorPez()
    val comidas = crearComidas()

    println("\nResumen de comidas:")
    for (comida in comidas) {
        when (comida) {
            is Pizza -> println("- ${comida.nombre}: comida rápida popular")
            is Ensalada -> println("- ${comida.nombre}: opción saludable")
            is Sopa -> println("- ${comida.nombre}: buena para el frío")
            else -> println("- ${comida.nombre}: otro tipo de comida")
        }
    }

}

















