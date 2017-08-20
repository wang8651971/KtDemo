package cn.kt.demo

/**
 * Map示例
 */
fun main(vararg args: String) {
    args.map {
        println(it)
    }
    // map的参数是一个 lambda 表达式。
    // ::  的意思是代表一个方法的引用。
    args.map(::p)

    // flatMap 传入参数是一个lambda表达式
    //
    args.flatMap {
        it.split("_")
    }.map {
        // 字符串模板    使用$ 符号开头。后面可以跟一个变量和一小段代码。
        print("$it -Hash：${it.hashCode()};")
    }
}

fun p(s: String) {
    println("我是输出：" + s)
}