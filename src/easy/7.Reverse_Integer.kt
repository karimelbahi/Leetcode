package easy

fun main(args: Array<String>) {
    println(reverse(1234))
}
fun reverse(num: Int): Int {
    var numString = if (num.toLong() < 0) (num.toLong() * -1).toString() else num.toLong().toString()

    numString = numString.reversed()
    return if (num < 0 && numString.toLong() * -1 > Integer.MIN_VALUE)
        numString.toInt() * -1
    else if (num > 0 && numString.toLong() < Integer.MAX_VALUE)
        numString.toInt()
    else 0

}