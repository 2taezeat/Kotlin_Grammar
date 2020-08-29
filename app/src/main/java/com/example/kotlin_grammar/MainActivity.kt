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
        /*
        Kotlin1()

        Kotlin2("안녕")

        var k = Kotlin3()
        k.print1()
        k.one = "hello"
        k.print1()

        Kotlin4.print1()
        Kotlin4.one = "hello"
        Kotlin4.print1()

        var data1 = datauser("asdad", 21)
        var data2 = data1.copy()
        data2.name = "kfjghfdkgjkj"
        Log.d("BasicSyntax","원본 data1은  ${data1.toString()}.")
        Log.d("BasicSyntax","복사된 data2은  ${data2.toString()}.")
        */
        /*
        // 1. 부모 클래스 직접 호출하기
        var parent = Parent()
        parent.sayhello()
        // 2. 자식 클래스 호출해서 사용하기
        var chlid = Chlid()
        chlid.myhello()

        teststringextension()

    }
    // String 익스텐션 테스트하기
    fun teststringextension(){
        var o = "hello"
        var a = "guys"
        Log.d("BasicSyntax", "a를 더한 값은 ${o.plus(a)}입니다")

        */


        // 접근 제한자 테스트
        var c = Chlid()
        c.callvariables()

        // 부모클래스 직접 호출해보기
        var p = Parent()
        Log.d("BasicSyntax","Parent : default(public) 변수 => ${p.defaultval}.")
        Log.d("BasicSyntax","Parent : interval 변수 => ${p.internalval}.")

    }
}
///////////////////////////////////////////////////////////////////////////////////
/*
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
}*/
///////////////////////////////////////////////////////////////////////////////////
/*
//파라미터가 없는 클래스
class Kotlin1(){
init {
Log.d("BasicS5yntax","Kotlin1 class 생성.")
}
}
// 파라미터가 있는 세컨더리 생성자
class Kotlin2 {
constructor(value: String)
{
Log.d("BasicS5yntax","parameter값은 ${value} 입니다.")
}
}
// 프로퍼티와 메서드가 있는 클래스
class Kotlin3{
var one:String = "None" // 프로퍼티
fun print1(){
Log.d("BasicS5yntax","one에 입력된 값은 ${one}입니다.")
}
}

// 스테틱 멤버를 갖는 클래스
class Kotlin4{
companion object {
var one:String = "None" // 프로퍼티
fun print1(){
    Log.d("BasicS5yntax","one에 입력된 값은 ${one}입니다.")
}
}

}
// 데이터 클래스
data class datauser(var name:String, var age:Int)
*/
/*
// 상속 연습
open class Parent{
    var hello:String = "asdasda"
    fun sayhello()
    {
        Log.d("BasicSyntax","${hello}")

    }
}
class Chlid : Parent(){
    fun myhello()
    {
        hello = "hello"
        sayhello()
    }
}
// 메서드 오버라이드 연습
open class baseclass{
    open fun opened()
    {

    }
    fun  notopend()
    {

    }
}
class childclass: baseclass(){
    override fun opened(){

    }
}
// 프로퍼티 오버라이드 엱습
open class baseclass2{
    open var opend:String ="asdasd"

}
class chlidclass2 :baseclass2()
{
    override var opend: String = "oyuituporiu"
}

fun String.plus(word:String) : String{
    return (this + word)
}
*/

// 추상 클래스 설계
abstract class Animal {
    fun walk() {
        Log.d("BasicSyntax","걷습니다.")
    }
    abstract fun move()
}

// 구현
class Bird: Animal(){
    override fun move(){
        Log.d("BasicSyntax","날아서 이동합니다.")

    }
}

// 인터페이스 설계
interface InterfaceKotlin{
    var vari : String
    fun get()
    fun set()
}

// 구현
class KotlinImpl : InterfaceKotlin {
    override var vari: String = "aosdjaksjdh"
    override fun get() {
        // 코드 구현
    }
    override fun set() {
        // 코드 구현
    }
}

// 접근 제한자 테스트를 위한 부모 클래스
open class Parent {
    private val privateval = 1
    protected open val protecedval = 2
    internal val internalval = 3
    public val defaultval = 4
}
// 자식 클라스
class Chlid : Parent()
{
    fun callvariables()
    {
        // privateval은 호출이 안되고 에러가 난다.
        Log.d("BasicSyntax","Chlid : proteced 변수 => ${protecedval}.")
        Log.d("BasicSyntax","Chlid : interval 변수 => ${internalval}.")
        Log.d("BasicSyntax","Chlid : public(디폴트) 변수 => ${defaultval}.")

    }
}