package com.example.daggerstestclass.news

import com.example.daggerstestclass.news.models.NetworkNews

object NetworkSource {
    val news: List<NetworkNews> = listOf(
        NetworkNews(
            title = "title1",
            subtitle = "subtitle1"
        ),
        NetworkNews(
            title = "title2",
            subtitle = "subtitle1"
        ),
        NetworkNews(
            title = "title3",
            subtitle = "subtitle1"
        ),
        NetworkNews(
            title = "title4",
            subtitle = "subtitle1"
        ),
        NetworkNews(
            title = "title5",
            subtitle = "subtitle1"
        )
    )
}