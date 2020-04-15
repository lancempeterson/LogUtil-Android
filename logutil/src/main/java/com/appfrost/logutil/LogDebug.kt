package com.appfrost.logutil
import android.util.Log
class LogDebug {
    companion object {
        private val TAG: String = "LOG_UTIL"
        fun log(message: String){
            Log.d(TAG,message)
        }
    }
}