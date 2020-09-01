package com.example.simpleappswithhilt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simpleappswithhilt.data.LoggerDataSource
import com.example.simpleappswithhilt.di.InMemoryLogger
import com.example.simpleappswithhilt.navigator.AppNavigator
import javax.inject.Inject

class ButtonsFragment : Fragment() {

    @InMemoryLogger
    @Inject
    lateinit var logger: LoggerDataSource

    @Inject
    lateinit var navigator: AppNavigator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }
}