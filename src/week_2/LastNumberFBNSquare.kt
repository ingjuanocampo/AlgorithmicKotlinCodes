package week_2

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val s: Long = getFibonacciSumSquaresNaive(n)
    println(s)
}

fun getFibonacciSumSquaresNaive(fibonacciTarget: Long): Long {
    val arrayList = ArrayList<Long>()
    arrayList.add(0)
    arrayList.add(1)
    var sum: Long = 0

    for (i: Long in 2..fibonacciTarget) {
        arrayList.add(arrayList[(i - 1).toInt()] + arrayList[(i - 2).toInt()])
        sum += arrayList[i.toInt()] * arrayList[i.toInt()]
    }
    return sum % 10
}
