package cn.kt.demo

/**
 * vararg 代表可变参数
 */
fun main(vararg args: String) {
    var a: Int = 1
    var b: Int = 3
    if (a > b) {
        println("A大于B")
    } else {
        println("A小于B")
    }
    var c: Int
    c = if (a > b) 4 else 5
    println("C的值是：$c")

}
