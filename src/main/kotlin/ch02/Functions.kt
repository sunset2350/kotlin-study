package ch02

// fun 함수명(매개변수) : 반환 타입 {....}
// 클래스, 객체 내부엥 있지 않음 함수
fun add(a : Int, b : Int): Int {
    return a + b;
}

// 단일 표현식 함수
// 함수 본체가 1개의 식과 식의 결과가 반환값인 경우
fun addInline(a : Int, b : Int) = a + b

fun printInfo(firstName : String, lastName : String, age:Int){
    println("$firstName $lastName is $age years old")
}

// 디폴트 매개변수
fun greet(name : String = "Guest ") {
    print("Hello , $name")
}

fun sum(vararg numbers : Int) : Int {
    // 가변 인자는 배열처럼 인식됨
    return numbers.sum()
}

// 확장 함수(Extension Function)
// 상속 없이 메서드만 추가해서 사용가능함 --> 따로 클래스 호출을 하지않고 변수.addExclamation 이렇게 가능
fun String.addExclamation() : String {
    return "$this!"
}

fun main() {
    println(add(1,2))
    println(addInline(2,3))
    greet()
    greet("John")
    println()

    printInfo("John","Doe",30) // 순서 제약
    printInfo(age = 10, lastName = "Doe", firstName = "John") // 순서와 상관없이 삽입

    // 가변 인자 호출
    sum(1,2)
    sum(1,2,3,5,6,7)


    // 문자열의 기본함수만 쓸 수 있는게 아니라, 추가적으로 함수를 등록할 수 있음
    // 외부라이브러리 참조한 클래스의 메서드를 소스코드 안 고치고 추가할 수 있다는 것임
    // HttpClient.get(url : String) { }
    val str = "Hello"
    print(str.addExclamation())
}