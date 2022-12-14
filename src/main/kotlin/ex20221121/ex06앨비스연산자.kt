package ex20221121

fun main() {

    // 앨비스 연산자 ( ?: ) = Java 삼항연산자
    // NPE 발생을 예방할 수 있도록 NULL 값을 처리 해주는 연산자
    var str: String? = null

    //서버 연결 시 값을 못받을 경우 이용
    print(str?.length ?:"null입니다.")
    var result = str?.length ?: -1
}