package study.kotlin.enumeration


enum class Priority(val no:Int) {
    SOMANG(27), YESONG(25), CHANSONG(19)

}

fun main() {
    var priority: Priority = Priority.SOMANG
    println("이름 : ${priority.name} 값 : ${priority.ordinal}")
    priority = Priority.YESONG
    println("이름 : ${priority.name} 값 : ${priority.ordinal}")
    priority = Priority.CHANSONG
    println("이름 : ${priority.name} 값 : ${priority.ordinal}")

}
