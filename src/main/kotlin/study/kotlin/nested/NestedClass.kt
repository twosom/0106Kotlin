package study.kotlin.nested

class Outer {
    var name: String = "noname"


    //클래스 안에 존재하는 클래스라서 Nested Class
    inner class Inner{
        fun method() {
            println("내부 클래스의 메소드~")
            println("${name}")

        }
    }
}

class CompanionOuter {
    companion object static {
        fun method() {
            println("static 메소드 처럼 사용")

        }
    }
}


fun main() {
    //내부 클래스의 인스턴스 만들기
    //inner Class인 경우는 외부 클래스의 인스턴스를 통해서 생성해야 함.
    val innerClass : Outer.Inner = Outer().Inner()
    println(innerClass)
    innerClass.method()

    CompanionOuter.static.method()


}


class AnonymousOuter {
    //내부 익명 클래스
    //외부에서 접근하기  위해서 private 추가...
    //외부에서 접근할 것이 아니라면 private 은 필요 없음.
    private val anonymousClass = object{
        fun innerMethod() {}
    }

    fun outerMethod() {
        anonymousClass.innerMethod()
    }

}