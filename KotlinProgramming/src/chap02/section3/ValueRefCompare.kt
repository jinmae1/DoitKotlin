package chap02.section3

fun main() {
    val a: Int = 128    // * -128 ~ 127인 경우 스택이 아니라 캐시에 저장되므로 결과가 달라진다.
    val b = a           // 타입 추론에 의해 Int형이 된다.
    println(a === b)    // 기본형, 참조형에 관계없이 같은 곳을 참조하므로 true
                        // 다만 a, b 둘 다 참조형으로 선언되어 있지만 컴파일러가 기본혀응으로 변환한다.

    val c: Int? = a     // Int? 타입은 무조건 참조형으로 저장되므로 힙에 128이라는 *값이 만들어지고* 저장된다.
    val d: Int? = a
    val e: Int? = c

    println(c == d)     // 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d)    // 값의 내용은 같지만 참조 주소가 다르다. 힙에 각자 128이 저장된다. false
    println(c === e)    // c가 가리키는 힙의 주소를 e에 대입했으므로 true
}