package easy

fun main(args: Array<String>) {
    println(isPalindrome(121))
}

fun isPalindrome(num: Int): Boolean {
    if (num.toLong() < 0) return false

    var numString = num.toString()
    return numString.equals(numString.reversed())

}