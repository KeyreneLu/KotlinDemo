package com.kotlin.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnSecond.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
        mBtnSecond.setOnLongClickListener { longToast("长按Tv");true }

        mBtnThird.setOnClickListener {
            startActivity(Intent(this,ThirdActivity::class.java))
        }
    }

}
