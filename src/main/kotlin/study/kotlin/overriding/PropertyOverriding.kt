package study.kotlin.overriding

//상위 클래스 만들기. 상속 받으려면 open이라고 써주기

open class PropertySuper {
    open var msg: String = "twosom"

}
                    //상위 클래스의 생성자를 호출해주어야 함
class PropertySub : PropertySuper() {
    //프로퍼티 Overriding
    //오버라이딩 할 때는 앞에 명시적으로 override를 써준다.
    //기능 확장이므로
    //val -> val, var
    //var -> var
    override var msg:String = "two_som"

}