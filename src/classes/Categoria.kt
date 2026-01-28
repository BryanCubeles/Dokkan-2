package classes

class Categoria{
    val id: Int
    val nombre: String

    constructor(nombre: String, id: Int){
        this.nombre = nombre
        this.id = id
    }

    override fun toString(): String {
        return "Categoria(nombre='$nombre', id=$id)"
    }
}

