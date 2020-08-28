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
        */
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


        /**/
        /**/
        /**/
        /**/

    }
}