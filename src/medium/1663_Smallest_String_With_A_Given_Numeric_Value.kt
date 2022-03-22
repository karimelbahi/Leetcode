package medium


fun main() {
    println(getSmallestString(3,27))
    println(getSmallestString(2 ,15))
    println(getSmallestString(5,73))

}

fun getSmallestString(n: Int, k: Int): String {
    val builder = StringBuilder()
    dfs(builder, n, k)
    builder.reverse()
    return builder.toString()
}

private fun dfs(builder: StringBuilder, n: Int, k: Int){
    // to greedily take the "largest" letter possible
    if((k-26) >=  (n - 1)) {
        builder.append('z')
        dfs(builder, n - 1, k - 26)
    }else{
        builder.append(('a' + k - n))
        builder.append("a".repeat(n - 1))
    }
}