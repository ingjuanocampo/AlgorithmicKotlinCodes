package week_2

import java.util.*
import kotlin.collections.ArrayList

private fun calcFib(fibonacciTarget: Int): Long {
    val arrayList = ArrayList<Long>()
    arrayList.add(0)
    arrayList.add(1)
    for (i : Int in 2..fibonacciTarget) {
        arrayList.add(arrayList[i-1] + arrayList[i-2])
    }
    return arrayList[fibonacciTarget]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    println(calcFib(n))
}


