package com.example.daggerstestclass.news

import com.example.daggerstestclass.news.models.DataBaseNews

object DataBaseSource {
    val news: List<DataBaseNews> = listOf(
        DataBaseNews(
            title = "title1",
            subtitle = "subtitle1"
        ),
        DataBaseNews(
            title = "title5",
            subtitle = "subtitle1"
        )
    )
}