package ch01

fun main() {
    // 코틀린의 기본타입은 모두 객체
    val intValue : Int = 42
    println(intValue)

    // 변수의 메서드를 호출해서 자유롭게 형변환, 연산처리가 가능함
    intValue.toLong().toString()

    // 실수 자료형
    val floatValue : Float = 3.14f // -> 자동으로 호환해주지 않음(f)
    val doubleValue : Double = 3.14

    // 문자형
    val charValue : Char = 'A'

    // 부울형
    val booleanValue : Boolean = true

    // 문자형
    val stringValue : String = "Hello, Kotlin"
    val stringValue2 : String = "Hello, Kotlin"

    // 기본자료형이 클래스 타입이지만 어떤상황이던지 동등비교 연산 사용을 할 수 있다.
    if(stringValue == stringValue2) {

    }


}