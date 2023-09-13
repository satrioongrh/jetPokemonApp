package com.example.jetpokedexapp.util

import androidx.compose.ui.graphics.Color
import com.example.jetpokedexapp.data.response.StatsItem
import com.example.jetpokedexapp.data.response.TypesItem
import com.example.jetpokedexapp.ui.theme.AtkColor
import com.example.jetpokedexapp.ui.theme.DefColor
import com.example.jetpokedexapp.ui.theme.HPColor
import com.example.jetpokedexapp.ui.theme.SpAtkColor
import com.example.jetpokedexapp.ui.theme.SpDefColor
import com.example.jetpokedexapp.ui.theme.SpdColor
import com.example.jetpokedexapp.ui.theme.TypeBug
import com.example.jetpokedexapp.ui.theme.TypeDark
import com.example.jetpokedexapp.ui.theme.TypeDragon
import com.example.jetpokedexapp.ui.theme.TypeElectric
import com.example.jetpokedexapp.ui.theme.TypeFairy
import com.example.jetpokedexapp.ui.theme.TypeFighting
import com.example.jetpokedexapp.ui.theme.TypeFire
import com.example.jetpokedexapp.ui.theme.TypeFlying
import com.example.jetpokedexapp.ui.theme.TypeGhost
import com.example.jetpokedexapp.ui.theme.TypeGrass
import com.example.jetpokedexapp.ui.theme.TypeGround
import com.example.jetpokedexapp.ui.theme.TypeIce
import com.example.jetpokedexapp.ui.theme.TypeNormal
import com.example.jetpokedexapp.ui.theme.TypePoison
import com.example.jetpokedexapp.ui.theme.TypePsychic
import com.example.jetpokedexapp.ui.theme.TypeRock
import com.example.jetpokedexapp.ui.theme.TypeSteel
import com.example.jetpokedexapp.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(type: TypesItem?): Color {
    return when(type?.type?.name?.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: StatsItem?): Color {
    return when(stat?.stat?.name?.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: StatsItem?): String {
    return when(stat?.stat?.name?.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}