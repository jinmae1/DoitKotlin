package chap02.section3

fun main() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any) {      // 인자를 Any형으로 받음
    if (x is String) {
//         println("x is String: ${x.toString()}")      // 예제가 적절한지 모르겠지만 이런식으로
        println("x is String: $x")                      // 명시적으로 캐스팅할 필요가 없다.
                                                        // 스코프 내에서 자동으로 캐스팅 된 상태다.
    }
    if (x is Int) {
//        println("x is Int: ${x.toInt()}")
        println("x is Int: $x")
    }
}