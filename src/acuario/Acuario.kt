package acuario

import kotlin.math.PI

open class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " + "Largo: $largo cm " + "Alto: $alto cm ")
        println("Volumen: $Volumen l Agua: $agua l (${agua/Volumen*100.0}% lleno)")
    }
    init {
        println("Inicializando acuario")
    }
    constructor(numeroDePeces: Int) : this() {
        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }
    open var Volumen: Int
        get() = ancho * alto * largo / 1000
        set(valor) {
            alto = (valor * 1000) / (ancho * largo)
        }
    open val forma = "rectángulo"
    open var agua: Double = 0.0
        get() = Volumen * 0.9
}

class TanqueTorre (override var alto: Int, var diametro: Int): Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var Volumen: Int
        get() = (ancho/2 * largo/2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho/2 * largo/2)).toInt()
        }
    override var agua = Volumen * 0.8
    override val forma = "cilindro"
}

















