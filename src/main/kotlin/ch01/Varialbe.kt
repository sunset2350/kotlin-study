package ch01

fun main() {
    // 코틀린 변수, 불변변수/가변변수
    // js const,let

    // 가변변수(variable) --> 값을 변경 할 수 있다는 뜻임
    var mutableVar = 10 // 변수선언 및 대입, 타입추론(type inference)
    // 타입추론 : 변수에 대입 값에 따라서 타입이 지정됨


    // 불변변수(value) --> java는 final --> 값을 변경 할 수 없다는 뜻임
    val immutableVar = 20;

    // 코틀린에서는 val/val 변수명 : 타입
    // null이 가능한 타입과 null이 불가능한 타입 분리
    // 자바 : int 기본값은 0, Int 기본이 null
    // var nullableStr : String = null --> 기본적으로 모든 타입은 null 불가능 하다.

    // 기본적으로 모든 타입은 null 불가능
    // null 이 불가능하긴 때문에 초기화 필요 없음
    var str: String? = null; // -> null이 사용하려면 타입뒤에 ?을 붙임

}
