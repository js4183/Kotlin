package AasicSyntax

fun main() {

    // = (대입연산자) : 값을 할당하는 연산자
    val numOfApple = 12
    // +=, -=..

    // 증가/감소 연산자 - 증감연산자
    var num1 = 10
    var num2 = 10
    var result1 = ++num1
    var result2 = num2++

    // 각각 어떤 값이 출력 될지 예상해보자
    println(result1)
    println(result2)

    println(num1)
    println(num2)

    // >, <, >=, <=
    // == : 주소값(참조값)에 상관없이 값만 같으면 true
    // != : 주소값(참조값)에 상관업이 값이 다르면 true

    // === : 값에 상관없이 주소값(참조값)이 같으면 true
    // !== : 값에 상관업싱 주소값(참조값)이 다르면 true

    val a: Int = 128
    val b = a
    println(a === b)

    val c : Int? = a
    val d : Int? = a
    val e : Int? = c

    println(c)
    println(d)
    println(e)

    println(c == d)
    println(c === d)
    println(c === e)
}