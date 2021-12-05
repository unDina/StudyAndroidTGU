package com.dina.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "testНаша мама\nПопросила\nТри минуты тишины!")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Неужели\nНашей\nмаме")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Больше дети не нужны?!")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Вот и всё -\nНикто не скачет")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Ни борьбы,\nНи кутерьмы")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Только кто-то\nГорько плачет!\nМама,слышишь?\nЭто мы!)
    }
}