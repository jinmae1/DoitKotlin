package chap04.section1

fun main() {
    print("Enter the score: ")
    var score: Double = 1.0
    try {
        score = readLine()!!.toDouble()
    } catch (e: NullPointerException) {
        println("Caught")
    } finally {
        println("asdf")
    }
    var grade: Char = 'F'

    var d = if (score >= 90.0)
        grade = 'A'
    else if (score >= 80.0 && score <= 89.9)
        grade = 'B'
    else if (score >= 70.0 && score <= 79.9)
        grade = 'C'
    else 'E'

    println("Score: $score, Grade: $grade")
    println(d)
}