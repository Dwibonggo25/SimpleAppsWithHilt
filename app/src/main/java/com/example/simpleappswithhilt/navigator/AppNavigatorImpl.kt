package com.example.simpleappswithhilt.navigator

import androidx.fragment.app.FragmentActivity
import com.example.simpleappswithhilt.ButtonsFragment
import com.example.simpleappswithhilt.R
import com.example.simpleappswithhilt.ui.LogsFragment
import javax.inject.Inject

class AppNavigatorImpl @Inject constructor(private val activity: FragmentActivity) : AppNavigator {

    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.BUTTONS -> ButtonsFragment()
            Screens.LOGS -> LogsFragment()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }
}