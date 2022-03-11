package com.example.mylog

import android.util.Log

/**
 *    author : hades
 *    date   : 2022/3/11
 *    desc   :
 */
class LogUtils {
    companion object {
        fun e(msg: String) {
            Log.e("LogUtils",msg)
        }
    }
}