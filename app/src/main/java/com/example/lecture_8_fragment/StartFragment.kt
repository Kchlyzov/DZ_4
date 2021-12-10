package com.example.lecture_8_fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val TAG = "MyTag"

class StartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Выносим вьюшку в отдельную переменную
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        // Совершаем раьоту с вью
        //val textView:TextView = view.findViewById()
        return view
    }

    // override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //}


}
// Выносим вьюшку в отдельную переменную
// Совершаем раьоту с вью
// Возвращаем вью
