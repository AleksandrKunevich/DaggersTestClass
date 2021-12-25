package com.example.daggerstestclass.news

import com.example.daggerstestclass.news.domain.News

interface NewsInteractor {
    fun getNews(): List<News>
}