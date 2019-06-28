package 空值处理

//String加上?表示字符串可以传入null，否则不可以

fun heat(str: String?): String {
    return "热" + str
}

fun main() {
    var result1 = heat("油")
    println(result1)

    heat(null)
}