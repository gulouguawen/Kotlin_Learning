package 函数和函数式表达式

/**
 * Project：kotlin基础
 * Author：shiyao
 * Email：13207690135@163.com
 * Time：2019-06-24 19:39:25
 * IDE：IntelliJ IDEA
 * Project Name：kotlin基础
 * File Name：Demo01.kt
 */

fun main() {
    var result = add(3, 5)
    println(result)

    var i = {x:Int,y:Int->x+y}
    var result1=i(3,5)
    println(result1)

    var j:(Int,Int)->Int ={x,y->x+y}
    var result2=j(3,5)
    println(result2)
}

fun add(x: Int, y: Int): Int = x + y