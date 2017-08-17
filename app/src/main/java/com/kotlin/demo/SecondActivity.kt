package com.kotlin.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class SecondActivity : AppCompatActivity() {

    val origin: Float = 65.0f
    var isBoolean: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
        btn_add.setOnClickListener {
            println(sum(5, 3))
        }

        btn_add.setOnLongClickListener { longToast("两个数相加的和是${sum(3, 5)}");true }

        tv_origin.text = origin.toString()

        btn_int.setOnClickListener { tv_result.text = origin.toInt().toString() }

        btn_long.setOnClickListener { tv_result.text = origin.toLong().toString() }

        btn_float.setOnClickListener { tv_result.text = origin.toString() }

        btn_double.setOnClickListener { tv_result.text = origin.toDouble().toString() }

        btn_boolean.setOnClickListener { isBoolean = origin.isNaN(); tv_result.text = isBoolean.toString() }

        btn_char.setOnClickListener { tv_result.text = origin.toChar().toString() }

        mBtnMax.setOnClickListener {
            toast("最大值是${maxValue(7,8)}")
            toast("最大值是${maxValue(10,11)}")
            toast("最大值是${maxValue(250,1314)}")
        }
    }

    private fun initView() {

    }

    fun maxValue(a:Int,b:Int) = if (a>b) a else b

    fun sum(a: Int, b: Int) = a + b
}
