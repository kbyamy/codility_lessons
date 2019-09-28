// 2019-09-28
// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(N: Int): Int {
    // write your code in Kotlin
    var result = 0
    var iterate = 1
    while(iterate <= N) {
        if(N%iterate==0)result++
        iterate++
    }
    return result
}
