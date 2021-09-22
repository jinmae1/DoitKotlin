package chap02.section2

fun main() {
    println("Byte min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE)
    // Short, Int, Long, Float
    println("Double min: " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE)
    // Double.MAX_VALUE에 잘 보면 1.7976931348623157*E*308 E가 숨어있으니 조심
}