package week_2

import java.util.*



private fun gcdByEuclidsAlgorithm(n1: Int, n2: Int): Int {
    return if (n2 == 0) {
        n1
    } else gcdByEuclidsAlgorithm(n2, n1 % n2)
}


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println(gcdByEuclidsAlgorithm(a, b))
}