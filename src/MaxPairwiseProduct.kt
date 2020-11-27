import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

fun getMaxPairWiseProductFaster(numbers: ArrayList<Int>): Long {
    val maxNumberIndex1 = findMaxNumberIndex(numbers)
    val number1 = numbers[maxNumberIndex1]
    numbers.removeAt(maxNumberIndex1)
    val maxNumberIndex2 = findMaxNumberIndex(numbers)
    val number2 = numbers[maxNumberIndex2]

    return number1.toLong() * number2.toLong()
}

fun findMaxNumberIndex(numbers: ArrayList<Int>): Int {
    var maxNumberIndex = 0
    var tempMax = 0
    numbers.forEachIndexed{ index, number ->
        if (number > tempMax) {
            tempMax = number
            maxNumberIndex = index
        }
    }
    return maxNumberIndex

}


fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val numbers = ArrayList<Int>()
    for (i in 0 until n) {
        numbers.add(scanner.nextInt())
    }
    println(getMaxPairWiseProductFaster(numbers))
}

class FastScanner(stream: InputStream) {
    var br: BufferedReader = BufferedReader(InputStreamReader(stream))
    var st: StringTokenizer? = null

    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) {
            try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt() = next().toInt()
}