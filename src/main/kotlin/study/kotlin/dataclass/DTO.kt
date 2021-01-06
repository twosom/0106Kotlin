package study.kotlin.dataclass

data class DTO(val num: Int, val name: String)
{
    var address: String = ""
}

fun main() {
    val dto1: DTO = DTO(1, "twoSom")
    println(dto1.toString())
    println(dto1)
    val dto2: DTO = DTO(2, "icloud")

    val dto3: DTO = DTO(1, "twoSom")
    dto3.address="목동"
    val dto4: DTO = dto1


    println("dto1 과 dto2 비교${dto1 == dto2}")
    //hashcode를 비교
    println("dto1 과 dto3 비교 ${dto1 === dto3}")

    println("dto1 과 dto2 비교${dto1.equals(dto3)}")
    println("dto1 과 dto4 비교${dto1 === dto4}")






    val dto11 = DTO(11, "KIMURA")
    val dto12 = DTO(11, "KIMURA")
    //해시코드 출력
    println("dto11:${dto11.hashCode()}")
    println("dto12:${dto12.hashCode()}")

    val dto13 = dto11
    println("dto13:${dto13.hashCode()}")
    dto11.address = "서울시 양천구 목동"
    println(dto11.address)
    //새로운 생성자를 이용해서 만들기 때문에 dto11의 영향을 받지 않음
    println(dto12.address)
    //HashCode를 복사한 거라서 dto11의 영향을 받게 됨
    println(dto13.address)

    //data클래스로 만들면
    //hashCode, equals, toString 그리고 copy 메소드가 만들어짐.
    //hashCode 메소드도 수정되서 PrimaryConstructor 의 매개변수 들의
    //조합으로 해시코드를 생성
    //생성자를 호출할 때 동일한 데이터를 대입하면 실제 메모리 공간은 "따로"
    //생성이 되지만, HashCode는 동일하게 리턴됨.
    //Java 에서는 실제 메모리 영역의 해시코드를 출력할 때는
    //System 클래스의 identityHashcode라는 메소드로 실제 해시코드를
    //리턴합니다.

    //copy는 현재 데이터를 복제를 새로운 공간에 만들어 줌.

    val dto21 = DTO(100, "marwin")
    val dto22 = dto21
    val dto23 = dto21.copy()
    val dto24 = dto21.copy(99)

    //실제 메모리 영역의 해시코드
    println(System.identityHashCode(dto21))
    println(System.identityHashCode(dto22))     //dto21 과 동일
    println(System.identityHashCode(dto23))     //dto21과 다름
    println(System.identityHashCode(dto24))     //dto21과 다름







}
