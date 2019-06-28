package 简易计算器

/**
 * Project：kotlin基础
 * Author：shiyao
 * Email：13207690135@163.com
 * Time：2019-06-24 16:40:23
 * IDE：IntelliJ IDEA
 * Project Name：kotlin基础
 * File Name：Demo.kt
 */

fun main() {
    var a = 8
    var b = 2
    println("a+b=" + plus(a, b))
    println("a-b=" + sub(a, b))
    println("a*b=" + mutl(a, b))
    println("a//b=" + device(a, b))

}

fun plus(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a - b
}

fun mutl(a: Int, b: Int): Int {
    return a * b
}

fun device(a: Int, b: Int): Int {
    return a / b
}
