package repositorios
import repositorios.CategoriasRepo
import classes.Clase
import classes.PJ
import classes.Tipo

object personajesRepo {
    val STR_GOKU_KAIOKEN = PJ(
        1,
        "Goku (Kaioken)",
        "Battle Against Limits",
        16138,18295,12188,
        Tipo.STR, Clase.SUPER
    ).apply {
        categorias.addAll(listOf(
            CategoriasRepo.ALL_OUT_STRUGGLE,
            CategoriasRepo.FINAL_TRUMP_CARD,
            CategoriasRepo.PURE_SAIYANS,
            CategoriasRepo.FULL_POWER,
            CategoriasRepo.GOKUS_FAMILY,
            CategoriasRepo.TURTLE_SCHOOL,
            CategoriasRepo.BOND_OF_FRIENDSHIP,
            CategoriasRepo.ACCELERATED_BATTLE,
            CategoriasRepo.BATTLE_OF_FATE,
            CategoriasRepo.KAMEHAMEHA,
            CategoriasRepo.SAIYAN_SAGA,
            CategoriasRepo.BOND_OF_PARENT_AND_CHILD,
            CategoriasRepo.EARTH_BRED_FIGHTERS,
            CategoriasRepo.POWER_OF_WISHES,
            CategoriasRepo.EARTH_PROTECTING_HEROES
        ))
    }

    val TEQ_VEGETA_GIANT_APE = PJ(
        2,
        "Vegeta (Giant Ape)",
        "Furious Last Resort",
        19963,17445,11338,
        Tipo.TEQ, Clase.EXTREMO
    ).apply {
        categorias.addAll(listOf(
            CategoriasRepo.INHUMAN_DEEDS,
            CategoriasRepo.GIANT_APE_POWER,
            CategoriasRepo.PURE_SAIYANS,
            CategoriasRepo.DRAGON_BALL_SEEKERS,
            CategoriasRepo.VEGETAS_FAMILY,
            CategoriasRepo.TERRIFYING_CONQUERORS,
            CategoriasRepo.SPACE_TRAVELING_WARRIORS,
            CategoriasRepo.GIFTED_WARRIORS,
            CategoriasRepo.PLANETARY_DESTRUCTION,
            CategoriasRepo.ACCELERATED_BATTLE,
            CategoriasRepo.BATTLE_OF_FATE,
            CategoriasRepo.GIANT_FORM,
            CategoriasRepo.FINAL_TRUMP_CARD,
            CategoriasRepo.SAIYAN_SAGA,
            CategoriasRepo.SUCCESSORS
        ))
    }

    val PHY_SUPER_SAIYAN_2_GOHAN_YOUTH = PJ(
        3,
        "Super Saiyan 2 Gohan (Youth)",
        "Fighter Entrusted with Fate",
        20175,17700,10913,
        Tipo.PHY, Clase.SUPER
    ).apply{
        categorias.addAll(listOf(
            CategoriasRepo.FULL_POWER,
            CategoriasRepo.HYBRID_SAIYANS,
            CategoriasRepo.GOKUS_FAMILY,
            CategoriasRepo.YOUTH,
            CategoriasRepo.ANDROIDS_CELL_SAGA,
            CategoriasRepo.BOND_OF_MASTER_AND_DISCIPLE,
            CategoriasRepo.SUPER_SAIYAN_2,
            CategoriasRepo.EXPLODING_RAGE,
            CategoriasRepo.ALL_OUT_STRUGGLE,
            CategoriasRepo.ENTRUSTED_WILL,
            CategoriasRepo.MIRACULOUS_AWAKENING,
            CategoriasRepo.BATTLE_OF_FATE,
            CategoriasRepo.POWER_BEYOND_SUPER_SAIYAN,
            CategoriasRepo.BOND_OF_PARENT_AND_CHILD,
            CategoriasRepo.EARTH_BRED_FIGHTERS,
            CategoriasRepo.TOURNAMENT_PARTICIPANTS,
            CategoriasRepo.DEMONIC_POWER,
            CategoriasRepo.EARTH_PROTECTING_HEROES,
            CategoriasRepo.TRANSFORMATION_BOOST,
            CategoriasRepo.KAMEHAMEHA
            ))
    }

    val INT_SUPER_SAIYAN_GOKU_NAMEK = PJ(
        4,
        "Super Saiyan Goku",
        "Strike of Full Anger",
        18300,16500,12000,
        Tipo.INT, Clase.SUPER
    ).apply {
        categorias.addAll(listOf(
            CategoriasRepo.LEGENDARY_EXSISTENCE,
            CategoriasRepo.PLANET_NAMEK_SAGA,
            CategoriasRepo.PURE_SAIYANS,
            CategoriasRepo.GOKUS_FAMILY,
            CategoriasRepo.SUPER_SAIYANS,
            CategoriasRepo.KAMEHAMEHA,
            CategoriasRepo.EXPLODING_RAGE,
            CategoriasRepo.SAVIORS,
            CategoriasRepo.TURTLE_SCHOOL,
            CategoriasRepo.MIRACULOUS_AWAKENING,
            CategoriasRepo.POWERFUL_COMEBACK,
            CategoriasRepo.FULL_POWER,
            CategoriasRepo.BOND_OF_FRIENDSHIP,
            CategoriasRepo.ENTRUSTED_WILL,
            CategoriasRepo.BATTLE_OF_FATE,
            CategoriasRepo.BOND_OF_PARENT_AND_CHILD,
            CategoriasRepo.EARTH_BRED_FIGHTERS
        ))
    }

    val AGL_FRIEZA_FULL_POWER = PJ(
        5,
        "Frieza (Full Power)",
        "Roar of Resentment",
        20175,17785,10806,
        Tipo.AGL, Clase.EXTREMO
    ).apply {
        categorias.addAll(listOf(
            CategoriasRepo.SWORN_ENEMIES,
            CategoriasRepo.PLANET_NAMEK_SAGA,
            CategoriasRepo.FULL_POWER,
            CategoriasRepo.TRANSFORMATION_BOOST,
            CategoriasRepo.WICKED_BLOODLINE,
            CategoriasRepo.TERRIFYING_CONQUERORS,
            CategoriasRepo.FINAL_TRUMP_CARD,
            CategoriasRepo.EXPLODING_RAGE,
            CategoriasRepo.INHUMAN_DEEDS,
            CategoriasRepo.SPACE_TRAVELING_WARRIORS,
            CategoriasRepo.GIFTED_WARRIORS,
            CategoriasRepo.PLANETARY_DESTRUCTION,
            CategoriasRepo.BATTLE_OF_FATE,
            CategoriasRepo.SUCCESSORS
        ))
    }

    val AGL_GOKU_ULTRA_INSTINCT = PJ(
        6,
        "Goku (Ultra Instinct)",
        "True Ultra Instinct",
        19750,17700,11125,
        Tipo.AGL, Clase.SUPER
    ).apply {
        categorias.addAll(listOf(
            CategoriasRepo.MIRACULOUS_AWAKENING,
            CategoriasRepo.REPRESENTATIVES_OF_UNIVERSE_7,
            CategoriasRepo.REALM_OF_GODS,
            CategoriasRepo.PURE_SAIYANS,
            CategoriasRepo.UNIVERSE_SURVIVAL_SAGA,
            CategoriasRepo.GOKUS_FAMILY,
            CategoriasRepo.TURTLE_SCHOOL,
            CategoriasRepo.POWERFUL_COMEBACK,
            CategoriasRepo.KAMEHAMEHA,
            CategoriasRepo.LEGENDARY_EXSISTENCE,
            CategoriasRepo.BOND_OF_FRIENDSHIP,
            CategoriasRepo.ACCELERATED_BATTLE,
            CategoriasRepo.ENTRUSTED_WILL,
            CategoriasRepo.BATTLE_OF_FATE,
            CategoriasRepo.BOND_OF_PARENT_AND_CHILD,
            CategoriasRepo.EARTH_BRED_FIGHTERS,
            CategoriasRepo.SUPER_HEROES,
            CategoriasRepo.TOURNAMENT_PARTICIPANTS
        ))
    }

    val listaPersonajes = listOf(
        STR_GOKU_KAIOKEN,
        TEQ_VEGETA_GIANT_APE,
        PHY_SUPER_SAIYAN_2_GOHAN_YOUTH,
        INT_SUPER_SAIYAN_GOKU_NAMEK,
        AGL_FRIEZA_FULL_POWER,
        AGL_GOKU_ULTRA_INSTINCT
    )

}