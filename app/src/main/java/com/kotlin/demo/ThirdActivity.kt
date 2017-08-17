package com.kotlin.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*
import org.jetbrains.anko.toast

class ThirdActivity : AppCompatActivity() {
    var StringArray: Array<String> = arrayOf("how", "are", "you")
    var IntArray: Array<Int> = arrayOf(1, 2, 3)
    var LongArray: Array<Long> = arrayOf(1, 2, 3)
    var FloatArray: Array<Float> = arrayOf(1.0f, 2.0f, 3.0f)
    var DoubleArray: Array<Double> = arrayOf(1.0, 2.0, 3.0)
    var BooleanArray: Array<Boolean> = arrayOf(true, false, true)
    var CharArray: Array<Char> = arrayOf('a', 'b', 'c')
    var str: String = ""
    var index: Int = 0
    var origin:String = "Hello kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        mBtnInt.setOnClickListener {
            index = 0
            str = ""
            while (index < IntArray.size) {
                str += IntArray[index].toString() + ","
                index++
            }
            mTvArray.text = str
        }

        mBtnLong.setOnClickListener {
            index = 0
            str = ""
            while (index < LongArray.size) {
                str += LongArray[index].toString() + ","
                index++
            }
            mTvArray.text = str
        }

        mBtnFloat.setOnClickListener {
            index = 0
            str = ""
            while (index < FloatArray.size) {
                str += FloatArray[index].toString() + ","
                index++
            }
            mTvArray.text = str
        }

        mBtnDouble.setOnClickListener {
            index = 0
            str = ""
            while (index < DoubleArray.size) {
                str += DoubleArray[index].toString() + ","
                index++
            }
            mTvArray.text = str
        }

        mBtnBoolean.setOnClickListener {
            index = 0
            str = ""
            while (index < BooleanArray.size) {
                str += BooleanArray[index].toString() + ","
                index++
            }
            mTvArray.text = str
        }

        mBtnChar.setOnClickListener {
            index = 0
            str = ""
            while (index < CharArray.size) {
                str += CharArray[index] + ","
                index++
            }
            mTvArray.text = str
        }

        mBtnString.setOnClickListener {
            index = 0
            str = ""
            while (index < StringArray.size) {
                str += StringArray[index] + ","
                index++
            }
            mTvArray.text = str
        }

        mTvOrigin.text = "原字符:$origin"
        mBtnSubString.setOnClickListener {
            mTvResult.text = when(index){
                0 -> "傻逼啥样你啥样"
                1 -> "你跟傻逼一个样"
                2 -> "万里长征今犹在"
                3 -> "不见当年秦始皇"
                else -> "窈窕淑女君子好逑"
            }
            index++
//            val text = origin.substring(3)
//            mTvResult.text = "字符截取结果:$text"
        }

        mBtnSubFor.setOnClickListener {
//            for从0开始遍历循环遍历
            //            for (x in StringArray.indices step 1){
//                toast(StringArray[x])
//            }
            //for从末尾开始遍历循环遍历  ，downto代表减至0  step每次加减2
//            for (x in StringArray.size downTo 0 step 2){
//                toast(StringArray[x-1])
//            }
//            for循环，不包含10
//            for (x in 1 until 10 step 1){
//                toast(x.toString())
//            }
//            map循环遍历
            val map = mapOf("a" to 1, "b" to 2, "c" to 3)
            for ((k,v) in map){
                toast(k+"---"+v.toString())
            }
        }

        mBtnSubChoose.setOnClickListener {
            val fruits = listOf("banana", "avocado", "apple", "kiwi")

            fruits
                    .filter { it.startsWith("a") }//以a开头的
                    .sortedBy { it }//排序
                    .map { it.toUpperCase() }//大写
                    .forEach { toast(it) }//遍历

        }
    }


}
