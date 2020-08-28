package com.example.kotlin_grammar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var myname =  "홍길동"
        var myage: Int
        myage = 27
        myage = myage + 1
        Log.d("BasicSyntax","myname : $myname")
        */
        /*
        var ball = 4
        if (ball > 3) {
            Log.d("BasicSyntax","4볼로 출루합니다")
        }
        else{
            Log.d("BasicSyntax","타석에서 다음 타구를 기다립니다.")
        }*//*
        var now = 10
        when (now){
            in 10..19 -> {
                Log.d("BasicSyntax","마이클은 10대 입니다.")

            }
            */
        /*
        // 4-1. 값으로 컬렉션 생성하기
        var mlist = mutableListOf("MON", "TUE", "WED")
        mlist.add("THU")
        Log.d("BasicSyntax","첫 번째 값은 ${mlist.get(0)}.")
        Log.d("BasicSyntax","첫 번째 값은 ${mlist.get(1)}.")
        */
        /*// 4-2 빈 컬렉션 생성하기
        var slist = mutableListOf<String>() // 문자열로 된 빈 컬렉션을 생성합니다.
        slist.add("월")
        slist.add("화")
        slist.add("수")
        slist.add("목")
        slist.set(1,"ㄹ어ㅗ하ㅓㄹ어ㅗ")
        Log.d("BasicSyntax","첫 번째 값은 ${slist.get(0)}.")
        Log.d("BasicSyntax","두 번째 값은 ${slist.get(1)}.")
        Log.d("BasicSyntax","세 번째 값은 ${slist.get(2)}.")
        Log.d("BasicSyntax","slist에는 ${slist.size}개의 값이 있습니다.")
        *//*
        // 4-1 기본 타입 배열 선언하기
        var students = IntArray(10)
        // 4-2 문자열 타입 배열 선언하기
        var sArray = Array(10,{item->""})
        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93

        students.set(5,95)

        var a = students[0]

        Log.d("BasicSyntax","세 번째 값은 ${a}.")
        Log.d("BasicSyntax","세 번째 값은 ${students[8]}.")
        Log.d("BasicSyntax","세 번째 값은 ${students[9]}.")
        *//*
        // 4-1 맵 생성하기
        var map1 = mutableMapOf<String, String>()

        map1.put("key1", "value1")
        map1.put("key2", "value2")
        map1.put("key3", "value3")
        var v = map1.get("key2")
        Log.d("BasicSyntax","key2 값은 ${v}.")
        map1.put("key2","dskjfhskdjfh")
        Log.d("BasicSyntax","key2 값은 ${map1.get("key2")}.")
        map1.remove("key2")
        Log.d("BasicSyntax","key2 값은 ${map1.get("key2")}.")
        */
        // 5장 반복문
        /* for ( i in 1..10)
        {
            Log.d("BasicSyntax","i의 값은 ${i}.")
        }
        var array1 = arrayOf("asd","tery","xcv")
        for ( i in 0 until array1.size)
        {
            Log.d("BasicSyntax","i의 값은 ${i}.")
        }
        for ( i in 0..10 step 4)
        {
            Log.d("BasicSyntax","i의 값은 ${i}.")
        }
        for ( i in 10 downTo 0)
        {
            Log.d("BasicSyntax","i의 값은 ${i}.")
        }
        for ( i in 10 downTo 0 step 3)
        {
            Log.d("BasicSyntax","i의 값은 ${i}.")
        }
        */
        /*
        for ( e in 1..10)
        {
            if (e > 3 && e < 8 )
            {
                continue
            }
            Log.d("BasicSyntax","e의 값은 ${e}.")
        }
        */
        /*
        var sr = square(30)
        Log.d("BasicSyntax","sr의 값은 ${sr}.")

        printsum(3,6)
        val PI = getpi()
        Log.d("BasicSyntax","pi의 값은 ${PI}.")

        newfunction1("hello")
        newfunction1("micadsas", weight = 456.12)
        */
        /**/


    }
}
///////////////////////////////////////////////////////////////////////////////////

fun square(x: Int ): Int {
    return (x*x)
}

fun printsum(x:Int, y:Int){
    Log.d("BasicS5yntax","x + y = ${x+y}.")
}
fun getpi(): Double {
    return 3.14
}

fun newfunction1(name:String, age: Int = 29, weight:Double = 65.6)
{
    Log.d("BasicS5yntax","name = ${name}.")
    Log.d("BasicS5yntax","age = ${age}.")
    Log.d("BasicS5yntax","weight = ${weight}.")
}