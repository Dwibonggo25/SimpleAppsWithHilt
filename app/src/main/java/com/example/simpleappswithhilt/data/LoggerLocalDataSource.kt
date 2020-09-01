package com.example.simpleappswithhilt.data

import com.example.simpleappswithhilt.data.LogDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoggerLocalDataSource @Inject constructor(private val logDao: LogDao) : LoggerDataSource {

    
    override fun addLog(msg: String) {
        TODO("Not yet implemented")
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun removeLogs() {
        TODO("Not yet implemented")
    }

}