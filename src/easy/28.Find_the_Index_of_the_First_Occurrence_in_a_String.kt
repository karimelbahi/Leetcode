package easy

fun main() {
    println(strStr("sadbutsad","sad"))
    println(strStr("leetcode","leeto"))
    println(strStr("a","a"))
    println(strStr("abc","c"))

    println(strStrBuiltIn("sadbutsad","sad"))
    println(strStrBuiltIn("leetcode","leeto"))
    println(strStrBuiltIn("a","a"))
    println(strStrBuiltIn("abc","c"))
}

fun strStr(haystack: String, needle: String): Int {

    if (haystack.isEmpty() || needle.isEmpty()) return -1
    if (haystack== needle) return 0

    for (chrIndex in 0 until haystack.length - needle.length + 1) {
       if (haystack.subSequence(chrIndex,chrIndex+needle.length) == needle)
           return chrIndex
    }
    return -1
}

fun strStrBuiltIn(haystack: String, needle: String): Int {
    if (haystack.isEmpty() || needle.isEmpty()) return -1
    return haystack.indexOf(needle)
}