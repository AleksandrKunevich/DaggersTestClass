package com.example.daggerstestclass.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggerstestclass.domain.GetUserInteractor
import com.example.daggerstestclass.models.User
import com.example.daggerstestclass.news.NewsInteractor
import com.example.daggerstestclass.news.domain.News
import com.example.daggerstestclass.preference.SharedPreferencesManager
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getUserInteractor: GetUserInteractor,
    private val sharedPreferenceManager: SharedPreferencesManager,
    newsInteractor: NewsInteractor
) : ViewModel() {
    val userLiveData: LiveData<User> get() = _userLiveData
    private val _userLiveData = MutableLiveData<User>()

    val news: LiveData<List<News>> get() = _news
    private val _news = MutableLiveData<List<News>>()

    init {
        _userLiveData.value = getUserInteractor.getUser()

        _news.value = newsInteractor.getNews()
    }

    fun saveString(key: String, value: String) {
        sharedPreferenceManager.saveString(key, value)
    }

    fun getString(key: String): String {
        return sharedPreferenceManager.getString(key)
    }
}