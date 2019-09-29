// 2019-09-28
// you can also use imports, for example:
import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(N: Int): Int {
    // write your code in Kotlin
    val factors:MutableList<Int> = mutableListOf()
    val sqrtVal = sqrt(N.toDouble()).toInt()
    var index = 1
    while(index <= sqrtVal) {
        if(N % index == 0) {
            factors.add(index)
            factors.add(N / index)
        }
        index++
    }
    return factors.distinct().size
}
