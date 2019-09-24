// you can also use imports, for example:
import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    var result = 0
    var totalMax = 0
    for(idx in A.indices) {
        val value = A[idx]
        println(" ")
        print("value:")
        println(value)
        totalMax += value
        print("totalMax:")
        println(totalMax)
        if(result < totalMax) result = totalMax
        // result = max(totalMax, value)
        print("result:")
        println(result)
    }
    return result
}
