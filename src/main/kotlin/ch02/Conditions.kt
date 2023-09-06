package ch02

fun main() {
    val a = 10
    val b = 20
//
//    val result : Int
//    if(a > b) {
//        result = a
//    } else {
//        result = b
//    }

    // 코틀린에서는 if-else 1개짜리 식입니다.
    val result = if(a>b) {
        "max is a : $a"
    } else {
        "max is a : $b"
    }

    println(if(a > b){
        "max is a : $a"
    } else {
        "max is a : $b"
    })

    // 삼항연산 x
    // if else 문의 식이 1개이면, 식의 결과가 반환 값
    val max = if (a > b) a else b


    // when(switch-case 대신)
    // break 구문이 필요가 없다


    val number = 3
    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three") // break 문이 없음
        else -> println("Other number") // default
    }

    val description = when(number) {1-> "One" 2-> "Two" 3-> "Three" else -> "Other number"}
}
