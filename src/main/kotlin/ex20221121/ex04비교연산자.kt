package ex20221121

fun main() {

    val a: Int = 128
    val b = a
    println(a === b) // true 기본자료형 == 값을 비교함

    // === : 참조값(주소값)이 동일한지 비교하는 연산자

    val c: Int? = a // 참조형 Int heap A1 128 static c A1
    val d: Int? = a // heap A2 128 static d A2
    val e: Int? = c // heap A1 128 static c A1
    println(c == d) // true 값 비교
    println(c === d) // false 주소값 비교
    println(c === e) // true 주소값 비교

}