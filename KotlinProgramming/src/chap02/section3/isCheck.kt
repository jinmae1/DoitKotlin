package chap02.section3

fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    } else if (num !is Int) {   // else if !(num is Int)와 동일한 표현
        print("Not a Int")
    }
}