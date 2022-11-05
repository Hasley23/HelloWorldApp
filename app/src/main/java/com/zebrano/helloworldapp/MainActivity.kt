package com.zebrano.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
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
            if (img.visibility == View.INVISIBLE)
                img.visibility = View.VISIBLE
            else
                img.visibility = View.INVISIBLE
        }

        showToast("onCreate()")
    }

    override fun onStart() {
        super.onStart()

        showToast("onStart()")
    }

    override fun onResume() {
        super.onResume()

        showToast("onResume()")
    }

    override fun onPause() {
        super.onPause()

        showToast("onPause()")
    }

    override fun onRestart() {
        super.onRestart()

        showToast("onRestart()")
    }

    // Вызвать суперкласс после кода
    override fun onStop() {
        showToast("onStop()")

        super.onStop()
    }

    override fun onDestroy() {
        showToast("onDestroy()")

        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        showToast("onSaveInstanceState")

        super.onSaveInstanceState(outState, outPersistentState)
    }
}