package cn.kt.demo

fun main(args: Array<out String>) {

    // lambda示例
    val lam: (Int, Int) -> Int = { x, y -> x + y }
    println("lam的值：" + lam(1, 2))

    // Kotlin中实例化对象时候，不用使用  new 关键字。
    print(User(3, "王攀"))
}



// data  class   是一个特殊的class
data class User(val id: Int, val name: String)
