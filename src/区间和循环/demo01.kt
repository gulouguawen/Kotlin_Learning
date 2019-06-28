package 区间和循环

/**
 * Project：条件控制
 * Author：shiyao
 * Email：13207690135@163.com
 * Time：2019-06-24 15:25:19
 * IDE：IntelliJ IDEA
 * Project Name：条件控制
 * File Name：demo01.kt
 */

//闭区间
fun main() {
    var nums = 1..100
    var result = 0
    for (num in nums) {
        result += num
    }
    println(result)


    var nums1 = 1..16
    for (a in nums1 step 2) {
        println(a)
    }

    var nums2 = nums1.reversed()
    for (b in nums2) {
        println(b)
    }

    println("总数为："+nums2.count())
}