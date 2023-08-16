package com.example.loggerexam

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


class LoggerUtils {

    fun getInstance(): LoggerUtils {
        Logger.addLogAdapter(AndroidLogAdapter())
        return this
    }

    fun debug(s: String): LoggerUtils {
        Logger.t(TAG).d(s)
        return this
    }

    fun info(s: String): LoggerUtils {
        Logger.t(TAG).i(s)
        return this
    }

    fun warning(s: String): LoggerUtils {
        Logger.t(TAG).w(s)
        return this
    }

    fun error(s: String): LoggerUtils {
        Logger.t(TAG).e(s)
        return this
    }

    companion object {
        const val TAG = "TAG_LOGGER"
    }
}