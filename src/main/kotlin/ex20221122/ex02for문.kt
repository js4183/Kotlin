package ex20221122

fun main() {

    // Java
    // for( int i =0; i<3; i++){
    //      println(i)
    // }

    // Kotlin     |step 1이 생략|
    // for( i in 0..2 ) {
    //      println(i)
    // }

    // 1 ~ 10 까지 for 문을 사용해서 출력
    for( i in 1..10){
        print("$i ")
    }
    println()
    // 1,3,5,7,9를 for 문을 사용해서 출력
    //  실행 코드가 한 줄이면 {} 생략 가능
    for (i in 1..10 step 2) print("$i ")
    println()
    // ------------------------------------

    // 10~1까지 for 문을 사용해서 출력
    for (i in 10 downTo  1) print("$i ")
    println()
    // 10,8,6,4,2를 for 문을 사용해서 출력
    for (i in 10 downTo 1 step 2) print("$i ")
}