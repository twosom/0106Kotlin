package study.first_class_citizen


//이 함수는 pure ƒunction
//매개변수의 값이 동일하면 동일한 결과가 리턴
//기존 매개변수의 값을 변경하지 않았음
//결과는 새로 생성해서 리턴
fun func1(first: Int, second: Int): Int {
    return first + second
}

//pure ƒunctino 이 아님
fun func2(n: Int): Int {
    return (Math.random() * n + 1).toInt()
}

//함수는 일급 객체
//변수에 저장이 가능하고 내부에 다른 함수나 클래스를 포함할 수 있음
fun someFunc() {
    println("함수는 이릅 객체")
}



fun main() {
    println(func1(10, 20))
    println(func1(10, 20))

    for (i in 1..99) {
        println(func2(5))
    }


    //변수에 함수를 대입
    val f = ::someFunc
    //변수를 이용해서 함수를 호출할 수 있다.
    f()
}