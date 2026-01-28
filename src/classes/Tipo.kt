package classes

enum class Tipo {
    NINGUNA,
    AGL,
    TEQ,
    INT,
    STR,
    PHY;

    fun multiplicador(TipoOponente: Tipo): Double {
       return when(this){
            AGL -> {
                when(TipoOponente){
                    STR -> 1.5
                    TEQ -> 0.5
                    else -> 1.0
                }
            }

            TEQ -> {
                when(TipoOponente){
                    AGL -> 1.5
                    INT -> 0.5
                    else -> 1.0
                }
            }

            INT -> {
                when(TipoOponente){
                    TEQ -> 1.5
                    PHY -> 0.5
                    else -> 1.0
                }
            }

            STR -> {
                when(TipoOponente){
                    PHY -> 1.5
                    AGL -> 0.5
                    else -> 1.0
                }
            }

            PHY -> {
                when(TipoOponente){
                    INT -> 1.5
                    STR -> 0.5
                    else -> 1.0
                }
            }
            else -> 1.0
        }
    }

    override fun toString(): String {
        return when(this){
            AGL -> "[AGL] Agilidad"
            TEQ -> "[TEQ] Tecnica"
            INT -> "[INT] Inteligencia"
            STR -> "[STR] Fuerza"
            PHY -> "[PHY] Fisico"
            else -> "NINGUNO"
        }
    }
}