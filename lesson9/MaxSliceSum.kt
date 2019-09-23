// you can also use imports, for example:
import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    println("")
    //var result = 0
    var slice_max = 0
    var slice_total = 0
    for(i in A.indices) {
        println("")
        slice_total += A[i]
        print("slice_total:")
        println(slice_total)
        slice_max = max(slice_total, slice_max)
        print("slice_max:")
        println(slice_max)
    }
    return slice_max
}