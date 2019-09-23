// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    var result = 0
    for (i in A.indices) {
        val buy = A[i]
        val B = A.slice(i+1..A.lastIndex)
        for (n in B.indices) {
            val sell = B[n]
            val profit = sell - buy
            if(result < profit) result = profit
        }
    }
    return result
}
// 2019-09-23