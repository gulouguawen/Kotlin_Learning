package when表达式

fun StudentGrade(score:Int){
    when(score){
        10-> println("满分，厉害啦")
        9,8-> println("干得不错")
        7-> println("还要努力啊")
        6-> println("刚好及格")
        else-> println("你该好好学习了")
    }
}

fun main() {
    StudentGrade(5)
}



