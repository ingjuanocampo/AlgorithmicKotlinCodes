package week_2

import java.util.*

private fun gcdByEuclidsAlgorithm(n1: Long, n2: Long): Long {
    return if (n2 == 0L) {
        n1
    } else gcdByEuclidsAlgorithm(n2, n1 % n2)
}

fun lcmAlgorithm(number1: Long, number2: Long): Long {
    return if (number1 == 0L || number2 == 0L) {
        (number1 + number2)
    } else {
        (number1*number2)/ gcdByEuclidsAlgorithm(number1, number2)
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()

    println(lcmAlgorithm(a, b))
}


