package week_2

import java.util.*


private fun lastDigitSumFBN(fibonacciTarget: Int): Long {
    val arrayList = ArrayList<Long>()
    arrayList.add(0)
    arrayList.add(1)
    var sum: Long = 0

    for (i: Int in 2..fibonacciTarget) {
        arrayList.add(arrayList[i - 1] + arrayList[i - 2])
        sum += arrayList[i]
    }
    return sum % 10
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val s = lastDigitSumFBN(n)
    println(s)
}