package 条件控制

fun RetuenBig(a: Int, b: Int): Int {
    if (a > b) return a else return b
}

fun main() {
    var a = 3
    var b = 5
    println("${a}和${b}比较的最大值是${RetuenBig(a, b)}")
}