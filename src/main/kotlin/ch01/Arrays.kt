package ch01

import ch02.addExclamation

fun main() {
    val intArray = IntArray(5) {0} // 초기값을 0으로 초기화한 배열
    val intArray2 = intArrayOf(1,2,3,4,6) // 초기값을 가지는 배열

    // 인덱스로 요소 접근
    intArray2[2]
    intArray2[3] = 8

    val str = "He1111llo"

    // 반복 순서(js 객체 속성 반복자와 비슷함)
    for(intVal in intArray2) {
        println(intVal)
    }

    val intArray3 : IntArray? = null

    str.addExclamation()

    println(str.addExclamation())
}

