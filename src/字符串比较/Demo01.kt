package 字符串比较

fun main() {
    var str1="张三"
    var str2="张二"
//    kotlin中“==”等价于java中的equals方法，而非比较地址
    println(str1==str2)
//    true表示忽略大小写，false表示不忽略
    println(str1.equals(str2,true))
}