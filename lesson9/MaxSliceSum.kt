// you can also use imports, for example:
import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    var result = -2147483648
    var totalMax = 0
    for((idx, elm) in A.withIndex()) {
        println(" ")
        print("elm:")
        println(elm)
        totalMax += elm
        print("totalMax:")
        println(totalMax)
        totalMax = max(elm, totalMax)
        result = max(result, totalMax)
        print("result:")
        println(result)
    }
    return result
}
// 2019-09-25