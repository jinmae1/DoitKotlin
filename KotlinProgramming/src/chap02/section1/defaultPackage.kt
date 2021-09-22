package chap02.section1

import kotlin.math.*
import com.example.edu.Person // as eduPerson

fun main() {
    val intro: String = "Hello"
    val num: Int = 20
    val user1 = Person("Kildong", 30);
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(PI)
    println(abs(-12.6))

    println("intro: $intro num: $num")
}

class Person(val id: String, val name: String)
// 여기서 선언된 로컬 Person 클래스와 com.example.edu의 Person이 이름이 같아서 as로 재명명 해줘야 하지만
// 여기선 오버로딩이 된 건지 아무튼 import한게 우선 적용되긴 한다.