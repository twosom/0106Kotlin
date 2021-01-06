package study.kotlin.typecast

open class Super {

}
            //상속 받을 때는 상위 클래스 생성자 호출
class Sub : Super() {

}



fun main() {
    var num: Int = 97
    //정수를 Char로 변환

    //var ch: Char = num
    //에러 발생
    var ch: Char = num.toChar()
    println(ch)

    num = ch.toInt()
    println(num)

    //null을 저장 하려면 자료형 뒤에 ?를 붙인다.
    //var msg: Any? = null


    //Any로 문자열 저장
    var msg: Any = "Any"
    //Any 타입을 is로 자료형을 확인하면 자동형번환이 수행됨.
    if (msg is String) {
        println(msg.length)
    }
    //하위 클래스 타입의 인스턴스 참조는 상위 클래스 타입의
    //변수에 형 변환없이 대입 가능  -   업캐스팅
//    var superRef: Super = Sub()

    //상위 클래스 타입의 인스턴스 참조를 하위 클래스 타입의 변수에
    //형 변환없이 대입 불가능
    //var subRef: Sub = Super()

    //강제 형 변환을 해서 대입하면 에러는 아님
    //실행 중 예외가 발생해서 튕김
    //원래 자료형이 Super 이기 때문.
    //var superRef: Sub = Super() as Sub

    //이렇게 대입된 인스턴스의 자료형이Sub 인 경우만 에러가
    //발생하지 않음.

    val superRef: Super = Sub()
    var subRef:Sub = superRef as Sub

    //nullable
    var nullRef: String? = null
    //ullable을 non-null에 대입 불가능
    //강제 형 변환을 통해서 대입
    //데이터가 null 이면 예외 발생

    //as?로 형 변환을 하면 null이면 null을
    //그렇지 않으면 강제 형 변환을 수행.
    var nonnullRef: String? = nullRef as? String
    println(nonnullRef)
}