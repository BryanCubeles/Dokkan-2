package classes

enum class Rareza {
    N,
    R,
    SR,
    SSR,
    UR,
    LR;
    override fun toString(): String {
        return when(this) {
            N -> "Rareza: Normal(N)"
            R -> "Rareza: Rara(R)"
            SR -> "Rareza: Super Rara(SR)"
            SSR -> "Rareza: Super Super Rara(SSR)"
            UR -> "Rareza: Ultra Rara(UR)"
            LR -> "Rareza: Legendaria(LR)"
        }
    }

}