package chap03.section3

fun main() {
    val result = callByValue(lambda())  // 람다식 함수를 호출
    println(result)
}

fun callByValue(b: Boolean): Boolean {  // 일반 변수 자료형으로 선언된 매개변수
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {           // 람다 표현식이 2줄
    println("lambda function")
    true
}

/*
fun lambda(): Boolean {                 // 일반 함수인데 왜인지 이게 먼저 오버로딩(?) 된다.
    println("general function")
    return true
}
*/
