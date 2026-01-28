package classes

class PJ {
    val id: Int
    val nombre: String
    val titulo: String
    var psi: Int
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

    constructor(id: Int, nombre: String, titulo: String, psi: Int, atq: Int, def: Int){
        this.id = id
        this.nombre = nombre
        this.titulo = titulo
        this.psi = psi
        this.atq = atq
        this.def = def
        this.ki = 0
        this.clase = Clase.NINGUNA
        this.tipo = Tipo.NINGUNA
        this.rareza = Rareza.UR
        this.categorias = mutableListOf()
        this.links = mutableListOf()
        this.tecnicaEspecial = TecnicaEspecial()
        this.habilidadLider = HabilidadLider()
    }
}