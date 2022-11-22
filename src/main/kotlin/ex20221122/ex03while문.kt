package ex20221122

import java.util.*

fun main(){

    // while(조건식) {
    // 조건식이 true 일 동안, 실행시킬 코드
    // }
    // 단, 조건식은 무조건 결과값으로 true/false 를 돌려줘야함!

    // ** 팩토리얼 **

    // 1. 입력하는 도구
    // val sc = Scanner(System.`in`)

    // 2. 출력문 + 입력하는 부분
    print("숫자를 입력하세요 : ")
    var num = readLine()?.toInt()

    // 3. 곱하기 결과를 누적시키는 변수 (sum과 같은 역할)
    var sum = 1

    // sum *= num--
    while (num!!>0){
        // if (num != null) {}
        sum *= num
        num--

        // if (number == 1) { break }

    }

    println("결과값 : $sum")
}