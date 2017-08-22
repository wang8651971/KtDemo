package cn.kt.demo

fun main(vararg args: String) {
    Person("王攀", 3).sayName()
    var man = Man("王攀", 44, "男子汉")
    man.sayName()
    man.playGame("电脑游戏")
}

open class Base(val name: String) {

    companion object {
    }

    init {
        println("构造函数: $name")
    }

    open fun sayName() {
        println("我的名字是：$name")
    }
}

open class Person(name: String, val age: Int) : Base(name) {

    init {
        println("Person构造函数执行了： $name  $age")
    }

    override fun sayName() {
        println("我的名字：$name   $age")
    }
}

class Man(name: String, age: Int, val run: String) : Person(name, age), Play {
    override fun playGame(type: String) {
        println("我在玩游戏：$type")
    }

    init {
        println("Man的构造函数：$name  $age  $run")
    }

    override fun sayName() {
        println("我是一个男人")
    }
}

open class AA(val name: String) {
    init {
        println("AA的构造函数执行了：$name")
    }
}

interface Play {
    val name: String
    fun playGame(type: String)
}