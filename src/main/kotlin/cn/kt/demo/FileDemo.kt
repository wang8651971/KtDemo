package cn.kt.demo

import rx.Observable
import java.io.File
import java.util.concurrent.Executor
import java.util.concurrent.Executors

fun main(vararg args: String) {
    // 读取一个文件
    val txt = File(ClassLoader.getSystemResource("input").path).readText()
    Observable.from(txt.toCharArray().asIterable())
            .filter {
                // 过滤空白字符
                !it.isWhitespace()
            }
            .groupBy {
                // 分组：这里将自己分成一组
                it
            }
            .map {
                // 拉米打表达式默认的参数名字是 it
                // 可以使用这种方法将外面一层的参数改名，以便于在内部可以访问到
                o ->
                o.count().subscribe {
                    // 这里的  o  是外面一层的变量
                    //  it 是里面的拉米打表达式的变量
                    println("${o.key} : $it")
                }
            }
            .subscribe()

    // 在Java中是一个接口，并且只有一个方法。
    // 那么在kotlin中可以使用拉米打表达式替代他
    val exe = Executors.newCachedThreadPool()
    // 因为  void execute(Runnable command);  方法的参数是一个接口。
    // 并且这个接口中只有一个方法。
    // 所以可以直接使用拉米打表达式替换。
    exe.execute {
        println("我是一个字符串")
    }
}