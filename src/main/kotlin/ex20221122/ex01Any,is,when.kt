package ex20221122

fun main() {

    // Any : 아무거나 할 수 있는 느낌의 자료형
    // Int, FLoat, String.... 모든 자료형이 될 수 있다.
    //      |생략가능| -> 추론이 가능하므로
    var str1: String = "abc"
    // str1 = "cba" -> O | str1 = 12345678 -> X

    var str2: Any = "abc"
    println(str2)
    str2 = 12345
    // println(str2)
    str2 = 'c' // char

    // Person p1 = new Person
    // p1
    // is Person
    // : 상속관계에서 어디에서 나온 필드 / 메서드 (프로퍼티) 인지
    // 확인하기 위해서! is를 사용한다.

    // is Int -> 정수형자료형이 맞는지 ? 타입 체크
    when(str2){
        is Int -> println("This is Int")
        is String -> println("This is String")
        else -> println("type = ${str2::class.simpleName}")
    }
}