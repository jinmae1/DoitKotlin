package chap02.section2

fun main() {

   // * Kotlin에서 변수는 모두 참조형이고 컴파일 과정에서 기본형으로 변환된다.

    val number = 10             // number 변수는 int형으로 추론
    var language = "Korean"     // language 변수는 String으로 추론
    val secondNumber: Int = 20  // secondNumber 변수는 자료형을 int형으로 명시적으로 지정
    language = "English"        // var 키워드로 선언한 변수는 값을 다시 할당할 수 있음

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    val exp01 = 123             // int형으로 추론
    val exp02 = 123L            // 접미사 L -> Long
    val exp03 = 0x0F            // 접두사 0x를 사용해 16진 표기가 사용된 int형으로 추론
    val exp04 = 0b00001011      // 접두사 0b를 사용해 2진 표기가 사용된 Int형으로 추론

    val exp08: Byte = 127       // 명시적으로 자료형을 지정(Byte)
    val exp09 = 32767           // 명시적으로 자료형을 지정하지 않으면 Short형 범위의 값도 Int형으로 추론
    val exp10: Short = 32767    // 명시적으로 자료형을 지정(Short형)
    // * ctrl + shift + p로 타입 추론 가능(명시한 경우에는 당연히 안 된다.)

    // * Unsigned가 있긴 있으나 언제 Deprecate될지 모른다.
    val uint: UInt = 153u
    val ushort: UShort = 65535u
    var ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    // * underscore로 자리수 구분
    val million = 1_000_000
    val cardNum = 1234_1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010

    val pi03 = 3.14E-2          // 왼쪽으로 소수점 2칸 이동, 0.0314
    val pi04 = 3.14e2           // 오른쪽으로 소수점 2칸 이동, 314

    val isUploaded: Boolean
    val isOpen = true

    val ch = 'c'                // Char로 추론
    val ch2: Char               // 변수를 선언만 한 경우 자료형을 반드시 명시해야 함
    val ch3 = '\u0000'          // '\u0000' ~ '\uffff'

    // val ch4: Char = 65       // 오류. 숫자를 대입할 수는 없다.
    val code: Int = 65
    val chFromCode: Char = code.toChar()    // toChar()로 code에 해당하는 문자를 할당
    println(chFromCode)
}