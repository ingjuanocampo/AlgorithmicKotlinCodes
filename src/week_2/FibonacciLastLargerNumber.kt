package week_2

import java.util.*
import kotlin.collections.ArrayList


fun calcFib(): ArrayList<Long> {
    val fibonacciListOf60 = ArrayList<Long>()
    fibonacciListOf60.add(0)
    fibonacciListOf60.add(1)
    for (i : Int in 2..59) {
        fibonacciListOf60.add((fibonacciListOf60[i-1] + fibonacciListOf60[i-2])  % 10)
    }
    return fibonacciListOf60
}


fun findLastLargerNumber(n: Long): Long {
    val fibNumber = calcFib()
    return fibNumber[(n % 60L).toInt()]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    println(findLastLargerNumber(n))
}

