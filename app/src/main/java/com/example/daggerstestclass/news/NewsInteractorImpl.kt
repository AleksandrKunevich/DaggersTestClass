package com.example.daggerstestclass.news

import com.example.daggerstestclass.news.domain.News

class NewsInteractorImpl : NewsInteractor {
    override fun getNews(): List<News> {
        val savedNews = DataBaseSource.news
        val articles = NetworkSource.news

        val list1: List<News> = savedNews.map { dataBaseNews ->
            dataBaseNews.toNews()
        }

        val list2: List<News> = articles.map { networkNews ->
            networkNews.toNews()
        }

        val list3: MutableList<News> = mutableListOf()

        list2.forEach { item ->
            val newItem = list1.find { news ->
                item.title == news.title
            }
            list3.add(
                newItem ?: item
            )
//            if (newItem != null) {
//                list3.add(newItem)
//            } else {
//                list3.add(item)
//            }

        }
        return list3
    }
}