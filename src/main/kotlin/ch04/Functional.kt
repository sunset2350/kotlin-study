package ch04


fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}



fun main() {
    // Int 매개변수 2개를 받고, Int로 반환하는 함수 타입을 선언
    // 변수 : 함수타임 = {함수식}

    val sum: (Int,Int) -> Int = {a,b -> a+b}
}