package easy

fun main() {
   println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
    println(lengthOfLastWord("    day"))
    println(lengthOfLastWord("a"))

    println(lengthOfLastWordUsingList("Hello World"))
    println(lengthOfLastWordUsingList("   fly me   to   the moon  "))
    println(lengthOfLastWordUsingList("luffy is still joyboy"))
    println(lengthOfLastWordUsingList("    day"))
    println(lengthOfLastWordUsingList("a"))
}

fun lengthOfLastWord(s: String): Int {
    var counter = 0
    // Trim the input string to remove any leading/trailing spaces
    val trimmed = s.trim()

    for (i in trimmed.length - 1 downTo 0){
        if (trimmed[i] != ' ')
            counter++
        else return counter
      }
    return counter
}

fun lengthOfLastWordUsingList(s: String): Int {
    // Trim the input string to remove any leading/trailing spaces
    val trimmed = s.trim()

    // Split the string into words
    val words = trimmed.split(" ")

    // If there are no words, return 0
    if (words.isEmpty()) {
        return 0
    }

    // Return the length of the last word
    return words.last().length
}