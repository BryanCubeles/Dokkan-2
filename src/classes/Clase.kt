package classes

enum class Clase {
    SUPER,
    EXTREMO,
    NINGUNA;
    override fun toString(): String {
        return when(this){
            SUPER -> "Personaje de clase Super"
            EXTREMO -> "Personaje de clase Extremo"
            NINGUNA -> "Personaje sin clase asignada"
        }
    }

}