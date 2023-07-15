package com.example.retrofit_demo.domain.item

import com.example.retrofit_demo.data.remoteData.model.GamesModel

data class GameItem (

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String,
)

fun GamesModel.toGameItem() = GameItem(id, title, thumbnail, short_description)