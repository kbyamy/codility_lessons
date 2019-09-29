// 2019-09-29
// you can also use imports, for example:
import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(N: Int): Int {
    // write your code in Kotlin
    var index  = 1
    var result = 0
    val sqrtVal = sqrt(N.toDouble()).toInt()
    while(index <= sqrtVal) {
        if(N % index == 0) {
            val a = N / index
            val b = N / a
            if(result == 0) {
                result = 2 * (a + b)
            } else {
                result = min(result, 2 * (a + b))
            }
        }
        index++
    }
    return result
}