package ex20221122

fun main() {
    // 호출 했을 때 내 이름의 결과값만 가지고 오는 함수!
    getName("주상민")
    println(getName("주상민"))
}

//fun getName(name: String):String {return name}
// {} 안의 코드가 한 줄이면 주괄호랑 return 키워드를 생략 할 수 있다.
// 단, return 키워드 대신 대입연산자 (=) 사용하기
// 반환 하고 있는 데이터를 보고 리턴타입도 추론이 가능
fun getName(name: String):String = name