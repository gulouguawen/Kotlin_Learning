package 具名参数和默认参数

/**
 * Project：kotlin基础
 * Author：shiyao
 * Email：13207690135@163.com
 * Time：2019-06-25 14:22:05
 * IDE：IntelliJ IDEA
 * Project Name：kotlin基础
 * File Name：Demo01.kt
 */
var Pi=3.14159f
fun getRectangleArea(long: Int, width: Int): Int {
    return long * width
}

fun getCirclePerimeter(PI: Float=Pi, Radius: Float): Float {
    return 2* PI * Radius
}

fun main() {
    var area=getRectangleArea(5,4)
    println(area)

    var perimeter= getCirclePerimeter(Radius = 2.0f)
    println(perimeter)
}