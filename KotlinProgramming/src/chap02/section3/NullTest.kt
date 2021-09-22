package chap02.section3

fun main() {
    var str2: String? = null //"Hello Kotlin"
    str2 = null // 오류 null을 허용하지 않음

    var str1: String? = null
    // str1 = null // 왜인지는 모르겠지만 이후에 null을 대입해주면 11번 라인에서 오류난다.
//    println("str1: $str1 length: ${str1.length}") // 오류
    println("str1: $str1 length: ${str1?.length}") // null 출력. 세이프콜(?.)
    println("str1: $str1 length: ${str1!!.length}") // non-null 단정 기호(!!.) 컴파일은 되지만 NPE. Java처럼 돼버린다.

    // 조건식으로 null 검사
    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}")
}
