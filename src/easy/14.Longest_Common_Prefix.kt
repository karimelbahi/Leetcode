package easy

fun main(args: Array<String>) {

    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("doge", "racecar", "car")))
}

fun longestCommonPrefix(strs: Array<String>): String {

    var prefix = strs[0]
    for (i in 1 until strs.size) {
        prefix = prefix.commonPrefixWith(strs[i])
    }

    return prefix;
}