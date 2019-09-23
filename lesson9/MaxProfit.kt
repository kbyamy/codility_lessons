// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    var result = 0
//    var buy = 0
//    var sell = 0
    var profit = 0
    for (i in A.indices) {
        val buy = A[i]
        /*
        println("")
        print("i:")
        println(i)
        print("buy:")
        println(buy)
        */
        for (n in A.indices) {
            /*
            print("n:")
            println(n)
            */
            if(n > i) {
                val sell = A[n]
                /*
                print("sell:")
                println(sell)
                */
                profit = sell - buy
                /*
                print("profit:")
                println(profit)
                */
            }
            if(result < profit) result = profit
        }
    }
    return result
}
// 2019-09-08