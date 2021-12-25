package com.example.daggerstestclass.news.domain

data class News(
    val title: String,
    val subtitle: String,
    val isChecked: Boolean
){
    override fun toString(): String {
        return super.toString()
    }
}