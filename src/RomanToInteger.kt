fun main(args: Array<String>) {

    println(romanToInt("III"))
    println(romanToInt("IV"))
    println(romanToInt("IX"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))

}

fun romanToInt(numString: String): Int {
    var keys: MutableMap<String, Int> = HashMap()
    keys["I"] = 1
    keys["V"] = 5
    keys["X"] = 10
    keys["L"] = 50
    keys["C"] = 100
    keys["D"] = 500
    keys["M"] = 1000
    var header = 0
    var sum = 0
//   MCMXCIV
//    println("length ${s.length}")
    while (header < numString.length) {
//        println("${keys["${s[header]}"]}  loop")

        if (header + 1 < numString.length && keys["${numString[header]}"]!! < keys["${numString[header + 1]}"]!!) {
            sum += keys["${numString[header + 1]}"]!! - keys["${numString[header]}"]!!
            header += 2
        } else {
            sum += keys["${numString[header]}"]!!
            header++
        }

    }
//    println(sum)

    return sum
}