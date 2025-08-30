package acuario

interface AccionPez {
    fun comer()
}

open class Pez(open var color: String) {
    open fun colorPez() {
        println(color)
    }
    init {
        println("Descubriendo Colores")
    }
}

class Tiburon(override var color: String) : Pez(color), AccionPez {
    override fun colorPez() {
        println("El Tiburón es de color: $color")
    }

    override fun comer() {
        println("El Tiburón prefiere cazar y comer peces")
    }
}

class PezPayaso(override var color: String) : Pez(color), AccionPez {
    override fun colorPez() {
        println("El Pez Payaso es de color: $color")
    }

    override fun comer() {
        println("El Pez Payaso se alimenta de algas")
    }
}
















