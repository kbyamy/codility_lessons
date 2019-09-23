// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    var profit_max = 0
    var buy_min = 200000
    print("buy_min:")
    println(buy_min)
    for (i in A.indices) {
        val buy = A[i]
        print("buy:")
        println(buy)
        val profit = buy - buy_min
        print("profit:")
        println(profit)
        if(profit_max < profit) profit_max = profit
        print("profit_max:")
        println(profit_max)
        if(buy_min > buy) buy_min = buy
        print("buy_min:")
        println(buy_min)
    }
    return profit_max
}
// 2019-09-23