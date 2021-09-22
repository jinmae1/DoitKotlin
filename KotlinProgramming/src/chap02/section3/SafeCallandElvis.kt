package chap02.section3

// Elvis
fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: $(str?.length ?: -1)") // null이 아닐 때 값 ?: null일 때 값( Oracle의 nvl()와 같다.)
}

// str?.length ?: -1
// 두 표현은 같다.
// if (str != null) str.length else -1