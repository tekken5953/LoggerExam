package com.example.loggerexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private val logBtn: Button by lazy { findViewById(R.id.logBtn) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logger = LoggerUtils().getInstance()

        logBtn.setOnClickListener {
            logger.debug("디버그 로그").info("인포 로그").warning("워닝 로그").error("에러 로그")
        }
    }
}