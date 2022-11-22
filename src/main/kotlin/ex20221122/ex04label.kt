package ex20221122

fun main() {

    // label : while 문에 이름을 (라벨)부여해서
    // break 할때 어떤 while 문을 종료시킬껀지 정할 수 있다.
    // continue 도 동일하게 어떤 while 문을 동작시킬껀지 정할 수 있다.

    outer@while(true){
        println("바깥 while 문 작동중...")
        inner@while (true){
            println("안쪽 while 문 작동중...")
            // 어떤 조건을 만족할 경우 바깥 while문까지 종료
            // 기존에 Java 2가지 종료조건이 필요
            break@outer // 근접한 while 문 한 개만 빠져나간다
            //
        }
    }
}