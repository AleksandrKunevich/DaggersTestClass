package com.example.daggerstestclass.news

import com.example.daggerstestclass.news.domain.News
import com.example.daggerstestclass.news.models.DataBaseNews
import com.example.daggerstestclass.news.models.NetworkNews

fun DataBaseNews.toNews(): News {
    return News(title, subtitle, true)
}

fun NetworkNews.toNews(): News {
    return News(title, subtitle, false)
}