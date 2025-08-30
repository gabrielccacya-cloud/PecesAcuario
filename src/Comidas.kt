package comidas

interface AccionComida {
    fun preparar()
}
open class Comida(open var nombre: String) {
    open fun mostrarNombre() {
        println("Comida: $nombre")
    }
    init {
        println("Nueva comida registrada")
    }
}
class Pizza(override var nombre: String) : Comida(nombre), AccionComida {
    override fun mostrarNombre() {
        println("Pizza: $nombre")
    }
    override fun preparar() {
        println("Hornear la masa y agregar ingredientes")
    }
}
class Ensalada(override var nombre: String) : Comida(nombre), AccionComida {
    override fun mostrarNombre() {
        println("Ensalada: $nombre")
    }
    override fun preparar() {
        println("Lavar y mezclar verduras frescas")
    }
}
class Sopa(override var nombre: String) : Comida(nombre), AccionComida {
    override fun mostrarNombre() {
        println("Sopa: $nombre")
    }
    override fun preparar() {
        println("Hervir agua y añadir ingredientes")
    }
}
