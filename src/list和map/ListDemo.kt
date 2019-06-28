package list和map

/**
 * Project：条件控制
 * Author：shiyao
 * Email：13207690135@163.com
 * Time：2019-06-24 15:35:52
 * IDE：IntelliJ IDEA
 * Project Name：条件控制
 * File Name：ListDemo.kt
 */

fun main() {
    var lists= listOf("卖鸡蛋","买火腿","买大米","买冰激凌")
   for((i,e)in lists.withIndex()){
   println("$i $e")
   }
}