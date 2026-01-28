package classes

class PJ {
    val id: Int
    val nombre: String
    val titulo: String
    var ps: Int
    var atq: Int
    var def: Int
    var ki: Int
    var clase: Clase
    var tipo: Tipo
    var rareza: Rareza
    val categorias: MutableList<Categoria>
    val links: MutableList<Link>
    var tecnicaEspecial: TecnicaEspecial
    var habilidadLider: HabilidadLider

    constructor(id: Int, nombre: String, titulo: String, ps: Int, atq: Int, def: Int, tipo: Tipo, clase: Clase) {
        this.id = id
        this.nombre = nombre
        this.titulo = titulo
        this.ps = ps
        this.atq = atq
        this.def = def
        this.ki = 0
        this.clase = clase
        this.tipo = tipo
        this.rareza = Rareza.UR
        this.categorias = mutableListOf()
        this.links = mutableListOf()
        this.tecnicaEspecial = TecnicaEspecial()
        this.habilidadLider = HabilidadLider()
    }
}