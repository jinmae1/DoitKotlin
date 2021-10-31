package chap03.section1

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun diff(a: Int, b: Int) = a - b    // 간단한 표기법(리턴형도 생략 가능하다)

fun main() {
    val result1 = sum(3, 2)
    val result2 = diff(6, 7)

    println(result1)
    println(result2)
}
