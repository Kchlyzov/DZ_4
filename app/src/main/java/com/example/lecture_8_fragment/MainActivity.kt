package com.example.lecture_8_fragment

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //
    lateinit var switchFragmentButton: Button // кнопка для смены фрагмента

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragmentButton = findViewById(R.id.switch_fragments_button) // нашли кнопку
        // присоединение фрогмента к активити
        val startFragment = StartFragment()
        val endFragment = EndFragment()
       switchFragmentButton.setOnClickListener {

           val fragment =  // условие какой фрагмент находится в контейнере
               when (supportFragmentManager.findFragmentById(R.id.fragment_container)){
                   is StartFragment -> endFragment
                   is EndFragment -> startFragment
                   else -> startFragment
               }
           supportFragmentManager
               .beginTransaction()
               .replace(R.id.fragment_container,fragment)
               //.addToBackStack(fragment.tag) // это строка сохроняет фрагменты один на одном
               .commit()
       }

    }

}