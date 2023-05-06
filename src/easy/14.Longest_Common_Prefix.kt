package easy

fun main() {

    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("doge", "racecar", "car")))
}

fun longestCommonPrefix(strs: Array<String>): String {

    var prefix = strs[0]
    for (i in 1 until strs.size) {
        prefix = prefix.commonPrefixWith(strs[i])
    }

    return prefix
}

fun longestCommonPrefix(strs:List<String>):String{
    if (strs.isEmpty())  return ""
    var largestPref= strs[0]
    for(i in 1 until strs.size){
        val currentPref=strs[i]
        var commonCharLength=0
        while (commonCharLength < largestPref.length && commonCharLength < currentPref.length
            && largestPref[commonCharLength]==currentPref[commonCharLength] ){
            commonCharLength++
        }
        largestPref=largestPref.substring(0,commonCharLength)
        if (largestPref.isEmpty()) return ""
    }
    return largestPref
}