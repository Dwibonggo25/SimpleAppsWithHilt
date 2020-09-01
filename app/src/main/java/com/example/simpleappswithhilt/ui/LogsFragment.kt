package com.example.simpleappswithhilt.ui

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.simpleappswithhilt.data.LoggerLocalDataSource
import com.example.simpleappswithhilt.utils.DateFormatter
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LogsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LogsFragment : Fragment() {

    @Inject lateinit var logger: LoggerLocalDataSource
    @Inject lateinit var dateFormatter: DateFormatter

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

}