package ex20221121

import java.lang.NumberFormatException
import java.util.*
import kotlin.random.Random

fun main() {
    //입력하는 도구 가져오기
    val sc = Scanner(System.`in`)

    // 랜덤한 수를 가져올 수 있는 기능
    // val random = Random()
    val random = Random

    // 1. 랜덤한 두 수를 생성하자
    var num1 = random.nextInt(10)+1 // 1~10 랜덤한 수 생성
    var num2 = random.nextInt(10)+1

    // 2. 랜덤한 두 수를 출력하자
    // int + String ---> X => 같은 자료형이랑 연산 가능
    println("$num1 + $num2 = ?")

    // readLine을 사용하게되면 사용자는 아무 문자/숫자가 입력가능한 상태
    // toInt ---> "1234" 사용자가 무조건 숫자를 입력해야 형변환이 가능

    try {
        val answer = readLine()?.toInt()
    }catch(e: NumberFormatException){
        println("숫자를 입력해주세요! 문자는 입력할 수 없습니다.")
    }

    // 3. 사용자로부터 정답입력 받기
    print("Enter the Answer : ")
    var answer = readLine()?.toInt() ?: -1

    // 4. 사용자가 입력한 정답 == num1 + num2 값 비교
    val result = if (num1+num2==answer) "정답입니다." else "오답입니다."
    println("결과 : $result")

    // Exception 잡는 방법
    // try catch ---> 예외상황

}