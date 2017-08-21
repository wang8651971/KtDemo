package cn.kt.demo

/**
 * enum代码示例
 */

/**
 * 枚举类型  本质也是一个类。
 * 枚举类型可以设置构造函数
 *
 * 注意  val  var  关键字的都是属性
 * 没有这两个关键字的   是 普通参数
 */
enum class Lang(val hello: String) {
    EN("英国"),
    CN("中国"),
    JP("日本");

    fun country() {
        println(hello)
    }
    // 构造函数
    init {
    }

    // companion object 伴生对象。类似静态方法。
    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }
    }
}

/**
 * Kotlin的特性。
 * 可以通过这种方式，动态扩展方法。
 */
fun Lang.sayHello() {
    val hello = when (this) {
        Lang.EN -> "Hello"
        Lang.CN -> "你好"
        Lang.JP -> "日本话的您好"
    }
    println(hello)
}

fun main(vararg args: String) {
    if (args.size == 0) return
    val lang = Lang.parse(args[0])
    lang.country()
    lang.sayHello()
}