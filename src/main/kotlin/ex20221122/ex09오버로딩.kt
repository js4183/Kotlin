package ex20221122

// 오버라이딩 : 재정의

fun main(){

    // 오버로딩(OverLoading) : 중복정의
    // 한 클래스 내에서 같은 이름의 메소를 선언
    // 단, 매개변수의 형태가 달라야 한다! ( 매개변수의 데이터타입, 갯수)
    // 생성자, println 문
    setName("스티븐","폴","잡스")

    // 미국인 ( firstName, middleName, lastName)
    // 한국인 ( firstName, lastName)
}
// 미국인 이름 등록하는 setName() 만들기 : 매개변수 3개
fun setName(firstName: String, middleName: String, lastName: String){
    // ex) 스티븐 폴 잡스

}
fun setName(firstName: String, lastName: String){
    // ex) 주 상민
}