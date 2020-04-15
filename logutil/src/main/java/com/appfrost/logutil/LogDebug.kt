package com.appfrost.logutil
import android.util.Log
class LogDebug {
    private val TAG: String = "LOG_UTIL"
    fun d(message : String){
        Log.d(TAG,message)
    }
}