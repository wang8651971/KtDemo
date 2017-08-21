package cn.kt.demo

/**
 * 区间示例
 */
fun main(args: Array<String>) {
    /*
        区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
        区间是为任何可比较类型定义的，但对于整型原生类型，它有一个优化的实现。
     */
    for (i in 1..10) {// 等同于 1 <= i && i <= 10
        print("  " + i) // 输出： 1  2  3  4  5  6  7  8  9  10
    }
    print("\n-----分割线------\n")
    for (i in 4..1) print(i) // 什么都不输出
    print("\n-----分割线------\n")
    // 使用 step 指定步长   类似于  i++ 变为  i+2
    for (i in 1..10 step 2) print("  " + i) // 输出： 1  3  5  7  9
    print("\n-----分割线------\n")
    // downTo  指定降序  类似于： i--
    for (i in 10 downTo 1 step 2) print("    " + i) // 输出:  10    8    6    4    2
    print("\n-----分割线------\n")
    // 使用 until 函数排除结束元素   类似于： 将 i<=10   变为  i<10
    for (i in 1 until 10) print("   "+i)  // i in [1, 10) 排除了 10   输出为：1   2   3   4   5   6   7   8   9


}