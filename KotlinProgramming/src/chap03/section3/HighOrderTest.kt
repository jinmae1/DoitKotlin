package chap03.section3

fun main() {
    var result: Int

    val multi0:  (Int, Int) -> Int = { x, y -> x * y}  // (Int, Int) -> Int를 생략하지 않은 경우
                                                 // 자료형 선언 or 매개변수부 중 어느 한쪽에는 자료형을 명시해줘야 한다.
    val multi = { x: Int, y: Int -> x * y }             // 일반 변수에 람다식 할당

    val multi2:  (Int, Int) -> Int = { x: Int, y: Int ->
        println("x * y")    // 앞에 이런 표현식이 있더라도,
        x * y               // 마지막에 적은 표현식이 반환된다.
    }

    result = multi(10, 20)
    println(result)

    val greet: () -> Unit = { println("Hello World!")}  // 매개변수와 리턴값이 없는 경우
    val square: (Int) -> Int = { x -> x * x }           // 매개 변수가 하나인 경우

    val greet0 = { println("Hello World!")}             // 물론 이런 식으로
    val square0 = { x: Int -> x * x }                   // 생략 가능하다.
}