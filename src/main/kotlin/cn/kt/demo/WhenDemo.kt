package cn.kt.demo

fun main(vararg args: String) {
    var x = 1
    var validNumbers: Array<Int>
    var enable: Boolean = true
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

