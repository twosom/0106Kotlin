package study.lambda

fun funAdd(x1: Int, x2: Int): Int {
    return x1 + x2
}

fun funAddLambda(body: (Int, Int) -> Int): Int {
    return body(3, 5)
}
//return 되는 데이터의 자료형을 기재하지 않고 ruturn 할 때 return 이라는
//예약어도 사용하지 않음 - 마지막 표현식이 리턴되는 문장.
val lambdaadd = {x1:Int, x2:Int ->
    println("lambdaadd실행")
    x1 + x2 }


fun main() {
    println(funAddLambda(body = {a, b -> a + b}))
    println(lambdaadd(1,2))
    println({x1:Int, x2:Int -> x1+x2}(100, 200))
    println({a:String, b:String ->
        println("람다 함수 호출")
        "$a 와 $b 를 입력하셧습니다."
    }("Somang", "Chansong"))
}