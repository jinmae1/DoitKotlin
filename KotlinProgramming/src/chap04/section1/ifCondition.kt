package chap04.section1

fun main() {
    val a = 12
    val b = 7

    val max = if (a > b) {
        println("a 선택")
        a
    }
    else {
        println("b 선택")
        b
    }

    val min = if (a < b) a else b

    println(max)
    println(min)
}