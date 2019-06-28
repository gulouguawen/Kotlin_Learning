package 条件控制

fun CheakFace(score:Int){
    if(score>80)
        println("这是个帅哥")
    else
        println("这是个衰哥")
}
fun main() {
    var score=65
    CheakFace(score)
}