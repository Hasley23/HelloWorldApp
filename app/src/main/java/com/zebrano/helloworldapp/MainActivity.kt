package com.zebrano.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Функция показа тостов
    private fun showToast(string: String) {
        // Toast (всплывающее сообщение)
        val toastDuration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext,  string, toastDuration)
        toast.show()
    }

    // Вызвать суперкласс до кода
    override fun onCreate(savedInstanceState: Bundle?) {
        // запуск нового кода в добавление к существующему
        super.onCreate(savedInstanceState)
        // savedInstanceState - сохраненное состояние необходимых ресурсов
        setContentView(R.layout.activity_main) // выдвинуть активити на передний план
        val btn = findViewById<Button>(R.id.act)

        val img = findViewById<ImageView>(R.id.imageView23)

        btn.setOnClickListener {
            if (img.visibility == View.INVISIBLE){
                img.visibility = View.VISIBLE
                showToast("Nyan FEVER!!!")
            } else {
                img.visibility = View.INVISIBLE
                showToast("Calm down...")
            }

            Log.d("HelloWorldAppLog", "Button pushed!")

        }

        Log.d("HelloWorldAppLog", "OnCreate()!")

        //showToast("onCreate()")
    }

    fun tvClick(view : View){
        Log.d("HelloWorldAppLog", "TextView pushed!")
    }

    override fun onStart() {
        super.onStart()

        Log.d("HelloWorldAppLog", "onStart()!");

        //showToast("onStart()")
    }

    override fun onResume() {
        super.onResume()

        Log.d("HelloWorldAppLog", "onResume()!");
        //showToast("onResume()")
    }

    override fun onPause() {
        super.onPause()

        Log.d("HelloWorldAppLog", "onPause()!");

        //showToast("onPause()")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("HelloWorldAppLog", "onRestart()!");

        //showToast("onRestart()")
    }

    // Вызвать суперкласс после кода
    override fun onStop() {
        //showToast("onStop()")
        Log.d("HelloWorldAppLog", "onStop()!");
        super.onStop()
    }


    override fun onDestroy() {
        //showToast("onDestroy()")
        Log.d("HelloWorldAppLog", "onDestroy()!");
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        //showToast("onSaveInstanceState")
        Log.d("HelloWorldAppLog", "onSaveInstanceState()!");
        super.onSaveInstanceState(outState, outPersistentState)
    }
}