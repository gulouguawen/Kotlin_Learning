package 区间和循环

/**
 * Project：条件控制
 * Author：shiyao
 * Email：13207690135@163.com
 * Time：2019-06-24 15:27:37
 * IDE：IntelliJ IDEA
 * Project Name：条件控制
 * File Name：demo02.kt
 */

//开区间
fun main() {
    var nums = 1 until 100
    var result = 0
    for (num in nums) {
        result+=num
    }
    println(result)
}