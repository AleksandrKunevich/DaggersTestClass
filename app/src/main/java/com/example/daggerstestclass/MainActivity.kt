package com.example.daggerstestclass

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerstestclass.models.User
import com.example.daggerstestclass.presentation.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user: User

    @Inject
    lateinit var viewModel: MainViewModel

    init {
        DaggerApplication.appComponent?.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        viewModel.userLiveData.observe(this) { user ->
            //  Toast.makeText(this@MainActivity, user.name, Toast.LENGTH_LONG).show()
        }
        Log.e("!!!!!", user.name)

        findViewById<Button>(R.id.saveButton).setOnClickListener {
//            saveString(STRING_KEY, "Hello PREFS!!!")
            viewModel.saveString(STRING_KEY, "Some value... ...")
        }

//        Toast.makeText(this@MainActivity, getSaveString(STRING_KEY), Toast.LENGTH_LONG).show()
        Toast.makeText(this@MainActivity, viewModel.getString(STRING_KEY), Toast.LENGTH_LONG).show()

        viewModel.news.observe(this) { news->
            Log.e("!!!!", news.toString())
        }
    }

    // ДЛя сохранения значений в файл - простой метод, Shared Preferences
    private val prefs: SharedPreferences by lazy {
        getSharedPreferences(
            SHARED_PREFS_NAME,
            MODE_PRIVATE
        )
    }

    private fun saveString(key: String, value: String) {
        prefs.edit()
            .putString(key, value)
            .apply()
    }

    private fun getSaveString(key: String): String {
        return prefs.getString(key, "Empty save....").orEmpty()
    }

    companion object {
        private const val SHARED_PREFS_NAME = "com.example.daggerstestclass.NAME"
        private const val STRING_KEY = "STRING_KEY"
    }
}